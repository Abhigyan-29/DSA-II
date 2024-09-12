package P_WALLAH;
import java.util.*;
import java.lang.reflect.Array;

public class Reverse_Array {
    static void reverse(int[] arr){
        int[] rev =new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
                rev[j] = arr[i];
        }
        System.out.println(Arrays.toString(rev));
    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);

    }
}
