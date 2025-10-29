public class Loop1111 {
    public static void main(String[] args) {
        //isPalindromeString("madam");
        alternatingDigitSum(111);
    }

    // public static void isPalindromeString(String s){
    //     String 
    //     String rev = "";
    //     for(int i = s.length()-1;i>=0;i--){
    //         rev= rev+s.charAt(i);
    //     }
    //     if()
    // }
    
    // 40
    public static void alternatingDigitSum(int n){
        int sum = 0;
        int position = 1;
        while(n>0){
            int rem = n%10;
            if(position %2 == 0){
                sum = sum -rem;
            }else{
               sum = sum +rem; 
            }
            position++;
            n/=10;
        }
        System.out.println(sum);
    }
}
