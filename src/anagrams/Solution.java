package anagrams;

import java.io.*;
import java.util.*;

public class Solution {

    public static String rearrange(String str) {
        List<String> list = Arrays.asList(str.toLowerCase(Locale.ROOT).split(""));
        Collections.sort(list);
        return String.join("", list);
    }

    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        a = rearrange(a);
        b = rearrange(b);
        System.out.println(a.equalsIgnoreCase(b) ? "Anagrams" : "Not Anagrams");
    }
}
