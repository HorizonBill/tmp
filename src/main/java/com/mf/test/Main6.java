package com.mf.test;

/***
 * 双循环封闭链路
 */
public class Main6 {
    public static void main(String[] args) {
        NodeCircle nodeCircle = new NodeCircle(300);
        int countNum = 0;
        Node n = nodeCircle.first;
        while(nodeCircle.count>1){
            countNum ++;
            if(countNum == 7){
                countNum = 0;
                nodeCircle.delete(n);
            }
            n = n.right;
        }
        System.out.println(nodeCircle.first.id);
    }
}

class Node{
    int id;
    Node left;
    Node right;
}

class NodeCircle{
    int count = 0;
    Node first, last;
    NodeCircle(int n){
        for(int i = 0; i < n; i ++){
            add();
        }
    }

    void add(){
        Node node = new Node();
        node.id = count;
        if(count <= 0){
            first = node;
            last = node;
            node.left = node;
            node.right = node;
        }else {
            last.right = node;
            first.left = node;
            node.left = last;
            node.right = first;
            last = node;
        }
        count ++;
    }

    void delete(Node n){
        if(count < 0){
            System.out.println("队列里面没有元素");
        }else if(count == 1){
            first = last = null;
        }else{
            n.left.right = n.right;
            n.right.left = n.left;
            if(n == first){
                first = n.right;
             n.right.left = last;
            }else if(n == last){
                last = n.left;
                n.left.right = first;
            }
        }
        count --;
    }
}