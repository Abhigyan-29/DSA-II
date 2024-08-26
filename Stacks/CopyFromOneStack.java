package Stacks;

import java.util.*;

public class CopyFromOneStack {
    public static void main(String[] args) {
        //copy contents of one stack from one to another in same order

        Stack<Integer> st = new Stack<>();
        int n;
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        //reverse order
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            //int x = st.peek();
            rt.push(st.pop());

        }
        System.out.println(rt);


        Stack<Integer> gt = new Stack<>();
        while(rt.size()>0){
            //int x = st.peek();
            gt.push(rt.pop());

        }
        System.out.println(gt);
    }
}
