package LinkedList;

public class NthNodeFromLast {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;

        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;


        public void add(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        public int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        public int fromlast(int n) {

            int totalsize = size();
            int indexfromlast = totalsize - n  ;
            Node temp = head;
            for (int i = 0; i < indexfromlast; i++) {
                temp = temp.next;
            }
            return temp.data;
        }


        public static void main(String[] args) {
            linkedlist list = new linkedlist();
            list.add(3);
            list.add(6);
            list.add(9);
            list.add(5);
            list.add(1);
            System.out.println(list.fromlast(3));

        }
    }
}
