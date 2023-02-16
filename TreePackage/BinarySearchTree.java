package TreePackage;

/**
 * Concrete Class that implements the Binary Search Tree Data structure in java
 * 
 */
public class BinarySearchTree {

    class Node {
        int value;
        Node left, right;

        Node(int val, Node l, Node r) {
            value = val;
            left = l;
            right = r;

        }
    }

    Node root = null;

    /**
     * addition method recursively adds new values to the tree
     * 
     * @param val : new value to be add
     * @param n   : initially the root of the tree
     */
    void add(int val, Node n) {
        if (root == null) {
            root = new Node(val, null, null);
            ;
            return;
        }

        if (n == null)
            return;

        if (val <= n.value) {
            if (n.left == null)
                n.left = new Node(val, null, null);
            else
                add(val, n.left);
        } else if (val > n.value) {
            if (n.right == null)
                n.right = new Node(val, null, null);
            else
                add(val, n.right);
        }
    }

    /**
     * Search method ,searches for a specific value in the binary tree
     * recursively traverse through tree depth
     * 
     * @param val the value to search for
     * @param n   initially the tree root
     */
    void search(int val, Node n) {
        if (root == null) {
            System.out.println("Not Found ");
            return;
        }

        if (val == n.value) {

            System.out.print("Found at\t");
            System.out.println(n.toString().split("@")[1]);
            return;
        } else if (val < n.value) {
            if (n.left != null)
                search(val, n.left);
            else {
                System.out.println("Not found");
                return;
            }
        } else {
            if (n.right != null)
                search(val, n.right);
            else {
                System.out.println("Not found");
                return;
            }
        }

    }

    /**
     * finds the depth of BST
     * 
     * @param r initially :the root value
     * @return integer number equals to the edges from root to deepest leaf (depth)
     */
    int getDepth(Node r) {

        if (root.left == null && root.right == null)
            return 0; // one element depth = 0

        if (r == null)
            return -1; // step back as depth starts for -1 from empty tree (no root)

        // the 1 adds up for each level passed
        return 1 + Math.max(getDepth(r.left), getDepth(r.right));
    }


    void delete(int val, Node prev, Node r) {// when called in main prev must be null (first time call)

        if (root == null) {
            System.out.println("Empty Tree!");
            return;
        }

        if (val == r.value) {
            if (r.left == null && r.right == null && r != root) { // delete leaf ,!=root asserts prev to not equal null
                if (r == prev.left)
                    prev.left = null;
                else
                    prev.right = null;
                System.out.println("Leaf value deleted!");

            } else { // Not leaf value

                System.out.println("Not leaf value !");
                // if code reaches here it means the node is either a root ,a one child Node or
                // a perfect node

                if (r.left != null && r.right != null) { // a perfect node
                    // a 2-children Node (subtree)
                    System.out.println("perfect Node , need to find successor ");
                    Node successor =successor(prev, r);
                    if (r == prev.left){
                        
                        prev.left.value = successor.value;
                        //we have to delete successor and if it has child we should 
                        //re connect the successor child to the successor parent

                    }
                    else{
                        prev.right.value = successor.value;
                        //we have to delete successor and if it has child we should 
                        //re connect the successor child to the successor parent
                    }

                } else { // one child node
                    if (r.left != null)
                        if (r == prev.left)
                            prev.left = r.left;
                        else
                            prev.right = r.left;
                    else if (r == prev.left)
                        prev.left = r.right;
                    else
                        prev.right = r.right;
                }

            }

        } // value not found at current node , traverse throgh tree to stand on the wanted
          // node
        else if (val <= r.value) {
            // if value is smaller search the left side as we are traversing a binary search
            // tree
            delete(val, r, r.left);
        } else {
            // if value is greater search the right side as we are traversing a binary
            // search tree
            delete(val, r, r.right);
        }
    }

    /**
     * if r has a right sub tree -> successor is the minimum value in that sub tree
     * if r dosn't have a right sub tree and r is a left child then successor is
     * prev =>(parent)
     * if r dosn't have a right sub tree and r is a right child then
     * look up for an upper parent Node that is a left child
     * 
     * @param prev : prev of current Node on each recursion
     * @param r    :Node to be deleted
     * @return : returns Node that is successor to r
     */
    private  Node successor(Node prev, Node r) {

        if (r.right != null) { // first case where r has right sub tree
            return min(r.right);
        }

        if (prev.left == r) { // second case where r is a left children and r dosn't have a right subtree
            return prev; // successor is parent
        }

        // if (prev.right == r) {// thrid case where r dosn't have a right subtree and r is a right child
        //     //look up  for an opposit direction node (an upper parent that is left child)

            
            
        //     Node current =root;
        //     Node prevCurrent = root;

        //     while(current!=prev){
        //         if (prev.value>current.value){
        //                 prevCurrent=current;
        //                 current=current.right;
        //         }
        //         else{
        //             prevCurrent=current;
        //             current=current.left;
        //         }

        //     }
                
        // }

        return r;
    }

    public static Node min(Node node) {

        if (node.left == null && node.right == null)
            return node;

        while (node.left!=null){
            node=node.left;
        }
        return node;
    }

    int minRec (Node r){
        if (r.left==null)
            return r.value;
        
        return minRec(r.left);

    }

    /**
     * Views the elements of the tree in preOrder Traversal recursively
     * 
     * @param r initially the root of the tree
     */
    void preOrder(Node r) {
        if (r == null)
            return;

        System.out.print(r.value + "\t");
        System.out.print(r.toString().split("@")[1]);
        System.out.println();
        preOrder(r.left);
        preOrder(r.right);

    }

}
