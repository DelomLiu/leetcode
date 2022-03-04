/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    public Node copyRandomList(Node head) {
        if (head == null)
            return null;
        /*
        //哈希表<原节点，新节点>
        HashMap<Node, Node> hash = new HashMap<>();
        //复制原有的所有节点
        for (Node cur=head; cur!=null; cur=cur.next) {
            hash.put(cur, new Node(cur.val));
        }
        //形成链表
        for (Node cur=head; cur!=null; cur=cur.next) {
            hash.get(cur).next = hash.get(cur.next);
            hash.get(cur).random = hash.get(cur.random);
        }

        return hash.get(head);
        */

        //原地修改
        //复制原有节点，1->2->3 变成 1->1'->2->2'->3->3'
        for (Node cur=head; cur!=null; cur=cur.next.next) {
            Node temp = new Node(cur.val);
            temp.next = cur.next;
            cur.next = temp;
        }
        //对新节点的random进行赋值
        for (Node cur=head; cur!=null; cur=cur.next.next) {
            if (cur.random != null)
                cur.next.random = cur.random.next;
        }
        //分离新节点和原节点
        Node res = head.next;
        for (Node cur=head, temp; cur!=null && cur.next!=null;) {
            temp = cur.next;
            cur.next = temp.next;
            cur = temp;
        }
        return res;
    }
}