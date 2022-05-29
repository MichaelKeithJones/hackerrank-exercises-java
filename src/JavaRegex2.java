import java.util.*;
import java.util.regex.Pattern;

public class JavaRegex2 {

    public static void main(String [] args) {

        Scanner get = new Scanner(System.in);
        String field = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
        String regex = "(" + field + "\\." + field + "\\." + field + "\\." + field + ")";
        HashMap<String, Boolean> map = new HashMap<>();

        for(int i = 0; i < 6; i++) {
            String input = get.next();
            map.put(input, Pattern.compile(regex).matcher(input).matches());
        }
        for(String key: map.keySet()) { System.out.println(map.get(key)); }
    }
}