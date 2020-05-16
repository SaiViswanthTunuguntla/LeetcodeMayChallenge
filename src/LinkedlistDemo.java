import java.util.LinkedList;

public class LinkedlistDemo {
    // A simple Java program for traversal of a linked list
        static Node head; // head of list
        static class Node {
            int data;
            Node next;
            Node(int d)
            {
                data = d;
                next = null;
            } // Constructor

            public Node() {

            }
        }

        /* This function prints contents of linked list starting from head */
        public static void printList()
        {
            Node n = head;
            while (n != null) {
                System.out.print(n.data + " ");
                n = n.next;
            }
            
            
        }

        /* method to create a simple linked list with 3 nodes*/
        public static void main(String[] args)
        {
            /* Start with the empty list. */
            LinkedList llist = new LinkedList();

            head = new Node(1);
            Node second = new Node(2);
            Node third = new Node(3);
            Node fourth = new Node(4);
            Node fivth = new Node(5);

            head.next = second; // Link first node with the second node
            second.next = third;
            third.next=fourth;
            fourth.next=fivth;// Link first node with the second node

            printList();
        }
    }


