package LinkedList;
//using 2 pointer slow and fast
public class anotherapproach {
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

        public void addNode(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public int traverse(int n) {
            Node node = new Node(n);
            Node slow = head;
            Node fast = head;
            for (int i = 0; i < n; i++) {
                fast = fast.next;

            }
            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow.data;


        }

        public static void main(String[] args) {
            linkedlist ll = new linkedlist();
            ll.addNode(4);
            ll.addNode(3);
            ll.addNode(8);
            ll.addNode(9);

            int ans = ll.traverse(2);
            System.out.println(ans);

        }
    }
}
