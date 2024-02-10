package easy_stack;

public class Leetcode_1598 {
    public static void main(String args[]) {
        System.out.println(minOperations(new String[]{"d1/","d2/","../","d21/","./"}));
    }


    public static int minOperations(String[] logs) {
        int count = 0;
        for (String str : logs) {
            if (str.charAt(0) == '.') {
                if (str.charAt(1) != '/') {
                    count--;
                }
            } else {
                count++;
            }
        }
        return count;
    }

}
