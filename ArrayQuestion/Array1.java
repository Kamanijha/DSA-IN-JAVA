
public class Array1 {
    public static void main(String[] args) {
        // int[] a= {1,2,4,5,6}; // b
        // int[] b ={12,3,4,67}; // a
        // System.out.println("before swap : "+ a);
        // System.out.println("before swap : "+b);
        // displayElement(a);
        // displayElement(b);
        // sawp(a,b);
        // int[] temp = a;
        // a = b;
        // b = temp;
        // System.out.println("==============");
        // displayElement(a);
        // displayElement(b);

        String[] arr = { "mango","apple","papaya","lit"};
        // for(int i = 0;i<arr.length;i++){
        // //System.out.print(arr[i] + " ");
        // int cnt = PrintString(arr[i]);

        // }
        // coutLengthOfArray(arr);
       // coutLengthOfArray(arr);
        String[] strings = {"apple", "banana", "kiwi", "grapefruit", "orange"};
        // String longest = findLongestString(arr);
        // System.out.println("The longest string is: " + longest);
        stringWithEvenNumberOfChar(strings);
        int[] a = {1,2,3,4};
        int[] b = runningSum1(a);
        for(int x:b){
            System.out.print(x+" ");
        }

    }

    // q1
    public static void displayElement(int[] nums) {
        for (int x : nums) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void sawp(int[] a, int[] b) {
        int[] temp = a;
        a = b;
        b = temp;
    }

    // q. 2
    // public static void demonstrateValueAndRef(){

    // }

    // q. 3
    // public static void coutLengthOfArray(String[] s) {
    
    //     for (int i = 0;i<s.length;i++) {
    //         // System.out.println(s[i]);
    //         int count=  countElementLength(s[i]);
            
    //         System.out.println(s[i] +" is :"+count);
            
    //     }
        
    // }

    // public static int countElementLength(String str) {
    //     int count = 0;
    //     for (int i =0;i<str.length();i++) {
    //         count++;
    //     }
    //    return count;
    // }
    

    // q. 4     // this logic is not working 
    // 
    
    public static String findLongestString(String[] arr){
        if(arr== null && arr.length == 0){
            return null;
        }
        String longestString = "";
        for(String s:arr){
            if(s !=null && s.length() > longestString.length()){
                longestString = s;
            }
        }
        return longestString;
    }

    // q. 5
    public static void stringWithEvenNumberOfChar(String[] s) {
    
        for (int i = 0;i<s.length;i++) {
            // System.out.println(s[i]);
            int count=  countElementLength(s[i]);
            if(count % 2 ==0){
                System.out.println(s[i] +" is :"+count);

            }
            
        }
        
    }

    public static int countElementLength(String str) {
        int count = 0;
        for (int i =0;i<str.length();i++) {
            count++;
        }
       return count;
    }
    // q. 7
    public static int[] runningSum(int[] arr){
        int[] b = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            int sum = 0;
            for(int j = 0;j<=i;j++){
                sum = sum+arr[j];
                b[i] = sum;
            }
        }
        return b;
    }
    // q. 7
    public static int[] runningSum1(int[] a){
        int[] b = new int[a.length];
        int sum = 0;
        for(int i = 0;i<a.length;i++){
            sum = sum+a[i];
            b[i] = sum;
            //sum = sum+a[i];
        }
        return b;
    }
    
}

