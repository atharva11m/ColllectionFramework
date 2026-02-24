import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        //Here We are implementing the Arraylist class.
        //add() is used to add single element in a collection.
        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(11);
        arr1.add(22);
        System.out.println(arr1.add(33));
        System.out.println(arr1);

        //addAll() is used to add all elements from one colletion to another.
        ArrayList<Integer> arr2=new ArrayList<>();
        arr2.add(44);
        arr2.add(55);
        arr2.add(66);
        System.out.println(arr2);
        arr2.addAll(arr1);
        System.out.println(arr2);

        //size() gives the total numbers of element present in the collection.
        System.out.println(arr1.size());
        System.out.println(arr2.size());

        //isEmpty() checks if the colelctrion has 0 elements or not means empty or not
        System.out.println(arr1.isEmpty());
        System.out.println(arr2.isEmpty());

        //contains()  checks whether it conatins element or not.
        System.out.println(arr1.contains(11));
        System.out.println(arr1.contains(55));

        //containsAll() checks wheather it contains all elements the from one collection in other collection.
        System.out.println(arr2.containsAll(arr1));

        //clear() removes all the elements from the collection.
        ArrayList<Integer> arr3=new ArrayList<>();
        arr3.add(11);
        arr3.add(22);
        arr3.add(33);
        System.out.println(arr3);
        arr3.clear();
        System.out.println(arr3);

        //remove() removes single element from collection.
        arr3.add(11);
        arr3.add(22);
        arr3.add(33);
        arr3.add(44);
        System.out.println(arr3);
        arr3.remove(3);

        //removeAll removes all thge elem ents present inside the another collection.
        System.out.println(arr2);
        arr2.removeAll(arr3);
        System.out.println(arr2);

        //retainAll() retans all elemnets from the other collection
        System.out.println(arr1);
        arr1.retainAll(arr3);
        System.out.println(arr1);

        //iterator() methods returns iterateobject of Iterate interface.
        Iterator<Integer> it=arr1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
