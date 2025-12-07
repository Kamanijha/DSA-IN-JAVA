
public class Array {
    public static void main(String[] args) {
        int[] arr = { 12,1,56,0,98,2 };
        // evenIndexElements(arr);
        //evenElements(arr);
       // countAllEvenElements(arr);
       //elementFromEnd(arr);
       //sumOfElements(arr);
       //biggerThanAverage(arr);
       biggestAndSmallest(arr);
        // for(int i = 0;i<arr.length;i++){
        // System.out.println(arr[i]);
        // }
    }

    // q.1
    public static void evenIndexElements(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                System.out.println(a[i]);
            }
        }
    }

    // q. 2
    public static void evenElements(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
    }

    // q. 3
     public static void countAllEvenElements(int[] a){
        int count = 0;
        for(int x : a){
            if(x % 2 == 0){
                System.out.println(x);
                count++;
            }
        }
        System.out.println(count);
     }
   // q. 4
    public static void elementFromEnd(int [] a){
        for(int i = a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }

    // q 6
    public static void sumOfElements(int[] a){
        int sum =0;
        for(int i = 0;i<=a.length-1;i++){
            sum = sum +a[i];
        }
        System.out.println(sum/a.length-1);
    }

    // q. 7
    public static int average(int[] a){
        int sum =0; int avg = 0;
        for(int i = 0;i<=a.length-1;i++){
            sum = sum +a[i];
        }
       return sum/a.length-1;
    }

    // q. 8
    public static void biggerThanAverage(int[] a){
        int sum =0; int avg = average(a);
        // for(int i = 0;i<=a.length-1;i++){
        //     sum = sum +a[i];
        // }
        //avg = sum/a.length-1;
        for(int x:a){
            if(avg<x){
                System.out.println(x);
            }
        }
    }

    // q. 12
     public static void biggestAndSmallest(int[] a){
        int big = a[0];  int small = a[0];
        for(int i =0;i<a.length;i++){
            if(big <a[i]){
                big = a[i];
            }else{
                if(small >a[i]){
                    small = a[i];
                }
            }
        }
        System.out.println(big);
        System.out.println(small);
     }
}
