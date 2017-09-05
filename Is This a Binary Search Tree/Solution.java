/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/is-binary-search-tree
 */

  /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */
boolean checkBSTRecursive(Node root, int min, int max){
    if(root == null)
        return true;
    
    if (root.data < min || root.data > max)
        return false;
    
    return (checkBSTRecursive(root.left, min, root.data-1) &&checkBSTRecursive(root.right, root.data+1, max));
}
boolean checkBST(Node root) {
    return checkBSTRecursive(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    
}