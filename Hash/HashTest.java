package Hash;

import java.net.Socket;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HashTest {
    
    public static void main(String[] args) {
        HashMap<String,String> map  = new HashMap<>();
        HashSet<String> myset= new HashSet<>();
        map.put("Mohammad", "12354");
        map.put("Ahmad", "12504");
        map.put(null, null);
        map.put("Mohammad", "12354");
        map.put("Mohammad", "12354");

        myset.addAll(Arrays.asList(null,"Rami","Mohammad","Mohammad"));

        System.out.println(map);
        System.out.println(map.get("Mohammad").hashCode());
        System.out.println(map.get("Ahmad").hashCode());

        System.out.println(myset);
        System.out.println(myset.contains("Mohammad"));
        System.out.println(myset);
        HashSet<Integer> set = new HashSet<>();
        set.add(null);

        HashMap<Integer,Integer> map2= new HashMap<>();
        map2.put(null, null);


        List<Integer> arr = Arrays.asList(12,2,3,4,5);

        arr.stream().map(x->x*x).forEach(System.out::println);;
        System.out.println(arr.stream().count());

        IntStream.range(0, 4).forEach(System.out::println);

        IntStream.range(0,20).skip(10).forEach(x->System.out.println(x));
        
        
        System.out.println(IntStream.range(1,6).sum());


        Comparator<String> comp =  new Comparator<String>() {        
                @Override
               public  int compare(String s1, String s2){
                        return 1;
                }
        };

        Stream.of("Mohamamd","Ahmad","Abed","Khalid").sorted(comp)
        .findFirst().ifPresent(System.out::println);

        Stream.of("Mohammad","Ahmad","Abed","Khalid").sorted(comp).forEach(System.out::println);

        String []  names= {"Jasem","Raed","Rami","Leen"};

        Stream.of(names).forEach(System.out::println);
        System.out.println("-------------------------");
        Arrays.stream(names).sorted(comp).filter(x->x.startsWith("R")).forEach(c->System.out.println(c));

        System.out.println("-----------------------");

        Arrays.stream(new int [] {12,15,16,31,32}).map(x->x*x).average().ifPresent(System.out::println);
    }


    
}
