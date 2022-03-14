import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {

    public static void main(String [] args) {

        Scanner get = new Scanner(System.in);

        int rows = get.nextInt();
        ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>(5);
        ArrayList<Integer> list = new ArrayList<>();

        for(int j = 0; j < rows; j++) {
            int col = get.nextInt();
            for (int i = 0; i < col; i++) {
                list.add(get.nextInt());
            }

            lists.add(list);
            list = new ArrayList<Integer>();
        }

        String output = "";
        rows = get.nextInt();
        for(int j = 0; j < rows; j++) {
            int row = get.nextInt();
            int col = get.nextInt();
            if (row <= lists.size() && col <= lists.get(row-1).size()) {
                output += lists.get(row-1).get(col-1) + "\n";
            } else {
                output += "ERROR!\n";
            }
        }

        System.out.println(output);
    }

}
