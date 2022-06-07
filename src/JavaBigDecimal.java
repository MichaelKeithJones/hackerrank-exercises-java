/**
 * HackerRank exercise that teaches the purpose and use of
 * BigDecimal data object
 *
 * @author  Michael Jones
 * @version 1.0
 * @since   2022-6-6
 */

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

class JavaBigDecimal{

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] s = new String[n + 2];
        for(int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        List<String> list = Arrays.asList(s);
        list = list.stream().filter(Objects::nonNull).sorted((o1,o2)-> (new BigDecimal(o2)).compareTo(new BigDecimal(o1))).collect(Collectors.toList());
        list.toArray(s);

        for(int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}