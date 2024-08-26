package Stacks;


import java.util.*;

public class basics {
    public static void main(String[] args) {
//        int [] arr = new int[5];
//        ArrayList<Integer> array = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        System.out.println("the size of the stack is :" +st.size());
        st.push(2);
        st.push(23);
        st.push(5);
        st.push(90);
        System.out.println(st);
        st.pop();
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        System.out.println("the size of the stack is :" +st.size());
        while(st.size() >2){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);

    }
}
