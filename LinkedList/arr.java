package LinkedList;

import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
        int[] ans = sort();
        System.out.println(Arrays.toString(ans));

    }
    public static int[] sort(){
        int[] arr = {4,5,2,8,1};
      Arrays.sort(arr);
      return arr;
    }
}
