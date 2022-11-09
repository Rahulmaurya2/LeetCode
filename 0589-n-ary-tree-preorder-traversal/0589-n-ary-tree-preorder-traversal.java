/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        LinkedList<Integer> list=new LinkedList<>();
        if(root == null) return list;
        traversal(root,list);
      return list;
    }
  
  public static void traversal(Node node,List<Integer> list){
    if(node.children==null){
      list.add(node.val);
      return;
    }
    list.add(node.val);
    for(Node child: node.children){
      traversal(child,list);
    }
  }
}