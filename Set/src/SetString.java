import java.util.HashSet;
import java.util.Set;

public class SetString {
    public static void main(String[] args) {
        Set<String> hs=new HashSet<>();
        System.out.println(hs);

        //adding elements to
        hs.add("A");
        hs.add("R");
        hs.add("R");
        hs.add("M");
        System.out.println(hs);
    }
}
