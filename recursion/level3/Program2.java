
import java.util.*;
public class Program2 {
    static int bigNum = 0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       
        // biggestNum();
        // System.out.println("biggest num is : " + bigNum);
        //int res = fibNumber(3);
        //System.out.println(res);
         //   fibNumSeries(15,0,1);
        // boolean res =  powerOfTwo(18);
        // System.out.println(res);
        int res = getHcf(24,345 );
        System.out.println(res);
     }

    // q. 13
    public static void biggestNum(){
        System.out.println("enter number :");
        int num = sc.nextInt();
        bigNum = bigNum >num?bigNum:num;
        System.out.println("if continue then press Y/y.......");
        char c = sc.next().charAt(0);
        if(c =='Y' || c == 'y'){
            biggestNum();
        }
    }

    // fib number this program is printing  nth term
    public static int fibNumber(int n){
        if(n == 1 || n==0){
            return n;
        }
        return fibNumber(n-1) + fibNumber(n-2);
    }

    // fib number series 0 1 1 2 5 8 ......

    public static void  fibNumSeries(int n , int a ,int b){
        if(n == 0) return ; 
        
        
        System.out.print(a + " ");
        
        fibNumSeries(n-1,b ,a+b);
        
    }

    // power of two 
    public static boolean powerOfTwo(int n){
        if(n == 1) return true;
        if(n % 2 != 0){
            return false;
        }
        return powerOfTwo(n/2);
    }

    // HCF OF TWO NUBER
    public static int getHcf(int a , int b){
        if(b == 0) return a;
        return getHcf(b, a%b);
    }
}
