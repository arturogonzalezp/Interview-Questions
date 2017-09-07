/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list
 */
/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
    // This is a "method-only" submission. 
    // You only need to complete this method. 
      if(head == null)
          return head;
      Node pointerNode = head;
      while(pointerNode.next != null){
          if(pointerNode.data == pointerNode.next.data){
              pointerNode.next = pointerNode.next.next;
          }else{
              pointerNode = pointerNode.next;
          }
      }
      return head;
  }
  