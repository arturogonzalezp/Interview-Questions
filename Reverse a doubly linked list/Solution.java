/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list
 */
/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) {
    if(head == null)
        return head;
    Node pointerNode = head;
    while(pointerNode != null){
        Node tempNode = pointerNode.next;
        pointerNode.next = pointerNode.prev;
        pointerNode.prev = tempNode;
        pointerNode = pointerNode.prev;
    }
    pointerNode = head;
    while(pointerNode.prev != null){
        pointerNode = pointerNode.prev;
    }
    return pointerNode;
}
