/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list
 */
    /*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
    // Complete this method
          if(head == null)
              return head;
          if(position == 0)
              return head.next;
          Node pointerNode = head;
          for(int i = 0; i < position-1; i++){
              if(pointerNode.next == null)
                  break;
              pointerNode = pointerNode.next;
          }
          if(pointerNode.next == null)
              return head;
          pointerNode.next = pointerNode.next.next;
          return head;
  }