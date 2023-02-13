package TreePackage;



/**
 * Concrete Class that implements the Binary Search Tree Data structure in java
 * 
 */
public class BinarySearchTree {

    class Node{
        int value;
        Node left,right;

         Node (int val,Node l,Node r){
            value=val;
            left=l;
            right=r;

        }
    }

    Node root =null;

    /**
     * addition method recursively adds new values to the tree
     * @param val : new  value to be add 
     * @param n : initially the root of the tree
     */
    void add(int val , Node n){
        if (root==null){
            root=new Node(val, null, null);;
            return;
        } 

        if (n==null)
            return;

        if ( val <= n.value){
            if (n.left==null)
                n.left=new Node(val, null, null);
            else
                add(val,n.left);
        }
        else if (val>n.value){
            if (n.right==null)
                n.right=new Node(val, null, null);
            else
                add(val, n.right);
        }
    }


    /**
     * Views the elements of the tree in preOrder Traversal  recursively
     * @param r initially the root of the tree
     */
    void preOrder(Node r){
        if(r==null)
            return;
        
        System.out.println(r.value);
        preOrder(r.left);
        preOrder(r.right);

        
    }
    
}
