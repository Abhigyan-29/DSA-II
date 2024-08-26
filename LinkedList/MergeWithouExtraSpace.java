package LinkedList;

import static java.lang.Math.min;

public class MergeWithouExtraSpace {
    public static class linkedlist {
        node head = null;
        node tail = null;

        public class node {
            int data;
            node next;

            public node(int data) {
                this.data = data;
            }
        }

        public void addnode(int data) {
            node temp = new node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;

            }
        }

        public void display() {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        }

        public void merge(linkedlist l1, linkedlist l2) {
            node dummy = new node(0); // Dummy node as a starting point
            node temp = dummy;
            node temp1 = l1.head;
            node temp2 = l2.head;
            while (temp1 != null && temp2 != null) {
                if (temp1.data < temp2.data) {
                    temp.next = temp1;
                    temp1 = temp1.next;
                } else {
                    temp.next = temp2;
                    temp2 = temp2.next;
                }
                temp = temp.next;
            }
            // add the remaining elements from the list
            if(temp1!=null){
                temp.next = temp1;
            }else {
                temp.next = temp2;
            }
            head = dummy;
        }


    }

    public static void main(String[] args) {
        linkedlist l1 = new linkedlist();
        linkedlist l2 = new linkedlist();
        l2.addnode(2);
        l2.addnode(4);
        l2.addnode(6);

        l1.addnode(1);
        l1.addnode(3);
        l1.addnode(5);
        l1.merge(l1,l2);
        l1.display();
//        System.out.println();
//        l2.display();
    }
}
