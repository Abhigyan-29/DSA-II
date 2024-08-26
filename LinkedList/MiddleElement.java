package LinkedList;



public class MiddleElement {
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
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
        }
        public  void display (){
            node temp = head ;
            while( temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }


        public int centre(){
            node slow = head;
            node fast = head;
            while(fast!= null && fast.next != null){
                slow=slow.next;
                fast = fast.next.next;
            }
            return slow.data;
        }


    }
    public static void main(String[] args) {
        linkedlist l1 = new linkedlist();
        l1.addnode(3);
        l1.addnode(1);
        l1.addnode(9);
        l1.addnode(5);
        l1.addnode(31);
       // l1.addnode(31);
        l1.display();
        System.out.println("the middle element  is " + l1.centre());
        }


    }

