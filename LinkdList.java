import java.util.LinkedList;
import java.util.Collections;

public class LinkdList
 {
    static class Node 
    {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node mergeLists(Node headA, Node headB)
     {
        Node currentA = headA;
        Node currentB = headB;
        LinkedList<Integer> result = new LinkedList<>();

        while (currentA != null || currentB != null) 
        {
            if (currentA != null)
             {
                result.add(currentA.data);
                currentA = currentA.next;
            }
            if (currentB != null) 
            {
                result.add(currentB.data);
                currentB = currentB.next;
            }
        }

        Collections.sort(result);

        Node head = new Node(result.get(0));
        Node current = head;
        for (int i = 1; i <  result.size();  i++) 
        {
            current.next = new Node(result.get(i));
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args)
     {
        Node headA = new Node(43);
        headA.next = new Node(23);
        headA.next.next = new Node(32);
        headA.next.next.next = new Node(14);
        headA.next.next.next.next = new Node(6);
        headA.next.next.next.next.next = new Node(51);
        Node headB = new Node(5);
        headB.next = new Node(52);
        headB.next.next = new Node(12);
        headB.next.next.next = new Node(44);
        headB.next.next.next.next = new Node(65);
        headB.next.next.next.next.next = new Node(38);
        Node result = mergeLists(headA, headB);
        while (result != null) 
        {
            System.out.print(result.data + "->");
            result = result.next;
        }
    }
}


