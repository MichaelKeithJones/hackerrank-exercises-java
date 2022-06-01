/**
 * HackerRank exercise that teaches the purpose and use of
 * exception handling using try-catch
 *
 * @author  Michael Jones
 * @version 1.0
 * @since   2022-5-31
 */

import java.util.*;

public class JavaTryCatch {

    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);

        try {
            int x = get.nextInt();
            int y = get.nextInt();

            System.out.println(x/y);
        } catch (InputMismatchException exception) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException exception) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }

    }

}
