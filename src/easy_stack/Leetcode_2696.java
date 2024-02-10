package easy_stack;

import java.util.Stack;

public class Leetcode_2696 {
//Time - 6.15 sec
    public static void main(String args[]){
        System.out.println(minLength("ABFCACDB"));
    }

    private static int minLength(String str) {
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='B'){
                if(!stk.isEmpty() && stk.peek()=='A'){
                    stk.pop();
                }
                else{
                    stk.push(str.charAt(i));
                }
            }else if(str.charAt(i)=='D'){
                if(!stk.isEmpty() && stk.peek()=='C'){
                    stk.pop();
                }
                else{
                    stk.push(str.charAt(i));
                }
            }else{
                stk.push(str.charAt(i));
            }
        }
        return stk.size();
    }
}
