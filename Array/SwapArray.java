public class SwapArray {
    public static void main(String[] args) {
        int[] arr= {12,13,14,15,16};
        int[] a = {1,2,3,4,5};
        displayElement(arr);
        displayElement(a);
        // int[] temp = a;
        // a = arr;
        // arr= temp;
        swap(arr, a);
        System.out.println("after swap the array");
        displayElement(arr);
        displayElement(a);
    }
     public static void swap(int[] a,int[] b){
            int[] temp = a;
            a =b;
            b = temp;
     }

    public static void displayElement(int[] arr){
          for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
          }
          System.out.println();
    }
}
