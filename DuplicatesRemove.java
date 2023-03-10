class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class  DuplicatesRemove
 {
    public static ListNode Duplicatesremove(ListNode head)
     {
        if (head == null) 
        {
            return null;
        }

        ListNode current = head;
        while (current != null && current.next != null)
         {
            ListNode runner = current;
            while (runner.next != null) 
            {
                if (runner.next.val == current.val)
                 {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args)
     {
        ListNode head = new ListNode(4);
        head.next = new ListNode(7);
        head.next.next = new ListNode(19);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next.next.next.next = new ListNode(9);

        ListNode result = Duplicatesremove(head);
        while (result != null)
         {
            System.out.print(result.val + "->");
            result = result.next;
        }
    }
}

