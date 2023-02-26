package DataStructures.JavaDequeue;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        Set<Integer> set = new HashSet<>();

        int highest = 0;
        int unique = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deque.add(num);
            set.add(num);

            if(deque.size() == m) {
                unique = set.size();
                if(unique > highest) highest = unique;

                int top = (Integer) deque.pop();
                if(!deque.contains(top)) set.remove(top);
            }
        }
        System.out.println(highest);
    }
}

/*
*  DataStructures.JavaList.DataStructures.JavaMap.DataStructures.JavaStack.DataStructures.JavaDequeue.DataStructures.JavaBitSet.Solution 1 - Too Slow
* --------------------------------------------------
        long highest = 0;
        for (int i = 0; i < n; i++) {
            deque.add(in.nextInt());
            if(deque.size() == m) {
                long unique = deque.stream().distinct().count();
                if (unique > highest) highest = unique;
                deque.pop();
            }
        }
* --------------------------------------------------
*/

/*
*  DataStructures.JavaList.DataStructures.JavaMap.DataStructures.JavaStack.DataStructures.JavaDequeue.DataStructures.JavaBitSet.Solution 2 - Too Slow
* --------------------------------------------------
        long highest = 0;
        long unique = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            deque.add(in.nextInt());
            if(deque.size() == m) {
                set.clear();
                set.addAll(deque);
                unique = set.size();
                if (unique > highest) highest = unique;
                deque.pop();
            }
        }
* --------------------------------------------------
*/