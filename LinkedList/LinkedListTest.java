package LinkedList;

public class LinkedListTest {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>();

        list.add(15);
        list.add(10);
        list.add(11);
        list.add(113);

        list.display();
        System.out.println("-----------------");
        list.deleteFromEnd();
        list.display();
        System.out.println("-----------------");
        
        list.deleteFromBegining();
        list.display();
        System.out.println("-----------------");
        System.out.println(list.length);
        list.addAt(1, 15);
        list.display();

        System.out.println("-----------------");
        System.out.println(list.search(11));

        System.out.println("-----------------");
        list.deleteFromBegining();
        list.deleteFromBegining();
        list.deleteFromBegining();
        list.deleteFromBegining();
        list.deleteFromBegining();

        System.out.println("-----------------");
        System.out.println("Add new Elements");

        list.add(40);
        list.add(70);
        list.add(60);
        list.add(80);
        list.add(19);

        list.display();

        System.out.println("-----------------");
        System.out.println("Delete specific Value");
        System.out.println("Delete 70");
        list.delete(70);

        list.display();

        System.out.println("Delete 80");
        list.delete(80);
        list.display();



        System.out.println("Add New Values");
        list.add(100);
        list.add(200);
        list.add(500);
        list.add(700);
        list.add(412);
        list.add(234);
        

        list.display();
        System.out.println("Get Middle Value");

        if(list.getMiddleNode()!=null)
            System.out.println("Middle Value = " + list.getMiddleNode().value);


        System.out.println("Reverse List");
        list.reverse();
        list.display();


        LinkedList<Character> list2= new LinkedList<Character>();
        list2.add('A');
        list2.add('B');
        list2.add('C');
        list2.add('D');

        System.out.println("-----------\nBefore Inversion : ");
        list2.display();
        
        System.out.println("-----------\nReverse in recursion");
        list2.reverseByRecursion(list2.head,null);

        list2.display();


        LinkedList<String> list3 = new LinkedList<String>();

        list3.add("Mohammad");
        list3.add("Ahmad");
        list3.add("Khalid");
        list3.add("Rami");
        list3.add("Abed");

        System.out.println("Before Inversion");
        list3.display();

        System.out.println("After Inversion By Recursion");
        list3.reverseByRecursion(list3.head, null);
        
        list3.display();










    }
}
