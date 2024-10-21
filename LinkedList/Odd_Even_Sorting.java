package LinkedList;

import java.util.Arrays;

public class Odd_Even_Sorting {
    static void sort(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            if(arr[start] % 2 == 1 && arr[end] % 2 == 0){
                swap(arr,start , end);
                start++;
                end--;
            }
            if(arr[start] % 2 == 0){
                start++;
            }
            if(arr[end] % 2 == 1){
                end--;
            }
        }


    }
    static void swap(int[] arr ,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,2,7,3,8,9,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
