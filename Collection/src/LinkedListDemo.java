import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        //Create LinkedList
        LinkedList<String> list1=new LinkedList<>();
        System.out.println("initial List : "+ list1);


        //Adding Elements
        list1.addFirst("B");
        list1.addLast("C");
        list1.add("D");
        list1.addFirst("A");
        list1.addLast("E");
        System.out.println("After Adding elements : "+ list1);

        //Accessing elements
        System.out.println("First Element : "+list1.getFirst());
        System.out.println("Last Element : " + list1.getLast());
        System.out.println("First Element : "+ list1.peekFirst());
        System.out.println("Last Element : "+ list1.peekLast());

        //Removing Elements
        list1.removeFirst();
        list1.removeLast();
        System.out.println("After remove() : "+ list1);

        list1.pollFirst();
        list1.pollLast();
        list1.poll();
        System.out.println("After Poll() : " + list1);


        //Iteration(Desending)
        list1.add("ABC");
        list1.add("XYZ");
        list1.add("PQR");
        list1.add("UVW");

        Iterator<String> str=list1.descendingIterator();
        while(str.hasNext()){
            System.out.println(str.next());
        }


    }
}
