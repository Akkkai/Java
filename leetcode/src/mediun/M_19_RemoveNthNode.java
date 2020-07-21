package mediun;
/*
* 给定一个链表，删除链的倒数第n个节点，并且返回链表的头节点。
* 输入：1->2->3->4->5
* 输出：1->2->3->5
* */
public class M_19_RemoveNthNode {

    private M_19_RemoveNthNode next;

    public static void main(String[] args) {
        int n = 2;
        M_19_RemoveNthNode.RemoveNth(n);
    }

    private static void RemoveNth(int n) {
        int fast = 0;
        int slow = fast-n+1;
    }
}
