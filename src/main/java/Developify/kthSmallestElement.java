package Developify;

public class kthSmallestElement {
    int count = 0;

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
     }

     public int kthSmallest(TreeNode root, int k) {

        preorderSearch(root, k);
        return count;
    }

    private boolean preorderSearch(TreeNode root, int k) {
        if(root == null){
            return false;
        }
        if(preorderSearch(root.left, k))
            return true;

        if(k == root.val){
            return true;
        }
        count++;
        System.out.println("cur val:"+root.val + " count:"+count);

        if(preorderSearch(root.right, k))
            return true;

        return false;
    }
}
