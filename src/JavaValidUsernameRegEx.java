/**
 * HackerRank exercise that teaches the purpose and use of
 * regex to valid input strings. In this case, usernames.
 *
 * @author  Michael Jones
 * @version 1.0
 * @since   2022-5-31
 */
import java.util.Scanner;

class UsernameValidator {

    //--| [a-zA-Z] --> Means 1 Character of a-Z upper or lower case.
    //--| \w{7,29} --> Means all word characters && occur 7 to 29 times.
    public static final String regularExpression = "[a-zA-Z]\\w{7,29}";

}

public class JavaValidUsernameRegEx {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }

}
