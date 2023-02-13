package TreePackage;



public class TreeTest {

    public static void main(String[] args) {
        Tree<Integer> t = new Tree<>();
        
        t.root=new Node(5, null, null);
        t.root.left=new Node(6, null, null);
        t.root.right=new Node(8, null, null);
        t.root.left.right= new Node(9,null, null);
        t.root.right.left=new Node (10,null,null);


        System.out.println("Pre-order Traverse");
        t.preOrder(t.root);

        System.out.println("In-order Traverse");
        t.inOrder(t.root);
        

        System.out.println("Post-order Traverse");
        t.postOrder(t.root);

        System.out.println("Leve-Order-Traverse");
        t.levelOrder(t.root);


        System.out.println("##########################3");

        BinarySearchTree bst = new BinarySearchTree();

        bst.add(45, bst.root);
        bst.add(30, bst.root);
        bst.add(88, bst.root);
        bst.add(27, bst.root);
        bst.add(60, bst.root);
        bst.add(100, bst.root);
        bst.add(7, bst.root);

        bst.preOrder(bst.root);

        bst.search(654, bst.root);



        




    }
    
}
