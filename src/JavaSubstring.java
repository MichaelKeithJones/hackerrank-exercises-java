import java.util.*;

public class JavaSubstring {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String output = input.substring(start, end);
        System.out.println(output);
    }
}