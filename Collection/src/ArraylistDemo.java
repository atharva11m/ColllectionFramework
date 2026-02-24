import java.awt.*;
import java.util.ArrayList;
import java.util.ListIterator;

public class ArraylistDemo {
    public static void main(String[] args) {
        //Creating ArrayList
        ArrayList<Integer> list1=new ArrayList<>();
        System.out.println("Initial List : " + list1);

        //To add element in ArrayList by add(E e)
        list1.add(11);
        list1.add(22);
        list1.add(33);
        list1.add(33);
        System.out.println("After add() : "+ list1);

        // To add element in ArrayList at specific position by add(index,element)
        list1.add(3,44);
        list1.add(4,33);
        System.out.println("After 2nd add() : "+ list1);

        // To add all the elements from one Arraylist to other by addAll()
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(11);
        list2.add(12);
        list2.add(21);
        list2.add(22);
        System.out.println("Before addAll() : "+ list2);
        list2.addAll(list1);
        System.out.println("After addAll() : "+ list2);

        //To add all elements from one arraylist to another but from specific position.
        System.out.println("Before 2nd addAll() : "+ list2);
        list2.addAll(1,list1);
        System.out.println("After 2nd addAll() : "+ list2);

        //To get element from collection by index position.
        System.out.println("Element at 3 position : "+list1.get(2));

        //to Pre-allocate internal array capacity.
        list1.ensureCapacity(50);
        System.out.println("Capacity ensured to 50");

        //trimToSize() is
        list1.trimToSize();

        //listIterator(int index)
        System.out.println("Using listIterator backward");
        ListIterator<Integer> litr=list1.listIterator(list1.size());
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }





    }
}
