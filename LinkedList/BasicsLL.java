package LinkedList;

public class BasicsLL {

    //making a display function
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + "");
            temp = temp.next;
        }
    }

    //code to find length of LL
    public static int length(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    //--------------------------------
    //recursive function to display
    public static void displayr(Node head) {
        //base case
        if (head == null) {
            return;
        }
        System.out.println(head.data);
        displayr(head.next);
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(4); //head node
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(2);
        a.next = b;
        b.next = c;
        c.next = d;
//        Node temp = a;
//        while(temp!= null){
//            System.out.print(temp.data+"  ");
//            temp = temp.next;
//
//        }
        displayr(a);
        int ll = length(a);
        System.out.println(ll);

    }
}
