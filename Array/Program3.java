
import java.util.*;
public class Program3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size :");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("array element before initilazation");

        displayNum(nums);
        for(int i = 0;i<nums.length;i++){
            System.out.println("enter number :"+ (i+1));
            nums[i] = sc.nextInt();
        }
        System.out.println("Array elements After Initialization: ");
		displayNum(nums);

    }

     public static void displayNum(int[] num){
        for(int x :num){
            System.out.println(x);
        }
    }
}
