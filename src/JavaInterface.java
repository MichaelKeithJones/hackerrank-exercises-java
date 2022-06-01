/**
 * HackerRank exercise that teaches the purpose and use of
 * Interfaces classes.
 *
 * @author  Michael Jones
 * @version 1.0
 * @since   2022-5-31
 */

import java.util.*;
import java.util.stream.IntStream;

interface AdvancedArithmetic{
    int divisor_sum(int n);
}

class MyCalculator1 implements AdvancedArithmetic{

    public int divisor_sum(int n) {
        return IntStream.range(1, n + 1).filter(e -> n % e == 0).sum();
    }

}

public class JavaInterface {

    public static void main(String []args){
        MyCalculator1 my_calculator = new MyCalculator1();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }

    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }

}
