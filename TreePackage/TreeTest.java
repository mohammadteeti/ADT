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


        System.out.println("get depth ");
        System.out.println(bst.getDepth(bst.root));
        System.out.println("Find Minimum ");
        System.out.println(BinarySearchTree.min(bst.root).value);
        
        
        bst=null;
        bst=new BinarySearchTree();
        bst.add(45, bst.root);
        bst.add(50, bst.root);
        bst.add(30, bst.root);
        bst.add(80, bst.root);
        System.out.println("Values : ");
        bst.preOrder(bst.root);
        System.out.println("get depth ");
        System.out.println(bst.getDepth(bst.root));
        
        System.out.println("Delete Value");
        //bst.delete(45, null,bst.root);

        bst.preOrder(bst.root);

        System.out.println("Find Minimum ");
        System.out.println(BinarySearchTree.min(bst.root).value);
        System.out.println("min\t"+bst.minRec(bst.root));

        bst=new BinarySearchTree();
        bst.add(5, bst.root);
        bst.add(0, bst.root);
        bst.add(90, bst.root);
        bst.add(2, bst.root);
        bst.add(1, bst.root);

        System.out.println("Find Minimum ");
        System.out.println(BinarySearchTree.min(bst.root).value);

        System.out.println("min\t"+bst.minRec(bst.root));

    }


    
}




