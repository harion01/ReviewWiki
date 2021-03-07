package Developify;


import java.util.ArrayList;

public class palindromeLinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
    }

    public static void main(String args[]){
        ArrayList<Integer> initArr = new ArrayList<>();
        initArr.add(1);
        initArr.add(2);
        initArr.add(2);
        initArr.add(1);

        palindromeLinkedList runner = new palindromeLinkedList();
        ListNode node = runner.initList(initArr);
        runner.printList(node);

        //runner.isPalindrome(node);
        runner.isPalindromeReduceSpace(node);
    }

    public ListNode initList(ArrayList<Integer> data){
        ListNode node = new ListNode();
        ListNode head = node;
        node.val = data.get(0);
        for(int idx = 1 ; idx < data.size(); idx++){
            ListNode nextNode = new ListNode(data.get(idx));
            node.next = nextNode;
            node = node.next;
        }
        return head;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode node = head;
        int nodeSize = 0;
        while(node != null){
            nodeSize++;
            node = node.next;
        }

        ListNode wordNode = head;
        int middle = nodeSize/2;
        String firstWord = "";
        for(int firstIdx = 0 ; firstIdx < middle ; firstIdx++ ){
            firstWord = firstWord + wordNode.val;
            wordNode = wordNode.next;
        }

        if(nodeSize%2 != 0 && nodeSize>2){
            wordNode = wordNode.next;
        }

        String secondWord = "";
        for(int secondIdx = 0 ; secondIdx < middle ; secondIdx++ ){
            secondWord = wordNode.val + secondWord;
            wordNode = wordNode.next;
        }

        System.out.println("nodeSize: "+nodeSize+" first :"+firstWord+"second :"+secondWord);
        return firstWord.equals(secondWord);
    }

    public boolean isPalindromeReduceSpace(ListNode head) {
        ListNode node = head;
        int nodeSize = 0;
        while(node != null){
            nodeSize++;
            node = node.next;
        }
        node = head;

        int middle = nodeSize/2;
        for(int firstIdx = 0 ; firstIdx < middle ; firstIdx++ ){
            node = node.next;
        }

        ListNode curNode = node;
        if(nodeSize%2 != 0 && nodeSize>2){
            curNode = curNode.next;
        }

        ListNode backwardNode = makeReverseLinkedList(curNode);
        //System.out.println("reverse node");
        //printList(backwardNode);

        ListNode forwardNode =  makeFirstNode(node, middle);
        //System.out.println("first node");
        //printList(forwardNode);
        for(int count = 0 ; count < middle; count++){
           // System.out.println("compare node - first :"+forwardNode.val + " reverse:"+backwardNode.val);
            if(forwardNode.val != backwardNode.val){
                return false;
            }
            forwardNode = forwardNode.next;
            backwardNode = backwardNode.next;
        }
        return true;
    }

    private ListNode makeReverseLinkedList(ListNode curNode) {
        ListNode reverseNode = curNode.next;
        ListNode prevNode = curNode;
        prevNode.next = null;

        while(reverseNode != null){
            curNode = reverseNode;
            reverseNode = reverseNode.next;
            curNode.next = prevNode;
            prevNode = curNode;
        }
        reverseNode = curNode;
        return reverseNode;
    }

    private ListNode makeFirstNode(ListNode node, int middle) {
        ListNode firstNode = node;
        ListNode moveNode =node;
        for(int firstIdx = 0 ; firstIdx < middle-1 ; firstIdx++ ){
            moveNode = moveNode.next;
        }
        moveNode.next = null;
        return firstNode;
    }

    public void printList(ListNode head){
        ListNode node = head;
        System.out.print("Print node : ");
        while(node != null){
            System.out.print(" - "+node.val);
            node = node.next;
        }
        System.out.println("");
    }

}
