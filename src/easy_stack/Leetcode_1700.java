package easy_stack;

public class Leetcode_1700 {

    public static void main(String args[]){
        System.out.println(countStudents(new int[]{1,1,1,0,0,1}, new int[]{1,0,0,0,1,1}));
    }

    public static int countStudents(int[] students, int[] sandwiches) {
        int one =0;
        int zero = 0;
        for(Integer student: students){
            if(student == 1){
                one++;
                continue;
            }
            zero++;
        }
        int count =sandwiches.length;
        for(Integer sandwitch: sandwiches){
            if(sandwitch == 1 && one > 0){
                one--;
                count--;
            }
            else if(sandwitch == 0 && zero > 0){
                zero--;
                count--;
            }
            else{
                return count;
            }

        }
        return 0;
    }
}
