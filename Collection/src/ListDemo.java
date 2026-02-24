import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        //Creating List
        List<String> list1 = new ArrayList<>();
        System.out.println("Initial List : " + list1);

        //Adding Elemets :  add(object o)
        list1.add("Atharva");
        list1.add("Praful");
        list1.add("ram");
        System.out.println("After 1st Add : " + list1);

        //Adding elements: add(int index, object o)
        list1.add(3,"ravi");
        list1.add(2,"ram");
        System.out.println("After 2nd add : "+list1);

        //Adding all elements of collection to another collction.
        List<String> list2=new ArrayList<>();
        list2.add("sham");
        list2.add("Ranjan");
        list2.addAll(list1);
        System.out.println("After addAll() : "+list2);

        //get element
        System.out.println("Element at index 2 : "+ list2.get(2));

        //set elememt at any index
        list1.set(0,"ramesh");
        System.out.println("After set() : "+list1);

        //check if the collection includes the element
        System.out.println("Contains ramesh : "+list1.contains("ramesh"));
        System.out.println("Contains Ramesh :"+list1.contains("Ramesh"));

        //Check the first occurrence of element
        System.out.println("1st occurrence of ram : "+list2.indexOf("ram"));

        //Check the Last occurrence of element
        System.out.println("Last occurrence of ram : "+list2.lastIndexOf("ram"));

        //size of list
        System.out.println("Size of List : "+list2.size());

        //Check if the list is empty or not
        System.out.println("Is List Empty ? : "+ list1.isEmpty());

        //to remove element direct
        list2.remove("ram");
        System.out.println("List After 1st remove : " + list2);

        //to remove element at given index
        list2.remove(2);
        System.out.println("List after 2nd remove : "+ list2);

        // to remove all the element of given list from another list
        list2.removeAll(list1);
        System.out.println("After removeAll : "+list2);

        //for loop iteration
        System.out.println("using for loop : ");
        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }

        //Enhanced For Loop
        System.out.println("Enhanced For Loop : ");
        for(String str:list1){
            System.out.println(str);
        }

        //Using iterator()
        System.out.println("Using iterator() : ");
        Iterator<String> str=list1.iterator();
        while(str.hasNext()){
            System.out.println(str.next());
        }

        //sort list
        System.out.println("List before Sorting : "+ list1);
        Collections.sort(list1);
        System.out.println("List After Sorting : "+ list1);

        //reverse list
        System.out.println(("List before reverse : "+ list1));
        Collections.reverse(list1);
        System.out.println("List After reverse : " + list1);

    }

}
