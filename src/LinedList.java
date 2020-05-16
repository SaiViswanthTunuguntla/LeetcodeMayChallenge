import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.LinkedList;

public class LinedList {
      //Definition for singly-linked list.
      public static  class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

        public static ListNode oddEvenList(ListNode head) {
            if(head==null) return null;
            ListNode odd=head;
            ListNode even=head.next;
            ListNode evenHead=even;
            while(even!=null && even.next!=null){
                odd.next=odd.next.next;
                odd=odd.next;
                even.next=even.next.next;
                even=even.next;
            }
            odd.next=evenHead;
            return head;
        }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fivth = new ListNode(5);

        head.next = second; // Link first node with the second node
        second.next = third;
        third.next=fourth;
        fourth.next=fivth;
        ListNode n =head;
        while (n != null) {
            System.out.println(n.val + " ");
            n = n.next;
        }
System.out.println("After doing shifting");
        ListNode new_n = oddEvenList(head);
        while (new_n != null) {
            System.out.print(new_n.val + " ");
            new_n = new_n.next;
        }
    }
}
