package com.mailengine.entities;
import java.io.*;
import java.nio.Buffer;
import java.util.*;

import javax.mail.*;
import javax.mail.search.FlagTerm;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mailengine.DAO.DocumentDAO;
import com.mailengine.DAO.Impl.DocumentDAOImpl;
import com.sun.mail.imap.IMAPFolder;

public class MailRead {
	
	public static void main(String[] args) throws MessagingException,IOException {
		
		ApplicationContext ctx =  new ClassPathXmlApplicationContext("springbeans.xml");
		DocumentDAO documentDAO = (DocumentDAO) ctx.getBean("documentDAOImpl");

		String filename,email;
		String extension = "";
		int len,i,l;
	
		while(true){	
			IMAPFolder folder = null;
			Store store = null;
			
			try {
				Properties props = System.getProperties();
				props.setProperty("mail.store.protocol", "imaps");
				Session session = Session.getDefaultInstance(props, null);
				store = session.getStore("imaps");
				store.connect("imap.googlemail.com", "bellinfotest@gmail.com","bellinfotest09");
				folder = (IMAPFolder) store.getFolder("inbox");

				if (!folder.isOpen())
					folder.open(Folder.READ_WRITE);
				Flags seen = new Flags(Flags.Flag.SEEN);
				FlagTerm unseenFlagTerm = new FlagTerm(seen, false);
				Message[] messages = folder.search(unseenFlagTerm);
				len=messages.length;
				
				for (i=0; i < len; i++) {
					Message msg = messages[i];
					Object content = msg.getContent();
					
					if (content instanceof Multipart) {						
						Multipart multipart = (Multipart) msg.getContent();
						
						email = msg.getFrom()[i].toString();
						
						
						for (int n = 0; n < multipart.getCount(); n++) {							
							Part part = multipart.getBodyPart(n);
							filename = part.getFileName();
							
							if(!Part.ATTACHMENT.equalsIgnoreCase(part.getDisposition()) &&
						               !StringUtils.isNotBlank(filename)) {
								folder.setFlags(new Message[] {msg}, new Flags(Flags.Flag.SEEN), true);
						      continue; 
						    }
							

							l = filename.lastIndexOf('.');
							if (l > 0) {
							    extension = filename.substring(l+1);
							}
							
							InputStream stream = part.getInputStream();
						    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
						    
							int nRead;
							byte[] data = new byte[4096];
							while ((nRead = stream.read(data, 0, data.length)) != -1) {
								buffer.write(data, 0, nRead);
							}
							buffer.flush();							
							byte[] b = buffer.toByteArray();
							
							folder.setFlags(new Message[] {msg}, new Flags(Flags.Flag.SEEN), true);
							
							if(documentDAO.verifyUser(email.substring((email.indexOf("<")+1),email.indexOf(">")))==true){
		
							documentDAO.persistDocument(b, filename, msg.getFrom()[i].toString(), msg.getReceivedDate(), extension, msg.getSize());
							}
							
						}
					}
				  }	
				}
		
			catch (Exception e) {
				e.printStackTrace();
			}

			finally {
				if (folder != null && folder.isOpen()) {
					try {
						folder.close(true);
					} catch (MessagingException e) {
						e.printStackTrace();
					}
				}
				if (store != null) {
					try {
						store.close();
					} catch (MessagingException e) {
						e.printStackTrace();
					}
				}
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
			
		}

}
