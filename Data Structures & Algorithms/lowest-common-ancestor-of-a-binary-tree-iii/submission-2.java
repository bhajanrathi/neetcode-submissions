/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
        Node x = p, y = q;
        while(p != q) {
            p = (p == null) ? y : p.parent;
            q = (q == null) ? x : q.parent; 
        }

        return q;
    }
}