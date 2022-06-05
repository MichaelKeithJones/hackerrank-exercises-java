import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Workspace {

    public static void parse(String input) {
        String regex = "<([a-zA-z].*?)>\\w*[^<>]+\\w*<\\/\\1>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        String match = "";
        while(matcher.find()) {
            match = matcher.group();
            int start = match.indexOf(">") + 1;
            int end = match.indexOf("<", start);
            System.out.println(match.substring(start , end));
        }
        if (match.equals("")) System.out.println("None");
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            parse(line);
            testCases--;
        }

    }

}