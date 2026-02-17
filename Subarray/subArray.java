

public class subArray {
    public static void main(String[] args) {
        int[] arr= {1,-2,-3,4,5};
        //printsubArray(arr);
       int res = maxSubArraySum(arr);
       System.out.println(res);
    }

    public static void printsubArray(int[] a){
        for(int st = 1;st<=a.length;st++){
            for(int end = st;end<=a.length;end++){
                for(int i = st;i<=end;i++){
                    System.out.print(i);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    public static int maxSubArraySum(int[] a){
        int maxSum = 0;
        for(int st = 0;st<a.length;st++){
            int currSum = 0;
            for(int end = st;end<a.length;end++){
                currSum = currSum+ a[end];
                maxSum = Math.max(currSum,maxSum);
            }
        }
        return maxSum;
    }
}
