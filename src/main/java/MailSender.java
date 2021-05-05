import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailSender {
    public void send(String message) throws MessagingException {
        Address[] emails = new Address[]{new InternetAddress("polley23@gmail.com"), new InternetAddress("polleyasis@gmail.com")};
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
        javaMailSender.setHost("smtp.gmail.com");
        javaMailSender.setPort(587);
        javaMailSender.setUsername("your mail");
        javaMailSender.setPassword("mail app passowrd from 2factor auth");
        Properties properties = new Properties();
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.debug", "true");
        javaMailSender.setJavaMailProperties(properties);
        MimeMessage mailMessage = javaMailSender.createMimeMessage();
        mailMessage.setSubject("Vaccination Alert", "UTF-8");
        MimeMessageHelper helper = new MimeMessageHelper(mailMessage, true, "UTF-8");
        helper.setFrom("geekstutorialemail2020@gmail.com");
        helper.setText(message, true);
        mailMessage.addRecipients(Message.RecipientType.TO, emails);
        javaMailSender.send(mailMessage);
    }
}
