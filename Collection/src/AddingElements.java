import java.util.ArrayList;
import java.util.Collection;

public class AddingElements {
    //We cannot create object of collecyion direclty because it is interface. Hence we use its implementation
    //as ArrayList class.
    public static void main(String[] args) {
        // Creating a collection using ArrayList implementation
        Collection<Integer> al=new ArrayList<>();


        //Adding Individual elements
        al.add(10);
        al.add(20);
        al.add(30);
        //Priting ArrayList
        System.out.println(al);


        //Adding al collection to another collection
        Collection<Integer> al2=new ArrayList<>();
        al2.add(40);
        al2.add(50);
        System.out.println(al2);

        //andAll is used to add all elements of collection to another collection.
        al2.addAll(al);
        System.out.println(al2);


        //retainAll method retains only elements present in collection
        al2.retainAll(al);
        System.out.println(al2);



    }
}
