package Developify;

public class removeNthNode {
    public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }



    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode result = head;
        int listNodeCount = 0;
        ListNode moveNode = head;

        while(moveNode != null){
            listNodeCount++;
            moveNode = moveNode.next;
        }

        int nThNode = listNodeCount - (n-1);

        System.out.println("total node count : "+listNodeCount+" nThnode : "+nThNode);

        ListNode prev = head;
        for(int moveCount = 1 ; moveCount < nThNode-1 ; moveCount++){
            prev = prev.next;
        }
        printAllnode(prev);




        if(prev == head) {
            if (prev.next != null) {
                result.next = result.next.next;
            } else {
                result.next = null;
            }
        } else {
            if (prev.next != null) {
                prev.next = prev.next.next;
            } else {
                prev.next = null;
            }
        }




        return result;
    }

    public void printAllnode(ListNode Node){
        ListNode move = Node;
        while(move != null){
            System.out.print(" - "+move.val +" - ");
            move = move.next;
        }
        System.out.println();
    }
}
