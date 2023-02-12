
package Tree;

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
public class Tree<T> {

    class Node {
        T value ;
        Node left;
        Node right;
        Node parent;

        Node(T v, Node l,Node r,Node p){
            value=v;
            parent=p;
            right=r;
            left=l;
        }
    }

    Node root=null;


    public void add (T v){
            
            if(root == null){
                root= new Node(v,null,null,null);
                return;
            }
            Node n=root;
            while (!(n.right==null && n.left==null)){
                    n=n.right;
            }

    }
    
}
