/**
 * HackerRank exercise that teaches the purpose and use of
 * a one dimensional array.
 *
 * @author  Michael Jones
 * @version 1.0
 * @since   2022-5-29
 */
package DataStructures.Java1DArray;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int [] a = new int [n];

        for(int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        scan.close();

        Arrays.stream(a).forEach(System.out::println);
    }
}