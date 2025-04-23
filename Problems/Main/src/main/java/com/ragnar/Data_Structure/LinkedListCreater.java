package com.ragnar.Data_Structure;

public class LinkedListCreater {

    private Node Head = null;

    public void insert(int val){
        Node newNode = new Node(val);
        if (Head == null) {
            Head = newNode;
        }
        else{
            Node current = Head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void display(){
        Node temp = Head;
        while(temp != null){
            System.err.println(temp.val);
            temp = temp.next;
        }
    }

    public void insert(int val, int index){
        Node current = Head;
        for(int i=0;i<index;i++){
            current = current.next;
        }
        Node newNode = new Node(val);
        newNode.next = current.next;
        current.next = newNode;

    }

    public void insertAtFirst(int val){
        Node newNode = new Node(val);
        newNode.next = Head;
        Head = newNode;
    }

    // public void delete(){
    //     Node current = Head;
    // }

    public static void main(String[] args) {
        LinkedListCreater linkedList = new LinkedListCreater();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(40);
        linkedList.insert(30,1);
        linkedList.insertAtFirst(9);
        linkedList.display();
    }
    
}
