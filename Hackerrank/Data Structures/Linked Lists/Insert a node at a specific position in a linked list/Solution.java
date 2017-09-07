/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list
 */
/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
    // This is a "method-only" submission. 
     // You only need to complete this method. 
         Node pointNode = head;
         Node tempNode = new Node();
         tempNode.data = data;
         
         if(position == 0){
             tempNode.next = head;
             head = tempNode;
         }else{
             for(int i = 1; i < position; i++){
                 if(pointNode.next == null)
                     break;
                 pointNode = pointNode.next;
             }
             tempNode.next = pointNode.next;
             pointNode.next = tempNode;
         }
         return head;
 }