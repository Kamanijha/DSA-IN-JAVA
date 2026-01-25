import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Program1 {
    public static void main(String[] args) {
      
        Set<Integer> set = new HashSet<>();

        set.add(12);set.add(13);set.add(14);set.add(62);
        set.add(22);
        set.add(342);
        
        // this for loop  will not work for set beacuse here not present the index
        // for(int i= 0;i<set.size();i++){
        //    if()
        // }

        // for (Integer num: set) {
        //     if(num%2 == 0){
        //          System.out.println(num);
        //     }
        // }

        // using iterator
        //Iterator<Integer> itr =  set.iterator();
        // while(itr.hasNext()){
        //    int num =  itr.next();
        //    if(num % 2==0){
        //     System.out.println(num);
        //    }
        // }


        // print prime number
        // while(itr.hasNext()){
        //    int num =  itr.next();
        //    if(isPrime(num)){
        //     System.out.println(num);
        //    }
        // }

        getSum(set);
    }

    public static boolean isPrime(int n){
        if(n < 1) return false;
        if(n == 2 && n == 3) return true;
        if(n%2 == 0) return false;
        for(int i = 3;i*i<n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void getSum(Set<Integer> set){
        int sum = 0;
        Iterator<Integer> itr =  set.iterator();
        while(itr.hasNext()){
           int num =  itr.next();
           sum = sum + num;
        }
        System.out.println(sum);
    }
}
