/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/self-balancing-tree
 */

  static int height(Node root) 
  {
       if (root == null)
           return -1;
       return root.ht;
   }
   static int getBalance(Node root) {
       if (root == null)
           return 0;
       return height(root.left) - height(root.right);
   }
   static Node rightRotate(Node root){
       Node x = root.left;
       Node T2 = x.right;

       // Perform rotation
       x.right = root;
       root.left = T2;

       // Update heights
       root.ht = Math.max(height(root.left), height(root.right)) + 1;
       x.ht = Math.max(height(x.left), height(x.right)) + 1;

       // Return new root
       return x;
   }
   static Node leftRotate(Node root){
       Node x = root.right;
       Node T2 = x.left;

       // Perform rotation
       x.left = root;
       root.right = T2;

       //  Update heights
       root.ht = Math.max(height(root.left), height(root.right)) + 1;
       x.ht = Math.max(height(x.left), height(x.right)) + 1;

       // Return new root
       return x;
   }
  static Node insert(Node root,int val)
  {
      if(root == null){
          Node tempNode = new Node();
          tempNode.val = val;
          tempNode.ht = 0;
          return tempNode;
      }
      if(root.val > val){
          root.left = insert(root.left, val);
      }else if(root.val < val){
          root.right = insert(root.right, val);
      }else{
          return root;
      }
      root.ht = Math.max(height(root.left), height(root.right)) + 1;
      int balanceFactor = getBalance(root);
      
       // Left Left Case
       if (balanceFactor > 1 && val < root.left.val)
           return rightRotate(root);

       // Right Right Case
       if (balanceFactor < -1 && val > root.right.val)
           return leftRotate(root);

       // Left Right Case
       if (balanceFactor > 1 && val > root.left.val) {
           root.left = leftRotate(root.left);
           return rightRotate(root);
       }

       // Right Left Case
       if (balanceFactor < -1 && val < root.right.val) {
           root.right = rightRotate(root.right);
           return leftRotate(root);
       }
      
      return root;
   }
