class Loop1{
    public static void main(String[] args){
       
        //printNum(10);
        //printNum1To10(10);
        //printEvenNum(100);
        //printOddNum(100);
        //int res = PrintSevenDivisibleNum(100);
        //System.out.println(res);
        //printAndCountSevens(1000);
        //printAllFactor(12);
        // boolean res = isPrime(7);
        // System.out.println(res);
        // int n = 8;
        // if(isPrime(n)){
        //     System.out.println( n +" is prime number");

        // }else{
        //     System.out.println( n +" is not prime number");
        // }
         //fibNum(7);
         nThFibNum(7);
  


    }

    
    
    public static void printNum(int n){
        int i = 1;
        while(i <= n){
            System.out.println(i);
            i++;
        }
    }

    public static void printNum1To10(int n){
        int i = n;
        while(i >= 1){
            System.out.println(i);
            i--;
        }
    }

    // public static void printEvenNum(int n){
    //     int i = 1;
    //     while(i <= n){
    //         if(i %2 == 0){
    //             System.out.println(i);
    //         }
    //         i++;
    //     }
    // }

    public static void printEvenNum(int n){
        int i = 2;
        while(i <= n){
                System.out.println(i);
            i= i+2;
        }
    }
    public static void printOddNum(int n){
        int i = 1;
        while(i <= n){
            if(i %2 != 0){
                System.out.println(i);
            }
            i++;
        }
    }

    public static int PrintSevenDivisibleNum(int n){
        int i = 1;
        int count = 0;
        while(i <= n){
            if(i % 7 == 0){
                count++;
            }
            i++;
        }
        return count;
        //System.out.println(count);
    }
    // q.7
    public static void printAndCountSevens(int n){
        int i = 1;
        int count = 0;
        while(i <= n){
            if(i % 7 == 0 && i % 10 == 7){
                System.out.println(i);
                count++;
            }
            i++;
        }
        //return count;
        System.out.println(count);
    }

    public static void printAllFactor(int n){
        int i = 1;
        int cnt = 0;
        while(i < n){
            if(n % i == 0){
                System.out.println(i);
                cnt++;
            }
            i++;
        }
        System.out.println(cnt);
    }
    
    // public static boolean isPrime(int n){
    //     if(n <= 1 ) return false;
    //     int i = 2;
    //     while(i < n){
    //         if(n % i == 0){
    //             return false;
    //         } 
    //         i++;
    //     }
    //     return true;
    // }

    public static boolean isPrime(int n){
        if(n < 2) return false;

        int cnt = 0 , i = 2;
        while(i*i <= n){
           
           if(n % i == 0){
            int fact1 = i , fact2 = n/i;
            if(fact1 == fact2)
                cnt++;
            else 
            cnt += 2;

           }
           i++;
        }
        return cnt == 0;  
    }
    // using third varaible 
    public static void fibNum(int n){
        int a = 0,b = 1, i = 1;
        System.out.println(a + " ");
        System.out.println(b + " ");
        int c ;
        while(i < n){
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
            i++;
        }
    }

    // WITHOUT USING THIRD VARABLE C
    // public static void FibNum(int n){
    //     int a = 0;
    //     int b = 1;
    //     int i = 1;
    //     
    //     System.out.print(a + " ");
    //     System.out.print(b + " ");
    //     while(i < n){
    //        b = a+b;
    //        System.out.print(b+ " ");
    //        a = b - a;
    //        i ++;
    //     }
    // }
     

     // print all value from in side loop 
    //  public static void FibNum(int n){
    //     int a = 0;
    //     int b = 1;
    //     int i = 1;
 
    //     while(i <= n+1){
    //        System.out.print(a+ " ");
    //        b = a+b;
    //        a = b - a;
    //        i ++;
    //     }
    // }
     public static void nThFibNum(int n){
        int a = 0,b = 1,i = 1;
        while(i < n){
            b = a +b;
            a = b -a;
            i++;
        }
        System.out.println(b);
     }

}