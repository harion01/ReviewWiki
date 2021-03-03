package Developify;




public class palindromeLinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
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

}
