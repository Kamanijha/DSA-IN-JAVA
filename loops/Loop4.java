class Loop4{
    public static void main(String[] args){
        // int n = 128;
        // boolean res = powerOfTwo(n);
        // System.out.println(res);
        // int n = 1243768;
         
        // int res = alternateDigitSum(n);
        // System.out.println(res);

        //int res = getZero(50);
        // int res = getNumberToZero(15);
        // System.out.println(res);
        getFactOfAllDgit(123);
    }

    // public static boolean powerOfTwo(int n){
    //     int cnt = 0;
    //     while(n > 0){
    //         int bit = n % 2 ;
    //         if(bit == 1){
    //             cnt ++;
              
    //         }
    //       n /= 2;     
    //     }
    //     return cnt == 1;
    // }



// check the logic again  this i snot working
    public static boolean powerOfTwo(int n){
        while(n > 0){
            int bit = n %2 ;
            if(bit != 0)
                return false;
            n /= 2;    
        }
        return n == 1;
    }

    public static int alternateDigitSum(int n) {
        int sum = 0;
        int position = 1;
        while( n > 0){
            int digit = n % 10;
            if(position % 2 == 0){
                sum = sum -digit;
            }else{
                     sum = sum + digit;
            }
            position ++;
            n /= 10;
        }
        return sum ;
    }
    // traling zero
    public static int getZero(int n){
        int sum = 0;
        while(n >= 5){
            sum = sum + n/5;
            n/= 5;
        }
        return sum;
    }

    public static int getNumberToZero(int n){
        int cnt = 0;
        while(n>0){
            if(n % 2 == 0){
                n = n/2;
            }else{
                n = n-1;
            }
            cnt ++;
        }
        return cnt;
    }

    public static void getFactOfAllDgit(int n){
        int fact = 1;
        while(n > 0){
            int i = 1;
            while( i <= n){
                fact = fact * i;
                i++;
            }
            n /= 10;
        }
        System.out.println("the factorial is :" +  fact);
        
    }
    
    
}