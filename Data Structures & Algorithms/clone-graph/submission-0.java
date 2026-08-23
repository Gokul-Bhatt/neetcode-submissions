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
   private Map<Node,Node> visited = new HashMap<>();

    private void dfs( Node node,Node clone){
        for(Node n : node.neighbors){
            if(!visited.containsKey(n)){
                Node temp = new Node(n.val);
                visited.put(n,temp);
                clone.neighbors.add(temp);
                dfs(n,temp);
            }else{
                 clone.neighbors.add(visited.get(n));
            }
        }
    }
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        Node clone = new Node(node.val);
        visited.put(node, clone);
        dfs(node,clone);
        return clone;
    }
}