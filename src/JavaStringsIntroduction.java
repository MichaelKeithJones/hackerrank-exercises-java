import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        //--| Sum the lengths of A and B.
            int sumOfLengths = A.length() + B.length();
            System.out.println(sumOfLengths);
        //--| Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
            if (B.compareTo(A) < 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        //--| Capitalize the first letter in A and B and print them on a single line, separated by a space.
            String aCapitalize = A.substring(0, 1).toUpperCase() + A.substring(1);
            String bCapitalize = B.substring(0, 1).toUpperCase() + B.substring(1);
            String combinedString = aCapitalize + " " + bCapitalize;
            System.out.println(combinedString);
    }
}
