package com.ragnar.AVL_Tree;


public class Main {
    public static void main(String[] args) {
        int[] input = {50,30,40,20,25,45,27};
        AVLTree tree = new AVLTree();
        Node root = null;
        for(int i: input){
            root = tree.insert(root, i);
        }
        System.out.println("In-Order---> \n");
        tree.inOrder(root);

    }
}
