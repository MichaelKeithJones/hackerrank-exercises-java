package DataStructures.JavaMap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        try {
            Map<String, Integer> map = new HashMap<>();

            BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(b.readLine());             // Number of Entries

            for (int i = 0; i < n; i++) {
                String name = b.readLine();                     // Name
                int phone = Integer.parseInt(b.readLine());     // Phone Number
                map.put(name, phone);
            }

            String query;
            while (!(query = b.readLine().trim()).isEmpty()) {
                if (map.containsKey(query)) {
                    System.out.println(query + "=" + map.get(query));
                } else {
                    System.out.println("Not found");
                }
            }

            b.close();
        } catch (Exception e) {
            //System.out.println(e);
        }
    }

}
