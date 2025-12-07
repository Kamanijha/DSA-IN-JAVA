public class Swap {
    public static void main(String[] args) {
        int[] nums={10,20,30,40,50};
        System.out.println("before swap the element ");
        displayNums(nums);
        int index1= 1; int index2 = 4;
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
        System.out.println("After Swap array elements are: ");
		displayNums(nums);

    }


    public static void displayNums(int[] nums){
        for(int x: nums){
            System.out.println(x);
        }
    }
}
