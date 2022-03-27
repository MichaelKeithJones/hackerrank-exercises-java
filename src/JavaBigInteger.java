import java.math.BigInteger;
import java.util.*;

public class JavaBigInteger {

    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);
        String tempA = get.nextLine();
        String tempB = get.nextLine();

        BigInteger a = new BigInteger(tempA);
        BigInteger b = new BigInteger(tempB);

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}