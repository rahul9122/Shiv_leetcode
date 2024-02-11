package easy_stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Leetcode_496 {

    public static void main(String args[]){
        System.out.print(nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2}));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Stack<Integer> stk = new Stack<>();
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            while(!stk.isEmpty() && nums2[stk.peek()] < nums2[i]){
                mp.put(nums2[stk.peek()], nums2[i]);
                stk.pop();
            }
            stk.push(i);
        }
        for(int i=0;i<nums1.length;i++){
            if(mp.containsKey(nums1[i])){
                res[i]= mp.get(nums1[i]);
            }else{
                res[i]= -1;
            }
        }
        return res;
    }
}
