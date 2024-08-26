package LinkedList;

public class CircularLL {
    //public static class linkedlist{
    static node head = null;
    node tail = null;

    public static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
        }
    }

    public static void display(node head) {
        if (head == null) {
            return;
        }
        node temp = head;
        do {
            System.out.println(temp.data);
            temp = temp.next;
        }
        while (temp != head);
    }
        public static boolean point () {
            node slow = head;
            node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (fast == slow) {
                    return true;

                }

            }
            return false;
        }

        public static void main (String[]args){
            // linkedlist l1 = new linkedlist();


            node a = new node(4);
            node b = new node(5);
            node c = new node(6);
            node d = new node(7);
            head = a;
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = b;
            System.out.println("Does the linked list have a cycle? " + point());

        }
    }
