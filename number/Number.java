import java.util.*;

class Number {

    public static void main(String[] args) {
        // String res= deciIntoBin(28);
        // System.out.println(res);
        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter the number :");
        // int n = sc.nextInt();
        // if(isPrime(n)){
        // System.out.println("this is prime number");
        // }else{
        // System.out.println("this is not prime number");
        // }

        // int start = 1;
        // int end = 10;
        // int res = countPrimeNum(start , end);
        // System.out.println("total number of prime between "+ start+ " to " + end+" "
        // + "is "+res);

         int prime = nthPrimeNum(5);
         System.out.println(prime);

        // int res = getCombination(5,2);
        // System.out.println(res);

        //printPascalTriangle(3);
        //alternatePrimeNUmber(20);
    }

    // q. 1

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // q.2 in QUESTION WE USE TWO LOOP FIRST IS CHECK MUNBER IS PRIME OR NOT AND
    // SECOND IS COUNT PRIME NUMBER

    public static int countPrimeNum(int start, int end) {
        int cnt = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                cnt++;
            }
        }
        return cnt;
    }

    // Q. 3 INT THIS QUESTION CHECK FIRST PRIME NUMBER THEN CALUALTE NTH PRIME
    // NUMBER

    public static int nthPrimeNum(int n) {
        int count = 0;
        int num = 1;
        while (count < n) {
            num++;
            if (isPrime(num)) {
                count++;
            }
        }
        return num;
    }

    // q. 4
    public static void alternatePrimeNUmber(int n){
        int primeCnt = 0;
        for(int i =2;i<n;i++){
            if(isPrime(i)){
                primeCnt ++;
                if(primeCnt %2 != 0){
                    System.out.print(i +" ");
                }
            }
        }
    }

    // Q.23
    // public static String deciIntoBin(int n){
    // String bin = "";
    // for(;n>0;n= n/2){

    // bin = (n%2)+bin;

    // }
    // return bin;
    // }

    public static String deciIntoBin(int n) {
        String bin = "";
        while (n > 0) {
            int rem = n % 2;
            bin = rem + bin;
            n = n / 2;
        }
        return bin;
    }

    // q. 29
    public static int getPermutation(int n, int r) {
        if (r > n)
            return 0;
        int perm = 1;
        for (int i = 0; i < r; i++) {
            perm = perm * (n - i);
        }
        return perm;

    }

    // combination

    public static int getCombination(int n,int r){
        if(r > n) return 0;
        int comb = 1;
        for(int i = 0;i<r;i++){
            comb = comb*(n-i)/(i+1);
        }
        return comb;
    }

    // pascal row 
    public static void printPascalRow(int n){
        int comb = 1;
        System.out.printf("%-4d",comb);
        for(int i = 0;i<n;i++){
            comb = comb*(n-i)/(i+1);
            System.out.printf( "%-4d", comb);
        }

    }

    public static void printPascalTriangle(int n){
        int space = n;
        for(int i  = 0;i<=n;i++){
            for(int j = 1;i<=space;j++){
                System.out.println("  ");
            }
            printPascalRow(i);
            space--;
            System.out.println();
        }
    }

}