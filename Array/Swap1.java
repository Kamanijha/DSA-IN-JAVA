public class Swap1 {
    public static void main(String[] args) {
        int[] nums={10, 20, 30, 40, 50};

		System.out.println("Before Swap array elements are: ");
		displayValues(nums);

		int i=1,	j=3;
		swap(nums, i, j);

		System.out.println("After Swap array elements are: ");
		displayValues(nums);
    }

    public static void swap(int[] a, int i, int j){
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}


    public static void displayValues(int[] arr){
		for(int x:arr){
			System.out.print(x+" ");
		}
		System.out.println();
	}
}
