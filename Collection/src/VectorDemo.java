import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        System.out.println("Initial,Vetcor : " + vector);


        //Adding elements in vetcor
        vector.addElement(11);
        vector.addElement(22);
        vector.addElement(33);
        System.out.println("After addElement() : " + vector);

        //inserting elements at specific position.
        vector.insertElementAt(44,2);
        System.out.println("After insertElementAt() : "+ vector);


        //get element.
        System.out.println("Element at index 2 : " + vector.elementAt(2));
        System.out.println("First Element : " + vector.firstElement());
        System.out.println("Last Element : " + vector.lastElement());

        //Set element at specific position
        vector.set(2,33);
        vector.setElementAt(44,3);
        System.out.println("Updated vector : "+ vector);

        //Removing elements
        vector.removeElement(11);
        vector.removeElementAt(0);
        System.out.println("Remaining vector : "+ vector);
        vector.removeAllElements();
        System.out.println("After removing All : "+ vector);

        //capacity of vector it is by default 10;
        System.out.println("Default Capacity : "+vector.capacity());
        vector.add(11);
        vector.add(22);
        vector.add(33);
        vector.add(44);
        vector.add(55);
        vector.add(66);
        vector.add(77);
        vector.add(11);
        vector.add(88);
        vector.add(99);
        vector.add(110);
        vector.add(121);
        vector.add(142);

        System.out.println("Increamented capacity : "+ vector.capacity());


    }
}
