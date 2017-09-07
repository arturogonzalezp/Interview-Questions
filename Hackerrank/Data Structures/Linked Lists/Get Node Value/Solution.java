/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail
 */
/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
    // This is a "method-only" submission. 
    // You only need to complete this method. 
   Node pointerNode = head;
   int size = 0;
   while(pointerNode != null){
       size++;
       pointerNode = pointerNode.next;
   }
   int pos = size-n;
   pointerNode = head;
   for(int i = 0; i < pos-1; i++){
       pointerNode = pointerNode.next;
   }
   return pointerNode.data;
}