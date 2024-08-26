package LinkedList;


public class Intersection {
    public static class linkedlist {
        Node head = null;
        Node tail = null;

        public static class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
            }
        }

        public void addnode(int data) {
            Node temp = new Node(data);
            //Node curr = head;
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;

            }
        }

        public static void display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");

                temp = temp.next;

            }
        }


    }

    public static void main(String[] args) {
        linkedlist l1 = new linkedlist();
        linkedlist l2 = new linkedlist();
        l1.addnode(100);
        l1.addnode(13);
        l1.addnode(4);
        l2.addnode(90);
        l2.addnode(9);
        linkedlist.Node commonNode = new linkedlist.Node(13);

        l1.tail.next = commonNode;
        l1.tail = commonNode;

        l2.tail.next = commonNode;
        l2.tail = commonNode;
        l1.addnode(23);
        l1.addnode(765);
        l2.addnode(5243);
        System.out.println("the common node is " + commonNode.data);

        linkedlist.display(l1.head);
        System.out.println();
        linkedlist.display(l2.head);

    }
}
