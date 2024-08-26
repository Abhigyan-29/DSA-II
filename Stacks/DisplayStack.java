package Stacks;

import java.util.Stack;

public class DisplayStack {
    public static void printRevRec(Stack<Integer> st) {
        //base case
        if(st.size()==0){
            return ;
        }
        int top = st.pop();
        System.out.print(top+" ");

        printRevRec(st);

        st.push(top);
    }
    public static void printRec(Stack<Integer> st) {
        //base case
        if(st.size()==0){
            return ;
        }
        int top = st.pop();
        printRec(st);
        System.out.print(top+" ");
        //it is necessary to write the below line ,it pushes the elements inside
        //the stack again because the top element is popped .
        st.push(top);
    }
     public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        printRevRec(st);
        System.out.println();
        printRec(st);
    }
}
