/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists
 */
/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node mergeLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method
   if(headA == null && headB == null){
       return null;
   }else if(headA != null && headB == null){
       return headA;
   }else if(headA == null && headB != null){
       return headB;
   }
   Node baseHead;
   Node secondHead;
   Node pointerNode;
   
   if(headA.data < headB.data){
       baseHead = headA;
       secondHead = headB;
   }else{
       baseHead = headB;
       secondHead = headA;
   }
   pointerNode = baseHead;
   while(pointerNode.next != null){
       if(secondHead == null)
           break;
       if(pointerNode.next.data > secondHead.data){
           Node tempNode = secondHead;
           secondHead = secondHead.next;
           tempNode.next = pointerNode.next;
           pointerNode.next = tempNode;
       }
       pointerNode = pointerNode.next;
   }
   if(secondHead != null)
       pointerNode.next = secondHead;
   
   return baseHead;
}