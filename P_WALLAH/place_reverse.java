package P_WALLAH;

import java.util.Arrays;

public class place_reverse {
    static void swapin(int[] arr , int i,int j){
        int temp = arr[i];
                arr[i] = arr[j];
        arr[j] = temp;
    }
    static void swap(int[] arr){

        int i = 0 , j =arr.length-1;
        while(i<j){
            swapin(arr,i,j);
            i++;
            j--;

        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
     swap(arr);
    }
}
