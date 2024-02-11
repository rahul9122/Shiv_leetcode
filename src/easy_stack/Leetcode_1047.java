package easy_stack;

import java.util.Stack;

public class Leetcode_1047 {

    public static void main(String args[]){
        System.out.println(removeDuplicates("abbaca"));
    }

    public static String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stk.isEmpty() && stk.peek()==s.charAt(i)){
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
       return  sb.reverse().toString();

    }
}
