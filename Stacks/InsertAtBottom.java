package Stacks;

import java.util.Stack;

public class InsertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>() ;
        st.push(2);
        st.push(3);
        st.push(1);
        st.push(6);
        st.push(9);
        System.out.println(st);


        Stack<Integer> rt = new Stack<>();
        rt.push(34);
        while(st.size()>0){
            rt.push(st.pop());

        }
        System.out.println(rt);

        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
