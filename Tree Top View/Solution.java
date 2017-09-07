/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/tree-top-view/
 */
   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   
  void topView(Node root)
  {
      topView(root, 0);
  }
  
  void topView(Node root, int side)
  {
      if (root != null) {
          if (side <= 0) {
              topView(root.left, -1);
          }
          
          System.out.print(root.data + " ");
          
          if (side >= 0) {
              topView(root.right, 1);
          }
      }
  }