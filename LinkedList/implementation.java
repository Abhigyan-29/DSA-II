package LinkedList;

public class implementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }


    public static class linkedlist {
        Node head = null;
        Node tail = null;

        //insert at any index ------------------------------
        void anyindex(int val, int index) {
            Node temp = head;

            Node t = new Node(val);
            if (index == 0) {
                insertstart(val);
            }

            for (int i = 1; i < index - 1; i++) {
                temp = temp.next;

            }
            t.next = temp.next;
            temp.next = t;
            if (t.next == null) {
                tail = t;
            }
        }

        // insert_start------------------------------------
        void insertstart(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }
// count --------------------------------------

        public int count() {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;


        }

        //delete------------------------------------
        void delete(int index) {
            Node del = head;
            if(index == 0){
                head =  head.next;
            }
            for (int i = 1; i < index - 1; i++) {
                del = del.next;

            }
            del.next = del.next.next;
            if (del.next == null) {
                tail = del;
            }
            //  size();
        }

        // insert_end ----------------------------------------
        void insertend(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;

            } else {
                tail.next = temp;

            }
            tail = temp;
        }


        //display-------------------------
        public void display() {
            Node temp = head;

            //we don't want ki ye head aage jaake null hojae ,  islie temp banae h
            while (temp != null) {
                System.out.print(temp.data + " ");

                temp = temp.next;
            }

        }

//        public void size() {
//            Node temp = head;
//            int counter = 0;
//            while (temp != null) {
//                counter++;
//                temp = temp.next;
//            }
//
//        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertend(4);
        ll.insertend(3);
        ll.insertend(7);
        ll.insertend(8);
        ll.insertend(34);
        ll.insertstart(56);
        ll.anyindex(77, 7);
        ll.display();
        ll.delete(0);
        System.out.println();
        ll.display();
        System.out.println();
        System.out.println("the tail is :" + ll.tail.data);
        System.out.println("the total is :" + ll.count());
    }
}
