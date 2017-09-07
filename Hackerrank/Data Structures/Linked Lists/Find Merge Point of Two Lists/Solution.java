/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists
 */
/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method.
    HashSet<Node> set = new HashSet<Node>();
    Node pointerNode = headA;
    while(pointerNode != null){
        set.add(pointerNode);
        pointerNode = pointerNode.next;
    }
    pointerNode = headB;
    while(pointerNode != null){
        if(set.contains(pointerNode))
            return pointerNode.data;
        pointerNode = pointerNode.next;
    }
    return -1;
}
