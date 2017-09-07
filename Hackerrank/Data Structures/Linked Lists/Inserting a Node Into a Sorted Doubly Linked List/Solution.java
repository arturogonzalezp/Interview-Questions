/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list
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

Node SortedInsert(Node head,int data) {
    Node newNode = new Node();
    newNode.data = data;
    if(head == null)
        return newNode;
    
    Node pointerNode = head;
    while(pointerNode.next != null){
        if(pointerNode.next.data > data)
            break;
        pointerNode = pointerNode.next;
    }
    if(pointerNode.next == null){
        pointerNode.next = newNode;
        newNode.prev = pointerNode;
    }else{
        Node tempNode = pointerNode.next;
        pointerNode.next = newNode;
        newNode.prev = pointerNode;
        newNode.next = tempNode;
        tempNode.prev = newNode;
    }
    return head;
}