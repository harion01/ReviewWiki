package Developify;
import java.util.*;


class middleLinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
    }

    public ListNode middleNode(ListNode head) {
        int nodeSize = 0;
        int position = 0;
        ListNode node = head;

        while(node.next != null){
            nodeSize++;
            node = node.next;
        }

        position = (nodeSize/2) + (nodeSize%2);

        ListNode middle = head;
        for(int cnt = 0; cnt < position; cnt++){
            middle = middle.next;
        }
        //System.out.println("size : "+nodeSize +" position : "+position);
        return middle;
    }
}