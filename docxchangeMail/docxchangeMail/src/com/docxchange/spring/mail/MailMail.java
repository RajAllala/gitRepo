package com.docxchange.spring.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;  
import org.springframework.mail.SimpleMailMessage;  
import org.springframework.orm.hibernate4.HibernateTemplate;
   
public class MailMail{  
    private MailSender mailSender;  
    @Autowired
    private HibernateTemplate hTemplate; 
   
    public void setMailSender(MailSender mailSender) {  
        this.mailSender = mailSender;  
    }  
    
    
    public void sendMail(String to) {
    	
    	String sender="bellinfotest@gmail.com";
    	 
        SimpleMailMessage message = new SimpleMailMessage();  
        message.setFrom(sender);  
        message.setTo(to);  
        message.setSubject("Subject");  
        message.setText("Welcome");  
  
        mailSender.send(message);     
    }  
}  

