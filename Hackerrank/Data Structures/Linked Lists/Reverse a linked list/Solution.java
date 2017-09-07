/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/reverse-a-linked-list
 */
/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
    Node Reverse(Node head) {
        if(head == null)
            return head;
        Stack<Node> nodes = new Stack<Node>();
        while(head != null){
            nodes.push(head);
            head = head.next;
        }
        head = nodes.pop();
        Node tempNode = head;
        while(!nodes.empty()){
            tempNode.next = nodes.pop();
            tempNode = tempNode.next;
        }
        tempNode.next = null;
        return head;
    }
    