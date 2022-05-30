/**
 * HackerRank exercise that teaches the purpose and use of
 * generics in Java
 *
 * @author  Michael Jones
 * @version 1.0
 * @since   2022-5-30
 */

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;

class Printer {
    public <T> void printArray(T[] a) { Arrays.stream(a).map(e -> e).forEach(System.out::println); }
}

public class JavaGenerics {

    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }

}
