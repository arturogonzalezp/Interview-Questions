# Binary Search Tree : Lowest Common Ancestor

César Arturo González Pérez

09/04/2017

[Hackerrank](https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor)

## Problem

You are given pointer to the root of the binary search tree and two values  and . You need to return the lowest common ancestor (LCA) of ***V1*** and ***V2*** in the binary search tree.

![alt text](https://s3.amazonaws.com/hr-assets/0/1502911253-5a96d423eb-lca.png "Binary Tree")

In the above example, the lowest common ancestor of the nodes ***5*** and ***6*** is the node ***2***, as ***2*** is the lowest common node which has both the nodes ***5*** and ***6*** as it's descendants.

You only need to complete the function.

### Input Format

You are given a function,

```java
static Node lca(Node root,int v1,int v2){

}
```

It is guaranteed that v1 and v2 are present in the tree.

Node is defined as :

```java
 class Node{
     int data;
     Node left;
     Node right;
 }
```

### Output Format

Return the LCA of ***V1*** and ***V2***.

### Sample Input
```
         4
       /   \
      2     7
     / \   /
    1   3 6
```
***V1*** = ***1*** and ***V2*** = ***7***.

### Sample Output

LCA of ***1*** and ***7*** is ***4*** (which is the root).

Return a pointer to the root in this case.