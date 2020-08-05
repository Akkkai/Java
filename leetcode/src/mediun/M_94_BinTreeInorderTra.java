package mediun;


/**
 *  给定一个二叉树，返回它的中序遍历
 *  示例：
 *  输入：[1, null, 2, 3]
 *        1
 *         \
 *         2
 *        /
 *      3
 *  输出：[1,3,2]
 */
public class M_94_BinTreeInorderTra {

    static class Node{
        public Node left = null;
        public Node right = null;
        public String str;

        public  Node(String str){
            this.str = str;
        }

        public String toString(){
            return str;
        }
    }

    private static void InorderTraversal(Node node) {

    }

    public static void main(String[] args) {
        Node t1 = new Node("1");
        Node t2 = new Node(null);
        Node t3 = new Node("2");
        Node t4 = new Node("3");

        t1.left = t2;
        t1.right = t3;
        t3.left = t4;

        M_94_BinTreeInorderTra.InorderTraversal(t1);
    }
}
