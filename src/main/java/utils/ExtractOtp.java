package utils;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractOtp {
    public static void main(String[] args) {

        String host = "imap.gmail.com"; // IMAP server
        String username = "tanvirhmitul96@gmail.com"; // Your email
        String password = "thdo tyua mdhy ugme"; // Your email password

        Properties properties = new Properties();
        properties.put("mail.imap.ssl.enable", "true"); // Use SSL
        properties.put("mail.imap.auth.plain.disable", "true"); // Disable plain auth
        properties.put("mail.imap.starttls.enable", "true"); // Use STARTTLS
        properties.put("mail.imap.host", host);
        properties.put("mail.imap.port", "993");

        try {
            // Create a session
            Session session = Session.getInstance(properties);
            Store store = session.getStore("imap");
            store.connect(username, password);


            Folder inbox = store.getFolder("INBOX");
        inbox.open(Folder.READ_ONLY);

        // Get messages
        Message[] messages = inbox.getMessages();
        for (Message message : messages) {
            if (message.getFrom()[0].toString().equals("tanvirhmitul97@gmail.com")) {
                String content = message.getContent().toString();
                System.out.println("Email content: " + content);

                // Extract OTP (assuming it's a 6-digit number in the email)
                String otp = extractOTP(content);
                System.out.println("Extracted OTP: " + otp);
            }
        }

        inbox.close(false);
        store.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    private static String extractOTP(String content) {
        // Simple regex to find a 6-digit number
        String otpRegex = "\\b\\d{6}\\b";
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(otpRegex);
        java.util.regex.Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
}
    }







