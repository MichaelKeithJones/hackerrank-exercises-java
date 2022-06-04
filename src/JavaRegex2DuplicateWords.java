/**
 * HackerRank exercise that teaches the purpose and use of
 * Regex, Matcher and Pattern
 *
 * @author  Michael Jones
 * @version 1.0
 * @since   2022-5-29
 */

//--| Got correct. Works in java 8. Refuses to actually show correct.
//--| Edit: It didn't work because I wasn't supposed to change or add more than what was originally commented.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex2DuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group().substring(0, m.group().indexOf(" ")));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}
