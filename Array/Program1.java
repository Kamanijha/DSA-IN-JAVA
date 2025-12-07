

public class Program1 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        for(int i = 0;i<arr.length;i++){     // this loop used in array for indexing 
            System.out.println(arr[i]);
        }

        for(int x : arr){
            System.out.println(x);  // this loop can be use whithout for indexing
        }
    }
}
