public class Number1 {
    public static void main(String[] args) {
        // checkPalindrome(121);
        // checkRangePalindrome(10,50);
        // nthPalindrome(15);
        // checkPalindromeOrPrime(20,110);
        // boolean res= perfectNumber(28);
        // System.out.println(res);

        // perfectNumberSeries(100);
        //strongNumber(148);
        //countAllStrongNumInRange(146);

        //armstrongNumber(152);
        countArmstrongNumInRange(200);
    }

    // q.6
    public static void checkPalindrome(int n) {
        int rev = 0;
        int temp = n;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;

            n /= 10;
        }
        if (rev == temp) {
            System.out.println("this is palindrome number");
        } else {
            System.out.println("this is not palindrome number");
        }
    }

    // q.7
    public static void checkRangePalindrome(int st, int end) {

        for (int i = st; i <= end; i++) {
            int rev = 0;
            int num = i;
            int temp = num;
            while (0 < temp) {
                int rem = temp % 10;
                rev = rev * 10 + rem;
                temp /= 10;
            }
            if (num == rev) {
                System.out.println(i);
            }
        }
    }

    // q.8
    // (checkPalindrome1(num)){ function return true or false

    public static void nthPalindrome(int nth) {
        int num = 0;
        int count = 0;
        while (count < nth) {
            num++;
            if (checkPalindrome1(num)) {

                count++;
            }
        }
        System.out.println(num);
    }

    // this function is check num is palindrome or not
    public static boolean checkPalindrome1(int n) {
        int rev = 0;
        int temp = n;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;

            n /= 10;
        }
        return (rev == temp);

    }

    // q.9
    public static void checkPalindromeOrPrime(int st, int end) {
        for (int i = st; i <= end; i++) {
            if (IsPalindrome(i)) {
                if (IsPrime(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean IsPalindrome(int n) {
        int rev = 0;
        int temp = n;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return (rev == temp);
    }

    public static boolean IsPrime(int m) {
        if (m < 2)
            return false;
        for (int i = 2; i < m; i++) {
            if (m % i == 0) {
                return false;

            }
        }
        return true;
    }

    // q. 10

    public static void perfectNumberSeries(int num) {
        for (int i = 6; i <= num; i++) {
            if (perfectNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean perfectNumber(int n) {
        if (n < 6)
            return false;
        int sum = 0;
        int i = 1;
        while (i <= n / 2) { // while (i<n) we can write this also
            if (n % i == 0) {
                sum = sum + i;
            }
            i++;
        }
        return n == sum;
    }

    // q .11

    // public static void strongNumber(int num) {
    //     int strongSum = 0;
    //     int temp = num;
    //     while (num >0) {
    //         int rem = num % 10;
    //         int facto = factorial(rem);
    //         strongSum = strongSum + facto;
    //         num = num/10;
    //     }
    //     if (strongSum == temp) {
    //         System.out.println(temp+ " is strong number \n" + "total sum is :"+ strongSum);
    //     } else {
    //         System.out.println(temp +" is not  strong number \n" + "total sum is :"+ strongSum);
    //     }
    // }

    // public static int factorial(int n) {
    //     int facto = 1;
    //     for (int i = 1; i <= n; i++) {
    //         facto = facto * i;
    //     }
    //     return facto;
    // }

    // q. 12
    public static void countAllStrongNumInRange(int n){
        boolean found = false;
        for(int i = 1;i<=n;i++){
            if(strongNumber(i)){
                System.out.println(i + " is strong number");
                found = true;
            }
        }

        if(!found){
            System.out.println("not found strong number between given range ");
        }
    }


     public static boolean strongNumber(int num) {
        int strongSum = 0;
        int temp = num;
        while (num >0) {
            int rem = num % 10;
            int facto = factorial(rem);
            strongSum = strongSum + facto;
            num = num/10;
        }
        return  (strongSum == temp) ;
            
    }

    public static int factorial(int n) {
        int facto = 1;
        for (int i = 1; i <= n; i++) {
            facto = facto * i;
        }
        return facto;
    }

    // q. 13

    // public static void armstrongNumber(int n){
    //     int totalDigitSum = 0; int temp = n;
    //     while (0<n) {
    //         int rem = n%10;
    //         int cube = digiCube(rem);
    //         totalDigitSum = totalDigitSum + cube;
    //         n/=10;
    //     }
    //     if(totalDigitSum == temp){
    //         System.out.println(temp + " is Armstrong number");
    //     }else{
    //         System.out.println(temp + " is not Armstrong number");
    //     }
    // }

    // public static int  digiCube(int n){
    //     int cube = n*n*n;
    //     return cube;
    // }

    // q. 14
    public static void countArmstrongNumInRange(int n){
        boolean found = false;
        for(int i = 1;i<=n;i++){
            
            if(armstrongNumber(i)){
                System.out.println(i);
                found = true;
            }
        }
        if(!found){
            System.out.println("armstrong number is not found in given range");
        }
    }

    public static boolean armstrongNumber(int n){
        int totalDigitSum = 0; int temp = n;
        while (0<n) {
            int rem = n%10;
            int cube = digiCube(rem);
            totalDigitSum = totalDigitSum + cube;
            n/=10;
        }
        return (totalDigitSum == temp);
           
    }

    public static int  digiCube(int n){
        int cube = n*n*n;
        return cube;
    }
}
