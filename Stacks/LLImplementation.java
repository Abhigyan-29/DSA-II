package Stacks;

public class LLImplementation {
    public static class node{//user defined data type
        int data;
        node next;

        public node(int data) {
            this.data = data;
        }
    }
    public static class llstack{ //user defined data structure
        private node head = null;
        private int size = 0;

        void push(int x){
            node temp = new node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int pop(){
            if(head==null){
                System.out.println("stack is empty");
                return 0;
            }
            int x = head.data;
            head=head.next;
            return x;
        }
        int peek()
        void display(){
            node temp = head;
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp = temp.next;

            }
        }
        int size(){//getter
            return size;
        }

    }

    public static void main(String[] args) {
        llstack st = new llstack();
        st.push(4);
        st.push(5);
        st.push(6);
        st.display();
        System.out.println(st.size());
        st.pop();
        System.out.println(".........");
        st.display();
    }
}
