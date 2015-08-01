package com.allala.mail.DAO.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Flags.Flag;

import com.allala.mail.DAO.MailDAO;
import com.allala.Mail;
import com.sun.mail.imap.IMAPFolder;

public class MailDAOImpl implements MailDAO {


	private String hostname;
	private String port;
	private String username;
	private String password;
	private Session session;
	
	
	
	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

		@Override
		public List<Mail> getMail(){
			// TODO Auto-generated method stub
			
			   IMAPFolder folder = null;
		        Store store = null;
		        String subject = null;
		        Flag flag = null;
		        List<Mail> mail = new ArrayList<Mail>();
		        
		        try 
		        {
		          Properties props = System.getProperties();
		          props.setProperty("mail.store.protocol", "imaps");
		          Session session = Session.getDefaultInstance(props, null);
		          store = session.getStore("imaps");
		          store.connect(hostname,username, password);
		          folder = (IMAPFolder) store.getFolder("Inbox"); // This doesn't work for other email account

		          if(!folder.isOpen())
		          folder.open(Folder.READ_WRITE);
		          Message[] messages = folder.getMessages();
		          System.out.println("No of Messages : " + folder.getMessageCount());
		          System.out.println("No of Unread Messages : " + folder.getUnreadMessageCount());
		          System.out.println(messages.length);
		          
		          for (int i=messages.length-1; i>0 ;i--) 
		          {
		            Message msg =  messages[i];
		            Mail mail1 = new Mail();
		            subject = msg.getSubject();
		           
		            mail1.setFrom(msg.getFrom()[0].toString());
		            mail1.setSubject(msg.getSubject());
		            mail1.setEmailid(msg.getAllRecipients()[0].toString());
		            mail1.setDate(msg.getReceivedDate());
		            System.out.println(msg.getContentType());
		           
		            
		            mail.add(mail1);
		          }
		        }
		        catch(Exception e)
		        {
		        	System.out.println("Something went wrong !!");
		        }
		        finally 
		        {
		          if (folder != null && folder.isOpen()) { 
		        	  try {
						folder.close(true);
					} catch (MessagingException e) {
						e.printStackTrace();
					} 
		        	  }
		          if (store != null) { try {
					store.close();
				} catch (MessagingException e) {
					e.printStackTrace();
				} }
		        }

			return mail;
		}

		@Override
		public void sendMail(String from, String subject, String emailbox) {
			// TODO Auto-generated method stub
			
		}
		
		
		@PostConstruct
		public  void InitiateSession(){
		
			/*Properties props = new Properties();
			
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");
			session = session.getInstance(props)*/;
			//session=session.getProperties();
			
			
			Properties props = System.getProperties();
	        props.setProperty("mail.store.protocol", "imaps");
	        Session session = Session.getDefaultInstance(props, null);
			
			
		}
		
@PreDestroy
public void destroysession() 
		{
		
		}
	}

