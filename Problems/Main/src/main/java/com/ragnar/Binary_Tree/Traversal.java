package com.ragnar.Binary_Tree;



public class Traversal {

    TreeNode root;

    public  void insert(int val){
        TreeNode node = new TreeNode(val);

        if(root == null){
            root = node;
        }else {
            TreeNode current = root;
            while(true){
                
                if (val < current.val) {
                    if (current.left == null) {
                        current.left = node;
                        break;
                    }
                    else{
                        current = current.left;
                    }

                }
                else{
                    if(current.right == null){
                        current.right = node;
                        break;
                    }
                    else{
                        current = current.right;
                    }
                }
            }
        }
    }
    // LMR Left->Middle->Right
    public void inOrder(TreeNode node){
        if(node != null){
            inOrder(node.left);
            System.out.print(node.val + " ");
            inOrder(node.right);
        }
    }
    // LMR Left->Right->Middle
    public void preOrder(TreeNode node){
        if (node != null) {
            preOrder(node.left);
            preOrder(node.right);
            System.out.print(node.val+" ");
        }
    }
    // Middle->Left->Right
    public void postOrder(TreeNode node){
        if (node != null) {
            System.out.print(node.val+" ");
            postOrder(node.left);
            postOrder(node.right);
        }
    }

    public static void main(String[] args) {
        int[] input = {10, 20, 7, 12, 30, 13, 9, 6, 11, 41, 25, 5, 8};
        Traversal inTree = new Traversal();
        for(int i: input){
            inTree.insert(i);
        }
        System.out.println("InOrder: ");
        inTree.inOrder(inTree.root);
        System.out.println();
        
        System.out.println("Pre Order: ");
        inTree.preOrder(inTree.root);
        System.out.println();

        System.out.println("Post ORder: ");
        inTree.postOrder(inTree.root);
        System.out.println();

    }


    
}
