package LinkedList;

public class SlowFast {
    public static class Linkedlist {
        node tail = null;
        node head = null;

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
        public int centre (){
            node slow = head;
            node fast = head;
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;

            }

            return slow.data;
        }

        public void display() {
            node temp = head;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Linkedlist l1 = new Linkedlist();
        l1.addnode(1);
        l1.addnode(2);
        l1.addnode(3);
        l1.addnode(4);
        l1.addnode(5);
        l1.addnode(5);
        l1.display();
        int middle = l1.centre();
        System.out.println("the middle element is : " + middle);


    }
}
