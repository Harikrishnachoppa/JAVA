import java.util.*;
public class Arraydequeuedemo{
    public static void main(String args[]){
        ArrayDeque<Integer>dq=new ArrayDeque();
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        dq.forEach(x->System.out.println(x));
        dq.pollFirst();
        dq.forEach(x->System.out.println(x));

    }
}