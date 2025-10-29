public class Number2 {
    public static void main(String[] args) {
        //disariumNum(175);
        //printAllDesariumNumber(200);
        // boolean res = happyNumber(19);
        // boolean res = IsAutomorphicNumber(25);
        // System.out.println(res);
        //printAllAutomorphicNum(100);
        // getLCM(33,66,12);
        // getHCF(33,66,12);
        //deciIntoBinary(21);
        //binIntoDecimal(11100);
        //deciIntoOctal(287);
        //OctalIntoDecimal(1246);
        //decimalIntoHexadecimal(679);
        // int n = 5784584;
        //  printNumLeftToRight(revreseNum(n));
        
        

        
    }
    
    public static void printNumLeftToRight(int rev){
        
        while (rev>0) {
            int rem = rev%10;
            System.out.println(rem);
            rev/=10;
        }
    }
    
    public static int revreseNum(int n){
        int count = digitCount(n);
        int rev= 0;
        while (count>0) {
            int rem = n%10;
            rev = rev*10+rem;
            n/=10;
            count--;
        }
        return rev;
    }

    // q. 15
    public static void disariumNum(int n){
        int temp = n;
        int totalDigitSum = 0;
        int count = digitCount(n);
        while (n>0) {
            int rem = n %10;
            int digitPower = getDigitPower(rem,count);
            totalDigitSum += digitPower;
            n/=10;
            count--;
        }
        if(temp == totalDigitSum){
            System.out.println("this is disarium number ");
        }else{
            System.out.println("this is not  disarium number ");
        }

    }

    public static int digitCount(int n){
        int count = 0;
        while (n>0) {
            count++;
            n/=10;
        }
        return count;
    }

    public static int getDigitPower(int base, int pow){
        int multiply = 1;
        while (pow >0) {
             multiply = multiply*base;
            pow--;
        }
        return multiply;
    }

    // q. 16
    public static void printAllDesariumNumber(int n){
        for(int i = 1;i<=n;i++){
            if(disariumNum1(i)){
                System.out.println(i);
            }
        }
        
    }

    public static boolean  disariumNum1(int n){
        int temp = n;
        int totalDigitSum = 0;
        int count = digitCount(n);
        while (n>0) {
            int rem = n %10;
            int digitPower = getDigitPower(rem,count);
            totalDigitSum += digitPower;
            n/=10;
            count--;
        }
        return (temp == totalDigitSum); 

    }

    // q. 17
    // public static void happyNumber(int n,int original){
    //     //int temp = n;
    //     int digitSquareSum = 0;
    //     while (n>0) {
    //         int rem = n%10;
    //         int square = getDigitSquare(rem,2);
    //         digitSquareSum += square;
    //         n/=10;
    //     }
    //     if(digitSquareSum == 1){
    //         System.out.println(original+" is happy number");
    //     }else if(digitSquareSum == 4){
    //         System.out.println(original+" is not happy number");
    //     }
    //     else{
    //         happyNumber(digitSquareSum,original);
    //     }
    // }

    public static int getDigitSquare(int base,int pow ){
        int square = 1;
        while (pow>0) {
            square = square *base;
            pow --;
        }
        return square;
    }
    //  in same question return true of false
    public static boolean happyNumber(int n){
        //int temp = n;
        int digitSquareSum = 0;
        while (n>0) {
            int rem = n%10;
            int square = getDigitSquare(rem,2);
            digitSquareSum += square;
            n/=10;
        }
        if(digitSquareSum == 1){
            return true;
        }else if(digitSquareSum == 4){
            return false;
        }else{
            return happyNumber(digitSquareSum);
        }
        
    }

    // q. 18
    // public static void printAllHappyNumber(int n){
    //     int digitSqureSum= 0;
    // }

    // q.19.  this logic is not working now so try other logic 
    // public static void IsAutomorphicNumber(int n){
    //     int count = digitCount1(n);
    //     int temp = n;
    //     int rem= 0;
    //     while (count >=0) {
    //         int square = n*n;
    //          rem = square%10;
    //     }
    //     if(rem == temp){
    //         System.out.println("automorphic number");
    //     }else{
    //         System.out.println(" not automorphic number");
    //     }

    // }

    // public static int digitCount1(int n){
    //     int count = 0;
    //     while(n>0){
    //         count ++;
    //         n/=10;
    //     }
    //     return count;
    // }

    // q. 19

    // public static boolean IsAutomorphicNumber(int n){
        
    //    if(n<0) return false;
    //    int square = n*n;
    //    while (n>0) {
    //     if(n%10 != square%10){
    //         return false;
    //     }
    //     n/=10;
    //     square/=10;
    //    }
    //    return true;
    // }
     
    //. q. 20

    public static void printAllAutomorphicNum(int n){
       for(int i = 1;i<=n;i++){
        if(IsAutomorphicNumber(i)){
            System.out.println(i);
        }
       }
    }

    public static boolean IsAutomorphicNumber(int n){
        
       if(n<0) return false;
       int square = n*n;
       while (n>0) {
        if(n%10 != square%10){
            return false;
        }
        n/=10;
        square/=10;
       }
       return true;
    }
    // q. 21
    public static void getLCM(int a,int b,int c){
        int big = (a>b && a>c)? a:(b>c ? b:c);
        for(int i = big;;i+=big){
            if(i %a == 0 && i %b == 0 && i%c == 0){
                System.out.println("LCM IS : " + i);
                return;
            }
        }
    }

    // q. 22
    public static void getHCF(int a,int b,int c){
        int small= (a<b&&a<c)?a :(b<c ?b:c);
        for(int i = small;;i--){
            if(a%i == 0 && b%i == 0&& c%i ==0){
                System.out.println("HCF IS : "+ i);
                return;
            }
        }
    }

    // q.23
    public static void deciIntoBinary(int n){
        String bin = "";
        while(n>0){
            int rem = n%2;
            bin = rem + bin;
            n/=2;
        }
        System.out.println(bin);
    }

    // q. 24
    public static void binIntoDecimal(int n){
        int decimal = 0;int twoMul = 1;
        while(n>0){
            int rem = n%10;
            decimal = decimal + rem *twoMul;
            twoMul *=2;
            n/=10;
        }
        System.out.println(decimal);
    }

    // q. 25
    public static void deciIntoOctal(int n){
        String oct = "";
        while (n>0) {
            int rem = n%8;
            oct = rem + oct;
            n/=8;
        }
        System.out.println(oct);
    }

    // q. 26
    public static void OctalIntoDecimal(int n){
        int decimal = 0; int eightMul = 1;
        while (n>0) {
            int rem = n%10;
            decimal = decimal + rem*eightMul;
            eightMul *=8;
            n/=10;
        }
        System.out.println(decimal);
    }

    // q. 27
    public static void decimalIntoHexadecimal(int n){
        String hex = "";
        while (n>0) {
            int rem = n%16;
            if(rem < 10){
                hex = rem+hex;
            }else{
                hex = (char)(rem+55) + hex;
            }
            n/=16;
        }
        System.out.println(hex);
    }


   
}