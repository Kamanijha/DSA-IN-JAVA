import java.util.Scanner;

class Loop {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enrer number : ");
        int n =sc.nextInt();
       String res =  passWordValidation();
       System.out.println(res);
        char c;
         // q.4
         //int res = sumOfInputNumber(sc);
        //  int res = sumOfInputAllGivenNum(sc);
        //  System.out.println("sum of all given number is  " + res);
        //  System.out.println("===============the program is end================");


        // do{
        // System.out.print("Enter the number a : ");
        // int a = sc.nextInt();
        // System.out.print("Enter the number b : ");
        // int b = sc.nextInt();
        // int res = getPower(a ,b);
        // System.out.println(res);
        // System.out.println("enter y/Y to continue.....");
        // c = sc.next().charAt(0);
        // }while(c == 'y' || c == 'Y');
        // System.out.println("===============the program is end================");
         
        // do{
        //     System.out.print("Enter the number : ");
        //      int n = sc.nextInt();
        //     int res =  getFactorial(n);
        //     System.out.println(res);
        //     System.out.println("enter y/Y to continue.....");
        //     c = sc.next().charAt(0);
        // }while(c == 'y' || c == 'Y');
        // System.out.println("===============the program is end================");

        // char c;
        // do{
        // System.out.print("Enter the number : ");
        // int n = sc.nextInt();
        // if(isPrime(n)){
        //     System.out.println("this is the prime number");
        // }else{
        //     System.out.println("this is the not  prime number");
        // }
        // System.out.println("enter y/Y to continue.....");
        // c = sc.next().charAt(0);
        // }while(c == 'y' || c == 'Y');
        // System.out.println("===============the program is end================")

    }
    
    public static boolean isPrime(int n){
        if(n < 2)
            return false;
        else if(n == 2 || n == 3)
            return true;
        else if(n %2 == 0)
            return false;

        int i = 3;
        while(i*i <= n ){
            if(n %i == 0)
            return false;
            i+=2;
        }  
        return true;  
    }

    public static int getPower(int a, int b){
        int i = 1;
        int pow = 1;
        while(i <= b){
            pow = pow*a;
            i++;
        }
        return pow;

    }

    // public static int getFactorial(int n){
    //     int i = 1;
    //     int facto = 1;
    //     while(n >= i){
    //         facto = facto*i;
    //         i++;
    //     }
    //     return facto;
    // }
    // q.4

    public static int sumOfInputNumber(Scanner sc){
        int sum = 0; int num ;
        do{ 
            System.out.print("enter num : ");
            num = sc.nextInt();
            if(num > 0){
            sum = sum + num;

            }
        }while(num > 0);
        return sum;
    }

    public static int sumOfInputAllGivenNum(Scanner sc){

        int sum = 0 ; int num;
        System.out.println("enter the number : ");
        num = sc.nextInt();
        while(num > 0){
            sum = sum +num;
            num = sc.nextInt();
        }
        return sum;
    }

    
    public static String passWordValidation(){
        int pass = 123;
        int attempts = 3;
        Scanner sc = new Scanner(System.in);
        
        while(attempts > 0){
            System.out.print("enter number : ");
            int n =sc.nextInt();
            if(n == pass)
                return "login successfully";
            else
                attempts --;
                System.out.println("you have left " + attempts + "times");
        }
        
      return "unsuccessfull";
    }
}