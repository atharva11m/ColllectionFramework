import java.util.ArrayList;
import java.util.Collection;

public class RemovingElements {
    public static void main(String[] args) {
        Collection<String> fruits=new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Strawberry");

        System.out.println(fruits);


        //Remove Specific Element
        fruits.remove("Apple");
        System.out.println(fruits);

        //Remove all elements in another collection
        Collection<String> dupl=new ArrayList<>();
        dupl.add("Mango");
        dupl.add("Orange");

        System.out.println(dupl);


        fruits.removeAll(dupl);
        System.out.println(fruits);


        //removes all elements in collection object.
        dupl.clear();
        System.out.println(dupl);


    }
}
