package easy_stack;

import java.util.Stack;

public class Leetcode_1544 {

    public static void main(String args[]){
        System.out.println(makeGood("leEeetcode"));
    }

    public static String makeGood(String s) {
        Stack<Character> stk = new Stack<>();
        stk.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(!stk.isEmpty()&&Math.abs(s.charAt(i)-stk.peek())==32){
                stk.pop();
            }else{
                stk.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.peek());
            stk.pop();
        }
        return sb.reverse().toString();
    }
}
