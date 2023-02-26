/**
 * HackerRank exercise that teaches how parsing works within an editor or IDE.
 *
 * @author  Michael Jones
 * @version 1.0
 * @since   2022-06-04
 */

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TagContentExtractor {

    //-------------------------------------------------------|
    //--| Faster but uglier DataStructures.JavaList.DataStructures.JavaMap.DataStructures.JavaStack.DataStructures.JavaDequeue.DataStructures.JavaBitSet.Solution 1.
    //-------------------------------------------------------|
    public static char type(String line) {
        if(line.length() < 2) return 'e';
        if(line.charAt(0) == '<') {
            if(line.charAt(1) == '/') return 'c';
            else return 'o';
        } return 's';
    }

    public static void parse(String line) {
        if(line.length() < 8) {
            System.out.println("None");
            return;
        }

        boolean flag = false;
        String openingTag = "";
        String string = "";
        String closingTag = "";

        loop: while (line.length() > 0) {
            switch (type(line)) {
                case 'o': {
                    string = "";
                    if(!line.contains(">")) break loop;

                    openingTag = line.substring(1, line.indexOf(">"));
                    line = line.substring(line.indexOf(">") + 1);
                } break;
                case 's': {
                    if(!line.contains("<")) break loop;

                    string = line.substring(0, line.indexOf("<"));
                    line = line.substring(line.indexOf("<"));

                    if(openingTag.equals("")) string = "";
                } break;
                case 'c': {
                    if(!line.contains(">")) break loop;

                    closingTag = line.substring(2, line.indexOf(">"));
                    line = line.substring(line.indexOf(">") + 1);

                    if (openingTag.equals(closingTag) && !openingTag.equals("") && !string.equals("")) {
                        flag = true;
                        System.out.println(string);
                    }
                    openingTag = "";
                    string = "";
                } break;
                default: break loop;
            }
        }
        if(!flag) System.out.println("None");
    }

    //-------------------------------------------------------|
    //--| Slower, more readable and elegant DataStructures.JavaList.DataStructures.JavaMap.DataStructures.JavaStack.DataStructures.JavaDequeue.DataStructures.JavaBitSet.Solution 2.
    //-------------------------------------------------------|
    /*
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
    */

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
