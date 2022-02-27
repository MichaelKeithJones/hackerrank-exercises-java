package substring.comparisons.exercise;

import java.io.*;
import java.util.*;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        int arrayLength = 0;
        for(int i = 0; i < s.length()-(k-1); i++){ arrayLength++; }
        String [] subStrings = new String[arrayLength];
        for(int i = 0; i < s.length()-(k-1); i++){ subStrings[i] = s.substring(i, i + k); }
        Arrays.sort(subStrings);
        String output = subStrings[0] + "\n" + subStrings[subStrings.length-1];
        return output;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int size = sc.nextInt();
        System.out.println(getSmallestAndLargest(input, size));
    }
}