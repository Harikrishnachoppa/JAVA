import java.util.*;
public class priorityqueuedemo{
    public static void main(String args[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            pq.add(sc.nextInt());

        }
        pq.forEach(x->System.out.println(x));
        System.out.println("\n");
        pq.poll();
        pq.forEach(x->System.out.println(x));


        
    }
}