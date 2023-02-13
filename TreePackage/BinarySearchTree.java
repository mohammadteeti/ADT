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
     * Search method ,searches for a specific value in the binary tree
     * recursively traverse through tree depth 
     * @param val the value to search for 
     * @param n  initially the tree root 
     */
    void search (int val,Node n){
        if (root == null){
            System.out.println("Not Found ");
            return;
        }

        if (val == n.value){
            
            System.out.print("Found at\t");
            System.out.println(n.toString().split("@")[1]);
            return;
        }
        else if (val<n.value){
            if(n.left!=null)
                search(val, n.left);
            else {
                System.out.println("Not found");
                return;
            }
        }
        else {
            if(n.right!=null)
                search(val, n.right);
            else {
                System.out.println("Not found");
                return;
            }
        }
            
        }



    

    /**
     * Views the elements of the tree in preOrder Traversal  recursively
     * @param r initially the root of the tree
     */
    void preOrder(Node r){
        if(r==null)
            return;
        
        System.out.print(r.value+"\t");
        System.out.print(r.toString().split("@")[1]);
        System.out.println();
        preOrder(r.left);
        preOrder(r.right);

        
    }
    
}
