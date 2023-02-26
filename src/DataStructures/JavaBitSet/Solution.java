package DataStructures.JavaBitSet; /**
 * HackerRank exercise that teaches the purpose and use of
 * BitSets in Java
 *
 * @author  Michael Jones
 * @version 1.0
 * @since   2022-5-30
 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {


        BitSet [] b = new BitSet[3];
        b[1] = new BitSet();
        b[2] = new BitSet();
        int n, m;

        Scanner get = new Scanner(System.in);
        n = get.nextInt();
        m = get.nextInt();

        String operation;
        int index1, index2;

        for(int i = 0; i < m; i++) {
            operation = get.next();
            index1 = get.nextInt();
            index2 = get.nextInt();

            switch(operation) {
                case "AND": {
                    b[index1].and(b[index2]);
                    System.out.println(b[1].cardinality() + " " + b[2].cardinality());
                } break;
                case "SET": {
                    b[index1].set(index2);
                    System.out.println(b[1].cardinality() + " " + b[2].cardinality());
                } break;
                case "FLIP": {
                    b[index1].flip(index2);
                    System.out.println(b[1].cardinality() + " " + b[2].cardinality());
                } break;
                case "OR": {
                    b[index1].or(b[index2]);
                    System.out.println(b[1].cardinality() + " " + b[2].cardinality());
                } break;
                case "XOR": {
                    b[index1].xor(b[index2]);
                    System.out.println(b[1].cardinality() + " " + b[2].cardinality());
                } break;
                default: break;
            }
        }

    }

}