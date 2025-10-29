
import java.util.Scanner;
class Loop11{

    public static void main(String[] args){
        
        //sumOfAllNaturalNum(100);

        //sumOfAllOddNum(100);
        //sumOfAllEvenNum(100);
        //sumOfAllNaturalNumSquare(100);
        //sumOfAllNum(100);
        //sumOfAllNumber(3);
        //sumOfHarmonicSeries(100);
        //sumOfHarmonicEvenSeries(100);
       // sumOfHarmonicOddSeries(100);

       //sumOfHarmonicSquareSeries(100);
    //    sumOfHarmonicCubeSeries(3);
    //    sumOfHarmonicSeries18(3);

       
       // user input q no. 19

    //    Scanner sc = new Scanner(System.in);
    //    System.out.print("Enter number :");
    //    int n = sc.nextInt();
    //    getFactorial(n);
    //    sc.close();
     

      // user input q 21
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number a :");
        // int a = sc.nextInt();
        // System.out.print("Enter number b :");
        // int b = sc.nextInt();
        // getPowerOfTwoNum(a,b);
        // sc.close();
        

        // q.22
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number n :");
        // int n = sc.nextInt();
        // getFactorSum(n);
        // sc.close();

        // q.23
        // Scanner sc = new Scanner(System.in);
        //  System.out.print("Enter number n :");
        //  int n = sc.nextInt();
        // String res =  getPerfectNum(n);
        // System.out.println(res);
        
        int res = getCommonFactor(25,30);
        System.out.println(res);

    }

    public static void sumOfAllNaturalNum(int n){
        int sum = 0;
        int i = 1;
        while(i <= n){
            sum = sum +i;
            i ++;
        }
        System.out.println(sum);
    }

    public static void sumOfAllOddNum(int n){
        int sum = 0;
        int i = 1;
        while(i <= n){
            if(n % i != 0){
               sum = sum +i;
            }
        i ++;
        }
        System.out.println(sum);
    }
    public static void sumOfAllEvenNum(int n){
        int sum = 0;
        int i = 1;
        while(i <= n){
            if(n % i == 0){
               sum = sum +i;
            }
        i++;
        }
        System.out.println(sum);
    }

    public static void sumOfAllNaturalNumSquare(int n){
        int sum = 0;
        int i = 1;
        while(i <= n){
            sum = sum+i*i;
            i++;
        }
         System.out.println(sum);
    }
    //  q. 11
    public static void sumOfAllNum(int n){
        int sum = 0;
        int i = 1;
        while(i <= n){
            sum = sum + i * (i+1)*(i+1);
            i++;
        }
        System.out.println(sum);
    }

    // q.12
    public static void sumOfAllNumber(int n){
        int sum = 0;
        int i = 1;
        while(i <= n){
            sum = sum + i * i *(i+1);
            i++;
        }
        System.out.println(sum);
    }

    // q. 13
    public static void sumOfHarmonicSeries(int n){
        double sum = 0;
        int i = 1;
        while(i <= n){
            sum = sum + 1.0/(i+1);
            i++;
        }
        System.out.println(sum);
    }

    // q. 14
    public static void sumOfHarmonicEvenSeries(int n){
        double sum = 0;
        int i = 1;
        while(i <= n){
            if(i % 2 == 0){
                sum = sum + 1.0/(i);
            }
            
            i++;
        }
        System.out.println(sum);
    }

    // q.15
    public static void sumOfHarmonicOddSeries(int n){
        double sum = 0;
        int i = 1;
        while(i <= n){
            if(i % 2 != 0){
                sum = sum + 1.0/(i);
            }
            
            i++;
        }
        System.out.println(sum);
    }

    // q .16
    public static void sumOfHarmonicSquareSeries(int n){
        double sum = 0;
        int i = 1;
        while(i <= n){
            sum = sum + 1.0/(i*i);
            i++;
        }
        System.out.println(sum);
    }

    // q.17 

    public static void sumOfHarmonicCubeSeries(int n){
        double sum = 0;
        int i = 1;
        while(i <= n){
            sum = sum + 1.0/(i*i*i);
            i++;
        }
        System.out.println(sum);
    }

    // q.18
    public static void sumOfHarmonicSeries18(int n){
        double sum = 0;
        int i = 1;
        while(i <= n){
            sum = sum + 1.0/(i*(i+1));
            i++;
        }
        System.out.println(sum);
    }
    
    // Q.19
    public static void getFactorial(int n){
        int facto = 1 , i = 1;
        while(i <=n){
            facto = facto*i;
            i++;
        }
        System.out.println(facto);
    }

    // q.20
    public static void getPowerOfTwoNum(int a ,int b){
        int pow = 1,i = 1;
        while(i <= b){
            pow = pow *a;
            i++;
        }
        System.out.println(pow);
    }

    // q.21

    public static void getFactorSum(int n){
        int sum = 0,i = 1;
        while(i < n){
            if(n % i == 0){
            sum = sum + i;

            }
            i++;
        }
        System.out.println(n+" factor summ is "+sum);
    }

    // q. 22
    public static String getPerfectNum(int n){
        int factSum = 0, i = 1;
        while(i < n){
            if(n % i == 0){
                factSum = factSum + i;
            }
            i++;
        }
       return (factSum == n)? "yes" : "no";
    }

    // q.25
    public static int getCommonFactor(int a,int b){
        int cnt = 0, i = 1;
        while(i <= Math.min(a,b)){
            if(a % i == 0 && b % i == 0){
                cnt++;
            }
            i++;
        }
        return cnt;
    }

}