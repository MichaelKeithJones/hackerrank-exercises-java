import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class TagContentExtractor {

    public static char type(String line) {
        if(line.charAt(0) == '<') {
            if(line.charAt(1) == '/') return 'c';
            else return 'o';
        } return 's';
    }

    public static void parse(String line) {

        boolean flag = false;
        String openingTag = "";
        String closingTag = "";
        String content = "";

        loop: while (line.length() > 0) {
            switch (type(line)) {
                case 'o': {
                    if(line.indexOf(">") < 0) break loop;
                    openingTag = line.substring(1, line.indexOf(">"));
                    line = line.substring(line.indexOf(">") + 1);
                } break;
                case 'c': {
                    if(line.indexOf(">") < 0) break loop;
                    closingTag = line.substring(2, line.indexOf(">"));
                    if (openingTag.equals(closingTag) && !openingTag.equals("") && !content.equals("")) {
                        flag = true;
                        System.out.println(content);

                    }
                    openingTag = "";
                    content = "";
                    line = line.substring(line.indexOf(">") + 1);
                } break;
                case 's': {
                    if(line.indexOf("<") < 0) break loop;
                    content = line.substring(0, line.indexOf("<"));
                    line = line.substring(line.indexOf("<"));
                } break;
            }
        }
        if(!flag) System.out.println("None");
    }

    public static void main(String[] args){

        parse("<>hello</><h>dim</h>>>>>");

    }
}
