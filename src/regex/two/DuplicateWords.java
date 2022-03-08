//--| Got correct. Works in java 8. Refuses to actually show correct.

package regex.two;

import java.util.Scanner;
import java.util.regex.*;

public class DuplicateWords {

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
                input = input.replaceAll(input.substring(m.start(), m.end()), input.substring(m.start(), m.end()).substring(0, input.substring(m.start(), m.end()).indexOf(' ')));
                m = p.matcher(input);
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}
