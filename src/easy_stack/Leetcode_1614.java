package easy_stack;

import java.util.Stack;

public class Leetcode_1614 {
    public static void main(String args[]){
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
    }

    public static int maxDepth(String str) {
        Stack<Character> stk = new Stack<>();
        int ma=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(') {
                stk.push('(');
                ma= Math.max(stk.size(),ma);
            }else if(str.charAt(i)==')'){
                stk.pop();
            }
        }
        return ma;
    }
}
