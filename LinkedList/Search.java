package LinkedList;

public class Search {

    static int search(int[] arr , int target){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,3,5,7,6};
        System.out.println(search(arr,51));
        System.out.println(search(arr,6));

    }
}
