package DataStructures.JavaComparator;

import java.util.*;

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName () {return name;}
    public int getScore () {return score;}
}


public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.stream(player).sorted(Comparator.comparingInt(Player::getScore).reversed().thenComparing(Player::getName)).forEach(e -> System.out.println(e.name + " " + e.score));

    }
}
