/**
 * @author: César Arturo González Pérez
 * @github: arturogonzalezp
 * @webpage: http://arturogp.com
 * 
 * Hackerrank: https://www.hackerrank.com/challenges/compare-two-linked-lists
 */
/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method
    if(headA == null && headB == null)
        return 1;
    if(headA == null ^ headB == null)
        return 0;
    int returnVal = 1;
    while(headA != null && headB != null){
        if(headA.data != headB.data){
            returnVal = 0;
            break;
        }
        headA = headA.next;
        headB = headB.next;
        if(headA == null ^ headB == null){
            returnVal = 0;
            break;
        }
    }
    return returnVal;
}