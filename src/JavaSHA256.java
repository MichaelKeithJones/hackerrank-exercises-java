import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * HackerRank exercise that teaches the purpose and use of
 * SHA-256 cryptography
 *
 * @author  Michael Jones
 * @version 1.0
 * @since   2022-6-6
 */

public class JavaSHA256 {

    public static void main(String[] args)  {

        try {
            Scanner get = new Scanner(System.in);
            String input = get.nextLine();

            byte[] hash = MessageDigest.getInstance("SHA-256").digest(input.getBytes(StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder();
            for (byte i : hash) hexString.append(String.format("%02x", i));

            System.out.println(hexString.toString());
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Didn't work");
        }

    }

}
