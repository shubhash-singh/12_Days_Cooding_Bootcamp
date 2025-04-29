package com.ragnar.AVL_Tree;

public class AVLTree {
    Node root;
    public Node insert(Node node, int val){
        if (node == null) {
            return new Node(val);
        }else if (node.val > val) {
            node.left = insert(node.left, val);
        }
        else if(node.val < val){
            node.right = insert(node.right, val);
        }


        int bal = getBalance(node);

        if (bal > 1 && val < node.left.val) {
            return rightRotate(node);
        }
        else if(bal > 1 && val > node.left.val){
            return leftRightRotate(node);
        }
        else if (bal < -1 && val > node.right.val){
            return leftRotate(node);
        }
        else if(bal < -1 && val < node.right.val){
            return rightleftRotate(node);
        }

        return node;

    }

    public int getHeight(Node node){
        if (node == null) {
            return 0;
        }
        else{
            return Math.max(getHeight(node.right), getHeight(node.left)) + 1;
        }

    }
    private int getBalance(Node node){
        if (node == null) {
            return 0;
        }
        int leftNodeHeight = getHeight(node.left);
        int rightNodeHeight = getHeight(node.right);
        return leftNodeHeight - rightNodeHeight;
    }
    // if bal < -1 and key > node.val
    private Node leftRotate(Node node){
        Node x = node.right;
        Node temp = x.left;

        x.left = node;
        node.right = temp;
        
        return x;
    }
    // if bal > 1 and key < node.val
    private Node rightRotate(Node node){
        Node x = node.left;
        Node temp = x.right;

        x.right = node;
        node.left = temp;
        
        return x;
    }
    // if bal < -1 and key < node.val
    private Node rightleftRotate(Node node){
        node.right = rightRotate(node.right);
        return leftRotate(node);
    }
    // if bal > 1 and key > node.val
    private Node leftRightRotate(Node node){
        node.left = leftRotate(node.left);
        return rightRotate(node);
    }



    // LMR Left->Middle->Right
    public void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            System.out.print(node.val + " ");
            inOrder(node.right);
        }
    }
    // Middle->Left->Right

    public void preOrder(Node node){
        if (node != null) {
            System.out.print(node.val+" ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }  
        // LMR Left->Right->Middle
    
    public void postOrder(Node node){
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.val+" ");
        }
    }
}