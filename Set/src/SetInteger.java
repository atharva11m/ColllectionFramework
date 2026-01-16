import java.util.HashSet;
import java.util.Set;

public class SetInteger {
    public static void main(String[] args) {
        Set<Integer> hs=new HashSet<>();
        System.out.println(hs);

        //Adding elements to set
        hs.add(10);
        hs.add(10);  //It is ignoring a duplicate
        hs.add(20);



    }
}
