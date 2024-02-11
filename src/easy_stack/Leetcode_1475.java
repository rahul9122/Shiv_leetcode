package easy_stack;

import java.util.Stack;

public class Leetcode_1475 {

    public static void main(String args[]){
        System.out.println(new int[]{8,4,6,2,3});
    }


    public static int[] finalPrices(int[] prices) {
        Stack<Integer> stk = new Stack<>();
        stk.push(0);
        for(int i=1;i<prices.length;i++){
            while(!stk.isEmpty() && prices[stk.peek()]>= prices[i]){
                prices[stk.peek()]-= prices[i];
                stk.pop();
            }
            stk.push(i);
        }
        return prices;
    }
}
