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

    }
}