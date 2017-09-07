/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle
 */
/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    HashSet<Node> set = new HashSet<Node>();
    Node pointerNode = head;
    while(pointerNode != null){
        if(set.contains(pointerNode))
            return true;
        set.add(pointerNode);
        pointerNode = pointerNode.next;
    }
    return false;
}
