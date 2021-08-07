package toolcode;

/*
二叉树Morris遍历实现原则：
即当前节点为cur
1.如果cur无左节点，cur向右移动（cur = cur.right）;
2.如果cur有左节点，找到cur左节点上最右的字节点，记为mostright
    a.如果mostright的right指针指向空，让其指向cur，cur向左移动（cur = cur.left）
    b.如果mostright的right指针指向cur，让其指向空，cur向右移动(cur = cur.right)

morris遍历的实质： 建立一种机制，对于cur没有左节点的节点只达到一次，对于cur右左节点的会达到两次
 */
public class MorrisTree {
    static class Node{
        Node left;
        Node right;
        int val;

        public Node(int val, Node left, Node right) {
            this.left = left;
            this.right = right;
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Node node8 = new Node(8, null, null);
        Node node7 = new Node(7, null, null);
        Node node6 = new Node(6, null, null);
        Node node5 = new Node(5, node6, node7);
        Node node4 = new Node(4, node8, null);
        Node node3 = new Node(3, null, null);
        Node node2 = new Node(2, node4, node5);
        Node node1 = new Node(1, node2, node3);
        morrisIn(node1);

    }

    /*
        中序遍历
     */
    public static void morrisIn(Node head){
        if (head == null) {
            return;
        }
        Node cur = head;
        Node mostRight = null;
        while(cur != null) {
            mostRight = cur.left;
            if (mostRight != null) {
                //找到最右边的节点
                while (mostRight.right != null && mostRight.right != cur) {
                    mostRight = mostRight.right;
                }
                if (mostRight.right == null) {
                    //将左右边的节点与当前节点建立链接
                    mostRight.right = cur;
                    //遍历到下一个节点
                    cur = cur.left;
                    continue;
                }else {
                    mostRight.right = null;
                }
            }
            System.out.print(cur.val + " ");
            cur = cur.right;
        }
        System.out.println();
    }

}
