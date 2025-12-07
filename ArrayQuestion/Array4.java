public class Array4 {
    public static void main(String[] args) {
        int[] a = { 7,1,5,3,6,4 };
        // int res = maxPrfit(a);
        // System.out.println(res);
        int ress = perfectSquare(39);
        System.out.println(ress);
    }

    // q. 45
    public static int secondBig(int[] a) {
        int firstBig = Integer.MIN_VALUE;
        int secdBig = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > firstBig) {
                secdBig = firstBig;
                firstBig = a[i];
            } else if (a[i] > secdBig && a[i] != firstBig) {
                secdBig = a[i];
            }
        }
        return secdBig;
    }

    // 46
    public static int secondSmall(int[] a) {
        int small = Integer.MAX_VALUE;
        int secdSmall = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < small) {
                secdSmall = small;
                small = a[i];
            } else if (a[i] < secdSmall && a[i] != small) {
                secdSmall = a[i];
            }
        }

        if (secdSmall != Integer.MAX_VALUE) {
            return secdSmall;
        } else {
            return small;
        }
    }

    // count sort
    public static void sort(int[] a) {
        int max = a[0];
        int min = a[0];
        for (int x : a) {
            if (x > max) {
                max = x;
            } else if (x < min) {
                min = x; // this will count min and max
            }
        }
    }
    // build the frequency aaray
    // int[] freq = new int[max-min+1];
    // for(int i = 0;i<a.length;i++){
    // fr
    // }

    // buy and sell
    public static int maxPrfit(int[] p) {
        int buy = p[0];
        int profit = 0;

        for (int price : p) {
            if (price < buy) {
                buy = price;
            } else if (price - buy > profit) {
                profit = price - buy;
            }

        }
        return profit;
    }

    // perfect square number 
    // public static int perfectSquare(int n){
    //     int i = 1;
    //     while (true) {
    //         if(i*i== n){
    //             return i;
    //         }else if(i*i>n){
    //             return i-1;
    //         }
    //         i++;
    //     }
    // }
    // perfect square number 
    public static int perfectSquare(int n){
        int st = 1;int end = n;

        while (st<=end) {
            int mid = st+(end-st)/2;
            if(mid*mid==n){
                return mid;
            }else if(mid*mid > n){
                end = mid-1;

            }else {
                st = mid+1;
            }
        }
        return st-1;
    }
}
