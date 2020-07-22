package mediun;

/*
* 给定一个链表，删除链的倒数第n个节点，并且返回链表的头节点。
* 输入：1->2->3->4->5
* 输出：1->2->3->5
* */
public class M_19_RemoveNthNode {

//    定义单向链表
    static class Node{
        public Node next;
        public int val;

        public Node(int val){
            this.val = val;
        }
    }



    public static void main(String[] args) {

//        在链表中插入数据
//        n1为头结点
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        int n = 2;
        M_19_RemoveNthNode.RemoveNth(n1,n);
    }

    private static void  RemoveNth(Node head, int n) {

        //定义快慢指针
        Node fast = head;
        Node slow = head;

//        快指针先移动
        for (int i = 0; i < n; i ++){
            fast = fast.next;
        }

//        快指针移动到最后一个节点
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

//        慢指针跳过需要删除的节点
        slow.next = slow.next.next;

//        打印删除后的链表
        while (head != null) {
            System.out.println(head.val); //1->2->3->5
            head = head.next;
        }
    }
}
