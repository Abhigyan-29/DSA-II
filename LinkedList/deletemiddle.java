package LinkedList;

public class deletemiddle {
    public static class linkedlist {
        node head = null;
        node tail = null;

        public static class node {
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
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        public int middle() {
            node slow = head;
            node fast = head;
            int index = 0;
            //int count = 0;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                index++;
            }
            return index;
        }

        public void delete(int index) {
            node temp = head;
            if (index == 0) {
                head = head.next;

            }
            for (int i = 1; i < index - 1; i++) {
                temp = temp.next;
            }
            if (temp.next != null) {
                temp.next = temp.next.next;
            }

        }


    }

    public static void main(String[] args) {
        linkedlist l1 = new linkedlist();
        l1.addnode(3);
        l1.addnode(31);
        l1.addnode(2);
        l1.addnode(6);
        l1.addnode(376);
        l1.addnode(323);

        l1.display();
        System.out.println();
        System.out.println("the middle element's index is " + l1.middle());
        int ans = l1.middle();
        l1.delete(ans);
        l1.display();

    }
}
