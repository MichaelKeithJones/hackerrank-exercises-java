package pattern.syntax.checker;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numTestCases = scan.nextInt();
        scan.nextLine();

        String result = "";
        for(int i = 0; i < numTestCases; i++) {
            try {
                String regexPattern = scan.nextLine();
                Pattern.compile(regexPattern);
                result += "Valid\n";
            } catch (PatternSyntaxException exception) {
                result += "Invalid\n";
            }
        }
        System.out.println(result);
    }
}