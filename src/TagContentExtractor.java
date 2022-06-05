/**
 * HackerRank exercise that teaches how parsing works within an editor or IDE.
 *
 * @author  Michael Jones
 * @version 1.0
 * @since   2022-06-04
 */

import java.util.*;


public class TagContentExtractor {

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
