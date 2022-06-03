import java.util.*;

public class Workspace {

    public int solution(int N) {

        List<String> bits = new ArrayList<>(Arrays.asList(Integer.toBinaryString(N).split( "" )));

        int count = 0;
        int highest = 0;

        for(String bit:bits) {
            if (Integer.parseInt(bit) == 1) {
                if(count > highest) highest = count;
                count = 0;
            } else count++;
        }
        return highest;
    }

    public static void main (String [] args) {

        Workspace workspace = new Workspace();
//        List <String> names = new ArrayList<String>(Arrays.asList("Ava", "Aneri", "ALberto"));
//
//        List <String> sorted = names
//                .stream()
//                .sorted()
//                .collect(Collectors.toList());
//
//        System.out.println(sorted);

        System.out.println("solution() = " + workspace.solution(32));

    }

}
