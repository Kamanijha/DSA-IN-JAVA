

public class Program2 {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50};

        System.out.println(nums);  // this will print the arr object reference
        displayNum(nums); // this will print all element inside the array
    }

    public static void displayNum(int[] num){
        for(int x :num){
            System.out.println(x);
        }
    }
}
