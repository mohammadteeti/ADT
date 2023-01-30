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







    }
}
