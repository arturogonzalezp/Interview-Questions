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
         int Data;
         Node Next;
      }
    */

    // This is a "method-only" submission.
    // You only need to complete this method.

    public static Node Delete(Node head, int position)
    {
        if(head == null)
            return head;
        if(position == 0)
            return head.Next;
        Node pointerNode = head;
        for(int i = 0; i < position-1; i++){
            if(pointerNode.Next == null)
                break;
            pointerNode = pointerNode.Next;
        }
        if(pointerNode.Next == null)
            return head;
        pointerNode.Next = pointerNode.Next.Next;
        return head;
    }