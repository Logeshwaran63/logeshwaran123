import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class CryptographyExample {

    public static void main(String[] args) throws Exception {
        // Generate a secret key.
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        SecretKey secretKey = keyGenerator.generateKey();

        // Create a cipher object.
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");

        // Initialize the cipher for encryption.
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        // Encrypt the message.
        String message = "Hello, world!";
        byte[] encryptedMessage = cipher.doFinal(message.getBytes());

        // Decrypt the message.
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedMessage = cipher.doFinal(encryptedMessage);

        // Print the decrypted message.
        System.out.println(new String(decryptedMessage));
    }
}
