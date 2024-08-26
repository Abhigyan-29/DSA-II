package Stacks;

import java.util.Stack;

public class revereseIterative {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        Stack<Integer> rt = new Stack<>();
        //jb tk st ka size 0 se bda h..tb tk copy kro
        while(st.size() > 0){
            rt.push(st.pop());

        }
       // System.out.println(rt);
        Stack <Integer> nt = new Stack<>();
        while(rt.size() >0){
            nt.push(rt.pop());
        }
        while(nt.size() > 0) {
            st.push(nt.pop());
        }
        System.out.println(st);
    }
}
