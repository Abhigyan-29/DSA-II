package Stacks;


public class ArrayImplementation {
    public static class Stack {
        private int[] arr = new int[5];
        int idx = 0;

        void push(int x) {
            if(isfull()){
                System.out.println("stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        int peek(){
            if(idx == 0){
                System.out.println("Stack is Empty");
                return -1;

            }
            return arr[idx-1];
        }
        int pop(){
            if(idx == 0){
                System.out.println("Stack is Empty");
                return -1;

            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
        void display (){
            for (int i = 0; i < idx; i++) {
                System.out.println(arr[i]+" ");


            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isempty(){
            if(idx== 0){
                return true;
            }
            else return false;
        }
        boolean isfull(){
            if(idx == arr.length){
                return true;
            }
            else return false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(5);
        st.push(6);
        st.push(7);
        st.display();
        System.out.println(st.size());
        st.pop();
        System.out.println(".........");
        st.display();

    }
}
