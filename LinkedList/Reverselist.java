package LinkedList;

public class Reverselist {

//    public static class linkedlist {
//        node head = null;
//        node tail = null;


    public static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
        }
    }

    public static void display(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    public static void displayrev(node head) {

        node temp = head;
        if (temp == null) {
            return;
        }

        System.out.print(temp.data + " ");
        displayrev(temp.next);

    }

    public static node reverse(node head) {
        if (head.next == null) {
            return head;
        }
        node newhead = reverse(head.next);
        head.next.next = head; //interchanging the connections
       head.next = null;
        return newhead;
    }
    // }

    public static void main(String[] args) {

        node a = new node(3);
        node b = new node(4);
        node c = new node(5);
        node d = new node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        System.out.print("this is the original list : ");
        displayrev(a);
        System.out.println();
        a = reverse(a);
        System.out.print("this is the reversed list : ");
        display(a);

    }


}




