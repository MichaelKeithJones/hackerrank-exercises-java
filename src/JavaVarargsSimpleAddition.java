/**
 * HackerRank exercise that teaches the purpose and use of
 * vararg or variable length parameter list.
 *
 * @author  Michael Jones
 * @version 1.0
 * @since   2022-6-3
 */


import java.io.*;
import java.lang.reflect.*;
import java.util.*;;
import java.util.stream.IntStream;

class Add {

    public void add (int... operands) {
        int sum = IntStream.of(operands).sum();
        System.out.print(operands[0]);
        for(int i = 1; i < operands.length; i++) System.out.print("+" + operands[i]);
        System.out.println("="+sum);
    }

}

public class JavaVarargsSimpleAddition {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            int n6 = Integer.parseInt(br.readLine());
            Add ob = new Add();
            ob.add(n1, n2);
            ob.add(n1, n2, n3);
            ob.add(n1, n2, n3, n4, n5);
            ob.add(n1, n2, n3, n4, n5, n6);
            Method[] methods = Add.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i = 0; i<methods.length; i++) {
                if(set.contains(methods[i].getName())) {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());
            }
            if(overload) {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

}
