package mail;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
 
public class SendMail {
    public static void main(String[] args) {
        String from = "raj.allala@gmail.com";
        String to = "raj.allala@gmail.com";
        String subject = "Hello";
        String text = "Hello, Again!";
 
        //
        // A props to store example server SMTP information such as the host name and the port
        // number. With this props we create a Session object from which we'll create the
        // Message object.
        //
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "25");
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.starttls.enable","true");
 
        //
        // Enable debugging, print various debugging information to the console.
        //
        props.put("mail.debug", "true");
        Session session = Session.getDefaultInstance(props);
 
        try {
            //
            // Message is a example message to be send through the Transport object. In the
            // Message object we set the sender address and the recipient address. Both of this
            // address is a type of InternetAddress. For the recipient address we can also set
            // the type of recipient, the value can be TO, CC or BCC. In the next two lines we
            // set the email subject and the content text.
            //
            InternetAddress fromAddress = new InternetAddress(from);
            InternetAddress toAddress = new InternetAddress(to);
 
            Message message = new MimeMessage(session);
            message.setFrom(fromAddress);
            message.setRecipient(Message.RecipientType.TO, toAddress);
            message.setSubject(subject);
            message.setText(text);
 
            //
            // Send the message to the recipient. You also need to specify the username and
            // password to authenticate to the mail server.
            //
            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}