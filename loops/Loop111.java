import java.util.Scanner;

class Loop111 {

    public static void main(String[] args) {
        System.out.println("hello");
        // q.1
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number n : ");
        // int n = sc.nextInt();
        // boolean res = printGreaterNumTo5(n);
        // System.out.println(res);

        // printNumberLeftToRight(n);
        // sumOfDigitLessThenEqualto5(n);
        // int res = productOfEachDigit(n);
        // System.out.println(res);
        // if(res %2 == 0){
        // System.out.println("It will give Even Product ");
        // }else{
        // System.out.println("It will give Odd Product ");
        // }

        // int result = subtractProductAndSum(n);
        // System.out.println(result);
        // boolean res = isNumIsDecreasingOrder(n);

        // addDigit(n);
        // countDivisibleDigit(n);
        // System.out.println(res);
        // factorialOfDigit(n);
        // countBinaryBits(20);
        // sc.close();

        // if (palindromeString("maa")) {
        //     System.out.println("this is palindrome string");
        // } else {
        //     System.out.println("this is not  palindrome string");
        // }

        reduceNumberToZero(14);
    }

    // q.1
    public static void printDigitRightToLeft(int n) {

        while (n > 0) {
            int rem = n % 10;
            System.out.println(rem);
            n = n / 10;

        }
    }

    // q.2
    public static void evenDigitOfNumber(int n) {
        while (n > 0) {
            int rem = n % 10;
            if (rem % 2 == 0) {
                System.out.println(rem);
            }
            n = n / 10;

        }
    }

    // 3
    public static void oddDigitOfNumber(int n) {
        while (n > 0) {
            int rem = n % 10;
            if (rem % 2 != 0) {
                System.out.println(rem);
            }
            n = n / 10;

        }
    }
    // q.4

    public static boolean printGreaterNumTo5(int n) {
        boolean found = false;
        int rem;
        while (n > 0) {
            rem = n % 10;
            if (rem >= 5) {
                System.out.println(rem);
                found = true;
            }
            n = n / 10;
        }
        return found;
    }

    // q.5
    public static void biggestNum(int n) {
        int maxDigit = 0;

        while (n > 0) {
            int rem = n % 10;
            if (rem > maxDigit) {
                maxDigit = rem;
            }
            n = n / 10;
        }
        System.out.println(maxDigit);
    }

    // q.6
    public static void bigNumAndSmallNumDiff(int n) {
        int maxDigit = 0;
        int minDigit = 9;
        while (n > 0) {
            int rem = n % 10;
            if (rem > maxDigit) {
                maxDigit = rem;
            } else if (rem < minDigit) {
                minDigit = rem;
            }
            n = n / 10;
        }
        System.out.println(maxDigit - minDigit);
    }

    // public static void smallestNum(int n){
    // int minDigit = 9;
    // while(n>0){
    // int rem = n%10;
    // if(rem < minDigit){
    // minDigit = rem;
    // }
    // n = n/10;
    // }
    // System.out.println(minDigit);
    // }

    // q.7
    public static void countDigit(int n) {
        int cnt = 0;
        while (n > 0) {
            int rem = n % 10;
            cnt++;
            n = n / 10;
        }
        System.out.println(cnt);
    }

    // q .8
    // public static void printNumLeftToRight(int n){
    // while(n > 0){
    // int rem = n %10;
    // n = n/10;
    // System.out.println(rem);
    // }
    // }

    // q.9
    public static void printNumLeftToRight(int n) {
        int count = getCount(n);
        while (count > 0) {
            int digit = (n / getPower(10, count - 1)) % 10;
            System.out.println(digit);
            count--;
        }
    }

    // find count for question 9
    public static int getCount(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    // find pow for question 9
    public static int getPower(int a, int b) {
        int pow = 1, i = 1;
        while (i <= b) {
            pow = pow * a;
            i++;

        }
        return pow;
    }

    // q.9 by using reverse

    public static void printNumberLeftToRight(int n) {
        int rev = 0;
        int num = n;
        // reverse the number
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        // print digit
        while (rev > 0) {
            int digit = rev % 10;
            System.out.println(digit);
            rev = rev / 10;
        }
    }

    // 10
    public static void countZeroInNum(int n) {
        int cnt = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 0) {
                cnt++;
            }
            n = n / 10;
        }
        System.out.println(cnt);
    }

    // q.15
    public static void digitSumOfTheNumber(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println(sum);
    }

    // q.16
    public static void digitSumOfTheEvenNumber(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem % 2 == 0) {
                sum = sum + rem;
            }
            n = n / 10;
        }
        System.out.println(sum);
    }

    // q.18
    public static void sumOfDigitLessThenEqualto5(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem <= 5) {
                sum = sum + rem;
            }
            n /= 10;

        }
        System.out.println(sum);
    }

    // q.19
    public static int productOfEachDigit(int n) {
        int product = 1;
        while (n > 0) {
            int rem = n % 10;
            product = product * rem;
            n /= 10;
        }
        return product;
    }

    // q.20
    public static int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            prod = prod * rem;
            sum = sum + rem;
            n /= 10;
        }
        return prod - sum;

    }
    // q. 21
    // public static boolean isNumIsIncreasingOrder(int n){
    // int prev = n % 10;
    // n/=10;
    // while(n>0){
    // int next = n %10;
    // if(next > prev){
    // return false;
    // }
    // prev = next;
    // n/=10;
    // }
    // return true;
    // }

    // Q.21
    public static boolean isNumIsIncreasingOrder(int n) {
        int prev = n % 10;
        n /= 10;

        while (n > 0) {
            int next = n % 10;
            if (next > prev) {
                return false;
            }
            prev = next;
            n /= 10;
        }
        return true;
    }

    // q,22
    public static boolean isNumIsDecreasingOrder(int n) {
        int prev = n % 10;
        n /= 10;

        while (n > 0) {
            int next = n % 10;
            if (prev > next) {
                return false;
            }
            prev = next;
            n /= 10;
        }
        return true;
    }

    // q.23
    public static boolean adjacentDigits(int n) {
        // int prev = n%10;
        // n/=10;
        int prev = -1;
        while (n > 0) {
            int rem = n % 10;
            if (prev == rem) {
                return false;
            }
            prev = rem;
            n /= 10;
        }
        return true;
    }

    // q.24

    public static void addDigit(int n) {

        while (n > 9) {
            int rem = 0;
            int sum = 0;
            while (n > 0) {
                rem = n % 10;
                sum = sum + rem;
                n /= 10;
            }
            n = sum;
        }
        System.out.println(n);
    }

    // q. 25

    public static void countDivisibleDigit(int n) {
        int rem = 0;
        int cnt = 0;
        int temp = n;
        while (n > 0) {
            rem = n % 10;
            if (temp % rem == 0) {
                cnt++;
            }
            n /= 10;
        }
        System.out.println(cnt);
    }

    // 26
    public static void factorialOfDigit(int n) {
        int rem = 0;
        int fact = 1;
        while (n > 0) {
            rem = n % 10;
            int i = 1;
            while (rem >= i) {
                fact = fact * i;
                i++;
            }
            System.out.println(fact);
            n /= 10;
        }
    }

    // q. 34
    public static void countBinaryBits(int n) {
        String bin = "";
        int count = 0;
        while (n > 0) {
            int rem = n % 2;
            count++;
            bin = rem + bin;
            n /= 2;
        }
        System.out.println(count);
        System.out.println(bin);
    }

    // 33
    public static boolean palindromeString(String s) {
        int st = 0;
        int end = s.length() - 1;
        while (st < end) {
            if (s.charAt(st) != s.charAt(end)) {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }

    // q. 35
    public static void getHammingWeight(int n){
        String bin= ""; int count = 0; 
        while(n>0){
            int rem = n%2;
            if(rem == 1){
                count ++;
            }
            bin = rem + bin;
            n/=2;
        }
        System.out.println(bin);
        System.out.println("hemmning weight is : "+ count);
    }

    // q. 36

    public static void getZeroAndOneBits(int n){
        String bin= ""; int count = 0; int count1 = 0;
        while(n>0){
            int rem = n%2;
            if(rem == 1){
                count ++;
            }if(rem == 0){
                count1 ++;
            }
            bin = rem + bin;
            n/=2;
        }
        System.out.println(bin);
        System.out.println("1,s bits is : "+ count);
        System.out.println("0,s bits is : "+ count1);
    }

    // q. 37
    public static boolean getAlternateBits(int n){
         int prev = -1; 
        while(n>0){
            int rem = n%2;
            if(rem == prev){
                return false;
            }
            prev = rem;
            n/=2;
        }
        return true;
    }

    //q.38
    public static void reduceNumberToZero(int n){
        int cnt = 0;
        while (n>0) {
            //int Quotient= n/2;
            if(n%2 == 0){
                n = n/2;
            }else{
                n = n-1;
            }
            cnt++;
        }
        System.out.println(cnt);
    }

}
