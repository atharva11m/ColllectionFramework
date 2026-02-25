import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        System.out.println("Initial stack : "+stk);

        //push elements to stack
        stk.push(11);
        stk.push(22);
        stk.push(33);
        stk.push(44);
        System.out.println("After Pushing : "+stk);

        //peek()
        System.out.println("Top Element : "+stk.peek());
        System.out.println("No elements removed : " + stk);


        //search(Object o)
        System.out.println("Position of 11 : "+ stk.search(11));
        System.out.println("Position of 55 (not present) : "+ stk.search(55));

        //pop()
        int num=stk.pop();
        System.out.println("Popped element : "+num);
        System.out.println("Stack after pop : "+ stk);

        //empty()
        System.out.println("is stack empty? : "+stk.empty());

    }
}
