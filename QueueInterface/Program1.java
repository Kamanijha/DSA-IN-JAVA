import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Program1 {
    public static void main(String[] args) {
        //Queue <Integer> queue = new PriorityQueue<>(); // it is not maintain the order of insertion 
        Queue <Integer> queue = new LinkedList<>(); // it is mantian the order of insertion
        queue.add(23);queue.add(12);queue.add(42);queue.add(62);
        queue.add(22);
        queue.add(19);queue.add(32);
        //System.out.println(queue);

        // for (Integer num : queue) {
        //     if (num % 2!=0) {
        //         System.out.println(num);
        //     }
        // }
       
        // print element usinug iterator cursor
       Iterator<Integer> itr =   queue.iterator();
    //    while (itr.hasNext()) {
    //     System.out.println(itr.next());
    //    }

    while (itr.hasNext()) {
        int num = itr.next();
        if(num %2 ==0){
            System.out.println(num);
        }
       }
    }
}
