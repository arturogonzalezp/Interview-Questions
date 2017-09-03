/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/tree-level-order-traversal
 */

void levelOrder(Node root) {       
    Queue<Node> queue = new LinkedList<Node>();
    ArrayList<Node> visited = new ArrayList<Node>();
    queue.add(root);
    while(!queue.isEmpty()){
        Node node = queue.remove();
        if(node.left != null){
            queue.add(node.left);
        }
        if(node.right != null){
            queue.add(node.right);
        }
        System.out.print(node.data + " ");
    }
 }