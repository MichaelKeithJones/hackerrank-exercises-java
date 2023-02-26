package DataStructures.JavaStack;

import java.util.*;
class Solution{

    public static void process(String input) {

        List<String> symbols = Arrays.asList(input.split(""));
        Stack<String> stack = new Stack<>();

        HashMap<String, String> symbolPairs = new HashMap<String, String>();
        symbolPairs.put("}","{");
        symbolPairs.put(")","(");
        symbolPairs.put("]","[");

        for(String symbol: symbols) {
            if (!stack.empty() && stack.peek().equals(symbolPairs.get(symbol))) stack.pop();
            else stack.push(symbol);
        }
        System.out.println(stack.empty());
    }

    public static void main(String []argh)
    {
        Scanner get = new Scanner(System.in);

        while (get.hasNext()) {
            String input = get.next();
            process(input);
        }

    }
}
