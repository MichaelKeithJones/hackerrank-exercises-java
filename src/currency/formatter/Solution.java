package currency.formatter;

import java.io.*;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.*;

public class Solution {

    public static void main(String [] args) {

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        Locale inLocale = new Locale("en", "IN");
        DecimalFormatSymbols indiaDFS = new DecimalFormatSymbols();
        NumberFormat india = NumberFormat.getInstance(inLocale);
        india.setMaximumFractionDigits(2);

        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();

        System.out.printf("US: %s%n", us.format(payment));
        System.out.printf("India: Rs.%s%n", india.format(payment));
        System.out.printf("China: %s%n", china.format(payment));
        System.out.printf("France: %s%n", france.format(payment));

        //--| Solution on HackerRank
        //--| Note: Had to run the below Java 8 version to get it to work on HackerRank

        //    import java.io.*;
        //    import java.util.*;
        //    import java.text.*;
        //    import java.math.*;
        //    import java.util.regex.*;
        //
        //    public class Solution {
        //
        //        public static void main(String[] args) {
        //            Scanner scanner = new Scanner(System.in);
        //            double payment = scanner.nextDouble();
        //            scanner.close();
        //
        //            String us = NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(payment);
        //            String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        //            String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        //            String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        //
        //            System.out.println("US: " + us);
        //            System.out.println("India: " + india);
        //            System.out.println("China: " + china);
        //            System.out.println("France: " + france);
        //        }
        //    }
    }
}