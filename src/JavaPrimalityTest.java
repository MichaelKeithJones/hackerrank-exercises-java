import java.io.*;
import java.math.*;

import static java.util.stream.Collectors.joining;

public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        BigInteger num = new BigInteger(n);
        System.out.println(num.isProbablePrime(1) ? "prime" : "not prime");

        bufferedReader.close();
    }
}