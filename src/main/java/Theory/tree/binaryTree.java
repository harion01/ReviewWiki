package Theory.tree;

public class binaryTree {
    private binTreeNode root = null;

    binaryTree(binTreeNode node){
        root = node;
    }

    public boolean search(int val){
        binTreeNode checkNode = root;
        while(checkNode != null){
            if (checkNode.value == val){
                return true;
            } else if (checkNode.value > val){
                checkNode = checkNode.leftChild;
            } else if (checkNode.value < val){
                checkNode = checkNode.rightChild;
            }
        }
        return false;
    }

    public void insert(int val){
        binTreeNode newNode = new binTreeNode(val);
        binTreeNode checkNode = root;
        while(checkNode != null){
            if(checkNode.value > newNode.value){
                if(checkNode.leftChild != null){
                    checkNode = checkNode.leftChild;
                } else {
                    checkNode.leftChild = newNode;
                    break;
                }

            } else if (checkNode.value < newNode.value) {
                if(checkNode.rightChild != null){
                    checkNode = checkNode.rightChild;
                } else {
                    checkNode.rightChild = newNode;
                    break;
                }
            }
        }

    }

    public void delete(int val){
        binTreeNode checkNode = root;

        while(checkNode != null){
            if (checkNode.value == val){
                rebalanceTree(checkNode);
            } else if (checkNode.value > val){
                checkNode = checkNode.leftChild;
            } else if (checkNode.value < val){
                checkNode = checkNode.rightChild;
            }
        }

    }

    private void rebalanceTree(binTreeNode removedNode){
        if(removedNode.rightChild != null ){

            binTreeNode leftMostParent = removedNode.rightChild;
            while(leftMostParent.leftChild != null){
                leftMostParent = leftMostParent.leftChild;
            }
            leftMostParent.leftChild = removedNode.leftChild;

            removedNode = removedNode.rightChild;
        } else {
            removedNode = removedNode.leftChild;
        }

    }

}
