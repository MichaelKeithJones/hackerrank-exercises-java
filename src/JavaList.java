import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class JavaList {
    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);

        try {
            int N = Integer.parseInt(get.nextLine());
            ArrayList<Integer> L = new ArrayList<>();
            for (int i = 0; i < N; i++) L.add(get.nextInt());
            get.nextLine();
            int Q =  Integer.parseInt(get.nextLine());
            for (int i = 0; i < Q; i++) {
                String action = get.nextLine();
                switch (action) {
                    case "Insert": {
                        int x = get.nextInt();
                        int y = get.nextInt();
                        get.nextLine();
                        L.add(x, y);
                    }
                    break;
                    case "Delete": {
                        int x = Integer.parseInt(get.nextLine());
                        L.remove(x);
                    }
                    break;
                }
            }
            for (int i : L) System.out.print(i + " ");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
