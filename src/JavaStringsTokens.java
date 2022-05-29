import java.util.*;

public class JavaStringsTokens {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        input = input.replace("!", " ");
        input = input.replace(",", " ");
        input = input.replace("?", " ");
        input = input.replace(".", " ");
        input = input.replace("_", " ");
        input = input.replace("'", " ");
        input = input.replace("@", " ");

        String [] output = input.split("\\s+");

        ArrayList<String> aList = new ArrayList<String>(Arrays.asList(output));
        aList.removeIf(b -> (b.length() == 0));
        System.out.println(aList.size());

        for(String token: aList) {
            System.out.println(token);
        }
    }
}