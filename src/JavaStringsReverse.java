import java.util.*;

public class JavaStringsReverse {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String newA = new StringBuilder(A).reverse().toString();
        System.out.println(A.equalsIgnoreCase(newA) ? "Yes" : "No");

    }
}
