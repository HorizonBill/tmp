package com.mf.test;

public class Main7 {
    Node head = null;
    class Node {
        Node  next;
        int data;
        public Node(int data){
            this.data = data;
        }
    }

    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return ;
        }
        Node tmp = head;
        while(tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newNode;
    }

    public boolean deleteNode(int index){
        if(index < 0 || index > length() ){
            return false;
        }
        if(index == 0){
            head = head.next;
            return true;
        }
        int i = 1;
        Node preNode = head;
        Node curNode = preNode.next;
        while(curNode != null){

        }
        return false;
    }

    public int length() {
        int length = 0;
        Node tmp = head;
        while(tmp != null) {
            length ++;
            tmp = tmp.next;
        }
        return length;
    }

}
