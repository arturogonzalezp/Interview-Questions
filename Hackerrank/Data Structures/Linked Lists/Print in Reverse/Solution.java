/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse
 */
/*
  Print elements of a linked list in reverse order 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

    void ReversePrint(Node head) {
        // This is a "method-only" submission. 
        // You only need to complete this method. 
          if(head != null){
              ReversePrint(head.next);
              System.out.println(head.data);
          }
      }
      