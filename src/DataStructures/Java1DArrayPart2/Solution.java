package DataStructures.Java1DArrayPart2; /**
 * HackerRank exercise that teaches the purpose and use of
 * a one dimensional array (Part 2).
 *
 * @author  Michael Jones
 * @version 1.0
 * @since   2023-2-26
 */

import java.util.*;
import java.util.stream.Stream;

public class Solution {

    /**
     * The method checks if moving forward will result in a dead loop of one forward - one backward
     *
     * @param position  The current starting position of the placeholder
     * @param leap      The distance the placeholder can leap
     * @param game      The entire "obstacle" path for the placeholder
     * @return          Returns true if it's worth moving forward, false otherwise
     */
    public static boolean deadPosForward(int position, int leap, int [] game) {
        if (position + leap >= game.length || position + 1 >= game.length) return false;
        return (game[position + 1] == 1 && game[position + leap] == 1);
    }

    /**
     * The method checks if moving backwards will result in a dead loop of one backward - one forward
     *
     * @param position  The current starting position of the placeholder
     * @param leap      The distance the placeholder can leap
     * @param game      The entire "obstacle" path for the placeholder
     * @return          Returns true if it's worth moving backward, false otherwise
     */
    public static boolean deadPosBackward(int position, int leap, int [] game) {
        if (position + leap >= game.length  || position - 1 <= 0) return false;
        return (position > 0 && game[position - 1] == 1 && game[position + leap] == 1);
    }

    /**
     * The recursive method test every possible path until the end or until a true result is caught
     * and returned to the original call
     *
     * @param position
     * @param leap
     * @param game
     * @return
     */
    public static boolean canWin(int position, int leap, int [] game) {
        final int n = game.length;

        if (game[position] == 2) return false;
        if (position == n - 1 || position + leap >= n) return true;
        if (leap != 0 && game[position + leap] == 0 && canWin(position + leap, leap, game)) return true;
        if (!deadPosForward(position + 1, leap, game) && game[position + 1] == 0 && canWin(position + 1, leap, game)) return true;
        if (!deadPosBackward(position - 1, leap, game) && position != 0 && game[position - 1] == 0) {
            game[position] = 2;
            return canWin(position - 1, leap, game);
        }

        game[position] = 2;
        return false;
    }

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int q = Integer.parseInt(get.nextLine());

        String[] output = new String[q];
        for (int i = 0; i < q; i++) {
            String[] input = get.nextLine().split(" ");
            int leap = Integer.parseInt(input[1]);
            int[] game = Stream.of(get.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (canWin(0, leap, game)) output[i] = "YES";
            else output[i] = "NO";
        }

        Arrays.stream(output).forEach(System.out::println);

        get.close();
    }
}
