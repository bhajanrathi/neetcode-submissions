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
            if(p == null) p = y;
            else 
                p = p.parent;
            if(q == null) q = x;
            else 
                q = q.parent;
        }

        return q;
    }
}