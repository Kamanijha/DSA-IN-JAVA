import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("enter the a :");
        // int a = sc.nextInt();
        // System.out.print("enter the b :");
        // int b = sc.nextInt();
        // System.out.print("enter the c :");
        // int c = sc.nextInt();
        // int res = getHcf(getHcf(a, b),c);
        // System.out.print("HCF OF ALL THREE NUMBER IS : " + res);
        // sc.close();

        // System.out.print("enter the a :");
        // int a = sc.nextInt();
        // System.out.print("enter the b :");
        // int b = sc.nextInt();
        // getLcm(a, b);

        // }

        boolean res = uglyNumber(30);
        System.out.println(res);

        // hcf of all number
        // public static int getHcf(int a ,int b){
        // if(b == 0) return a;
        // return getHcf(b, a%b);

    }

    // LCM OF ALL THREE NUMBER
    public static void getLcm(int a, int b) {
        int i;
        for (i = a > b ? a : b; i < a * b; i += (a > b ? a : b)) {
            if (i % a == 0 && i % b == 0) {
                break;
            }

        }
        System.out.println(i);
    }

    public static void getLcmOfThreeNum(int a, int b, int c) {
        int i;
        for (i = a > b ? a : b; i < a * b; i += (a > b ? a : b)) {
            if (i % a == 0 && i % b == 0) {
                break;
            }

        }
        System.out.println(i);
    }

    // ugly number
    public static boolean uglyNumber(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0 || i % 3 != 0 || i % 5 != 0) {
                return false;
            } 
        }
        return true;
    }
}
