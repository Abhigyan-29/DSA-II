package Stacks;

import java.util.Stack;

public class UnderFlowOverFlow {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        //empty stack se pop krna is stack underflow
//        st.pop();
//        System.out.println(st);
//if your stack is full , and still you are trying
        // to push --> stack overflow

    }

}
