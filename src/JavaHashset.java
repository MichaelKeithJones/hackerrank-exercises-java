import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaHashset {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Map<String, String> map = new HashMap<>();

        HashSet<String> left = new HashSet<>();
        HashSet<String> right = new HashSet<>();

        left.add(pair_left[0]);
        right.add(pair_right[0]);
        int count = 1;
        for (int i = 1; i < t; i++) {
            if(left.contains(pair_left[i])) {

            }

        }
    }
}
