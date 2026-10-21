/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    private HashMap<Integer, Node> map;
    public Node cloneGraph(Node node) {
        map = new HashMap<Integer, Node>();
        return aux(node);           
    }


    private Node aux(Node node) { 
        if (node == null) 
            return null;
        if (map.get(node.val) != null) { 
            return map.get(node.val);

        }
      
        Node copyNode = new Node(node.val);
        map.put(node.val, copyNode);

        for (Node n : node.neighbors) { 
            copyNode.neighbors.add(aux(n));

        }
        return copyNode;

    }
}