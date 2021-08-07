package toolcode.goodmethod;

/*
删除单链表中倒数第n个节点，并返回头节点
 */
public class DeleteNodeDoublePointers {
    public static void main(String[] args) {

        Node node5 = new Node(5, null);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);
        Node head = deleteNode(node1, 1);
        printNode(head);

    }

    public static void printNode(Node head){
        if (head == null){
            return;
        }
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
    static class Node{
        Node next;
        int val;
        public Node(int val, Node next){
            this.val = val;
            this.next = next;

        }
    }

    /*
        头节点为head，
        删除倒数第n个节点
     */
    public static Node deleteNode(Node head, int n) {
        if (head == null || head.next == null){
            return head;
        }
        Node head1 = head;
        Node head2 = head;
        for (int i = 1; i < n; i ++) {
            if (head2 != null){
                head2 = head2.next;
            }else{
                System.out.println("链表长度不够");
                return head;
            }
        }
        if (head2.next == null) {
            System.out.println("需要去除的节点为头节点");
            return head.next;
        }
        while(head2.next.next != null ){
            head1 = head1.next;
            head2 = head2.next;
        }
        head1.next = head1.next.next;
        return head;
    }
}
