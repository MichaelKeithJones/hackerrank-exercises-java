package DataStructures.JavaSubarray;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);
        final int n = Integer.parseInt(get.nextLine());
        int [] A = new int[n];
        for (int i = 0; i < n; i++) { A[i] = get.nextInt(); }

        int count = 0;
        for(int k = 0; k < n; k++) {
            for (int j = n; j > k; j--) {
                int sum = 0;
                for (int i = k; i < j; i++) {
                    sum += A[i];
                }
                if (sum < 0) count++;
            }
        }
        System.out.println(count);
    }
}
