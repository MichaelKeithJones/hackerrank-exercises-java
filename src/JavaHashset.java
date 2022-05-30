/**
 * HackerRank exercise that teaches the purpose and use of
 * a HashSet data Structure.
 *
 * @author  Michael Jones
 * @version 1.0
 * @since   2022-5-30
 */

import java.util.*;

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

        int count = 0;

        /*
        * Chose to use a Hashmap with a Hashset nested.
        * Hashmaps do not allow repeated keys, Hashsets do not allow repeated values.
        * Combining the 2 ignored ed all possible repeats in this exercise.
        */
        Map<String, HashSet<String>> map = new HashMap<>();
        map.put(pair_left[0], new HashSet<String>());
        map.get(pair_left[0]).add(pair_right[0]);
        count++;
        System.out.println(count);
        for (int i = 1; i < t; i++) {
            if (map.containsKey(pair_left[i])) {
                if (map.get(pair_left[i]).add(pair_right[i])) count++;
            } else {
                map.put(pair_left[i], new HashSet<String>());
                map.get(pair_left[i]).add(pair_right[i]);
                count++;
            }
            System.out.println(count);
        }

    }
}
