/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor
 */

  /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node lca(Node root,int v1,int v2)
{   
    if(root == null)
        return null;
    
    if(root.data == v1 || root.data == v2)
        return root;
    
    Node tempLeft = lca(root.left,v1,v2);
    Node tempRight = lca(root.right,v1,v2);
    
    // LCA
    if(tempLeft != null && tempRight != null){
        return root;
    }
    // Left subtree
    if(tempLeft != null && tempRight == null){
        return tempLeft;
    }
    // Right subtree
    if(tempLeft == null && tempRight != null){
        return tempRight;
    }
    return null;
}