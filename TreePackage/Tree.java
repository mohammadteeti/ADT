
package TreePackage;

import java.util.LinkedList;
import java.util.Queue;

/*
 *              A
 *             / \
 *            B   C
 *           / \ / \
 *           D E F  G 
 * 
 * Node      A,B,C,D,E,F,G ..etc
 * 
 * Root      A
 * 
 * Parent    Parent(D):B     Parent(C):A
 * 
 * Children  Children(A) {B,C}  Children(D):Null
 * 
 * Sibling   {B,C}  {D,E} {F,G} share same parent
 * 
 * Leave     Final Nodes with no Children
 * 
 * Branch    Link Between two Nodes
 * 
 * Internal  Node    Nodes between level 0 and Leaves
 * 
 * Ancestor  All Parent Nodes  of a specif Node
 * 
 * Edges     Edges=#Nodes-1  (Root has No Edge)
 * 
 * Depth     #Nodes passed to reach a specif Node
 * 
 * Height    #Number of levels decingding from a Node
 * 
 * In-Degree        #Nodes from which a specif Node descended  
 *                  Ex. In-degree(B)=1
 * 
 * Out-Degree       #Nodes which descends from a specific Node 
 *                  Ex. Out-Degree(B)=2
 * 
 * Total-Degree     InDegree+outDegree Ex. TotalDegree(B)=3
 * 
 * Paranthetical Notation :  (A(B(D,E),C(F,G)))
 * 
 * 
 * 
 * 
 */

 class Node<T> {
    T value ;
    Node left;
    Node right;
    
    Node(T v, Node l,Node r){
        value=v;
        right=r;
        left=l;
    }
}
public class Tree<T> {

 

    Node<T> root=null;



    /**
     * void method that prints the nodes of a tree in a pre-order-traversal
     * @param root :starts with tree root 
     * 
     */
    void preOrder(Node<T> root){
        if(root!=null){
            System.out.println(root.value);
            preOrder(root.left);
            preOrder(root.right);
            
        }
    }

    /**
     * void method that prints the nodes of a tree in  In-order-traversal
     * @param root :starts with tree root 
     * 
     */
    void inOrder(Node<T> root){
        if(root!=null){
            
            inOrder(root.left);
            System.out.println(root.value);
            inOrder(root.right);
            
        }
    }

    /**
     * void method that prints the nodes of a tree in a post-order-traversal
     * @param root :starts with tree root 
     * 
     */

    void postOrder(Node<T> root){
        if(root!=null){
            
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.value);
            
        }
    }

    /**
     * Implementation of Leve -Order traversal (under Breadth First Traversal)
     * initializes queue with tree root and assign current pointer to it
     * visits left and right nodes of current pointer
     * push them into the q
     * address peek value as visited 
     * pop out the peek value 
     * repeat until queue is empty 
     * @param root
     */
    void levelOrder(Node<T> root){
        if (root==null)
            return;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        

        while(!q.isEmpty()){

            Node<T> current=q.peek();
            if (current.left!=null)
                q.add(current.left);

            if (current.right!=null)
                q.add(current.right);
            
            //address peek value as visited after discovering its child nodes
            System.out.print(q.peek().value);
            System.out.print(" ");

            
            //pop it out ,poll method can be used directly in the print statment
            //it's used here only for demonstration process
            q.poll(); 



        }
        
        System.out.println("\n");
    }

    }
    

