package Stacks;
import java.util.*;
public class RemoveConsecutiveSubsequences {
    public static int[] remove(int[] arr){
Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (st.isEmpty() || st.peek() != arr[i]) {
                st.push(arr[i]);

            } else {
                st.pop();
            }
        }
          int[] result = new int[st.size()];
        for (int i = result.length-1; i >=0; i--) {
            result[i] = st.pop();

        }
        return result;


    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int [] res = remove(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]+ " ");

        }
    }
}
