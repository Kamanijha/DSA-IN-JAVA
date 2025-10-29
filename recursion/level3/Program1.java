//package recursion.level3;

public class Program1 {
    public static void main(String[] args) {
        //generateTable(66,1);
        int n = 122;
        int reverse = palindromeNum(n,0);
        if(reverse == n){
            System.out.println(n + " is palindrome number");
        }else{
            System.out.println(n + " is not  palindrome number");
        }
    }
    // q.3
    public static void generateTable(int n,int i){
        if(i>10){
            return;
        }

            System.out.println(n*i);
            generateTable(n,i+1);
        
    }

    // q.4
    public static int sumOfNumber(int n){
        int sum = 0;
        if(n<=100){
            sum = n + sumOfNumber(n+1);
        }
        
        return sum;
    }

    // q. 5
    // public static int squreOfNumber(int n){
        
    //     int sum =0;
    //     if(n<=5){
    //         int square = n*n;
    //         sum = square + squreOfNumber(n+1);
    //     }
    //     return sum;
        
    // }

    // q. 5
    public static int squreOfNumber(int n){
        
        int sum =0;
        if(n>100){
            return 0;
        }
        int square = n*n;
        return sum = square + squreOfNumber(n+1);
        
    }
    // q. 6
    public static int cubeOfNumber(int n){
        
        int sum =0;
        if(n>100){
            return 0;
        }
        int cube = n*n*n;
        return sum = cube + cubeOfNumber(n+1);
        
    }

    // q. 7
    // public static int factorial(int n){
    //     int fact = 1;
    //     if(n <= 5){
    //         fact =  n*factorial(n+1);
    //     }
    //     return fact;
        
    // }

    // CHECK THIS LOGIC AGAIN USING DRY RUN
    // public static int factorial(int n){
    //     int fact ;
    //     if(n < 0){
    //         return 1;
            
    //     }
    //     return fact =  n*factorial(n-1);
        
    // }

    // Q. 8
    public static int getPower(int a ,int b){
        int power = 1;
        if(b > 0){
            return a* getPower(a, b-=1);
        }else{
            return 1;
        }
    }

    // q. 9
    public static int getDigitCount(int n){
        if(n>0){
            return 1+getDigitCount(n/10);
        }else{
            return 0;
        }
    } 
    
    // q10
    public static int getDigitSum(int n){
        if(n>0){
            return n%10 + getDigitSum(n/10);
        }else{
            return 0;
        }
    }

    // q 11
    // public static int reverseNum(int n){
    //     if(n>0){
    //         int rev=  (n%10)*10 ;
    //         return
    //     }else{
    //         return 0;
    //     }
    // }

    // q. 12
    
    // public static int palindromeNum(int n){
    //     int rev = 0;
    //     int original = n;
    //     while (n>0){
    //         int digit = n%10;
    //         rev = rev*10+digit;
    //         n = n/10;
    //     }
    //     return (rev == original)? 1:0;
        
    // }

    public static int palindromeNum(int n, int rev){
        if(n == 0){
            return rev;
        }
            int digit = n%10;
            rev = rev*10+digit;
             return palindromeNum(n/10 , rev);
    }

    
   

    // Q.16
    public static boolean powerOfTwo(int n){
        
        if(n<0 || n%2 != 0){

         return false;
        }
        return powerOfTwo(n/2);
    }
}
