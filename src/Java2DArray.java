import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Java2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int highest = 0;
        for(int i = 1; i < 5; i++) { // Col
            int sum = 0;
            for (int j = 1; j < 5; j++) { // Row
                int topLeft = arr.get(i - 1).get(j - 1);
                int topCenter = arr.get(i - 1).get(j);
                int topRight = arr.get(i - 1).get(j + 1);
                int center = arr.get(i).get(j);
                int bottomLeft = arr.get(i + 1).get(j - 1);
                int bottomCenter = arr.get(i + 1).get(j);
                int bottomRight = arr.get(i +  1).get(j + 1);
                sum = topLeft + topCenter + topRight + center + bottomLeft + bottomCenter + bottomRight;
                if (i == 1 && j == 1) highest = sum;
                else if (sum > highest) highest = sum;

            }
        }
        System.out.println(highest);

        bufferedReader.close();
    }
}
