package easy_stack;

import java.util.Stack;

public class Leetcode_844 {
    public static void main(String args[]){
        System.out.println(backspaceCompare("y#fo##f","y#f#o##f"));
    }


    public static StringBuilder generateText(String s){
        StringBuilder sb = new StringBuilder();
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!stk.isEmpty() &&  ch == '#'){
                stk.pop();
            }else{
                stk.push(ch);
            }
        }
        while(!stk.isEmpty() && stk.peek()!='#'){
           sb.append(stk.peek());
           stk.pop();
        }
        return sb.reverse();
    }
    public static boolean backspaceCompare(String s, String t) {
        StringBuilder sbs = generateText(s);
        StringBuilder sbt = generateText(t);
        if(sbs.toString().equals(sbt.toString())){
            return true;
        }
        return false;

    }
}
