import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Workspace {

    public static void main (String [] args) {

        List <String> names = new ArrayList<String>(Arrays.asList("Ava", "Aneri", "ALberto"));

        List <String> sorted = names
                .stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sorted);
    }

}
