
import java.util.Scanner;
class Level22222{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();
        printPattern160(n);
    }

    // 129
    public static void printPattern129(int n){
        int star = 1;int space = n/2;int mid = n/2+1;

        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){

            System.out.print("   ");
            }

            for(int j =1;j<=star;j++){
                System.out.print("*  ");
            }
            if(mid>i){
                star ++; space--;
            }else{
                star--; space++;
            }
            System.out.println();
        } 
    }

    // 128

    public static void printPattern128(int n) {
      int star = 1;           // stars start from 1
      int mid = n / 2 + 1;    // middle row

        for (int i = 1; i <= n; i++) {
            // print stars
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }

            // move to next line
            System.out.println();

            // increase stars until mid, then decrease
            if (i < mid) {
                star++;
            } else {
                star--;
            }
        }
    }
    // q. 147
    // public static void printPattern147(int n){
    //     int star = 1;int space = n/2;int mid = n/2+1;

    //     for(int i = 1;i<=n;i++){

    //         for(int j = 1;j<=space;j++){
    //             System.out.print("  ");
    //         }

    //         for(int j = 1;j<=star;j++){
    //             System.out.print("* ");
    //         }
    //         if(mid >i){
    //             star+=2;space--;
    //         }else{
    //             star-=2;space++;
    //         }
    //         System.out.println();
    //     }
    // }
    // 130
    public static void printPattern130(int n){
        int star = 1;int space = n/2;int mid = n/2+1;

        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }

            for(int j = 1;j<=star;j++){
                System.out.print("*   ");
            }
            if(mid >i){
                star++;space--;
            }else{
                star--;space++;
            }
            System.out.println();
        }
    }

    // q. 131
    public static void printPattern131(int n){
        int star = 1;int space = n/2;int mid = n/2+1;

        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }

            for(int j = 1;j<=star;j++){
                System.out.print(i+"   ");
            }
            if(mid >i){
                star++;space--;
            }else{
                star--;space++;
            }
            System.out.println();
        }
    }

    // 132
    public static void printPattern132(int n){
        int star = 1;int space = n/2;int mid = n/2+1;

        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }

            for(int j = 1;j<=star;j++){
                System.out.print(i%2+"   ");
            }
            if(mid >i){
                star++;space--;
            }else{
                star--;space++;
            }
            System.out.println();
        }
    }

    // q. 133
    public static void printPattern133(int n){
        int star = 1;int space = n/2;int mid = n/2+1;

        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }

            for(int j = 1;j<=star;j++){
                System.out.print(j+"   ");
            }
            if(mid >i){
                star++;space--;
            }else{
                star--;space++;
            }
            System.out.println();
        }
    }
    // q.134
    public static void printPattern134(int n){
        int star = 1;int space = n/2;int mid = n/2+1;

        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }

            for(int j = 1;j<=star;j++){
                System.out.print(j%2+"   ");
            }
            if(mid >i){
                star++;space--;
            }else{
                star--;space++;
            }
            System.out.println();
        }
    }
   
   // q. 135
    public static void printPattern135(int n){
        int star = 1;int space = n/2;int mid = n/2+1; int num = 1;

        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }

            for(int j = 1;j<=star;j++){
                System.out.print(num++ +"   ");
            }
            if(mid >i){
                star++;space--;
            }else{
                star--;space++;
            }
            System.out.println();
        }
    }

    // q. 136
    public static void printPattern136(int n){
        int star = 1;int space = n/2;int mid = n/2+1; 
        int num = mid*mid;
        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }

            for(int j = 1;j<=star;j++){
                System.out.print(num-- +"   ");
            }
            if(mid >i){
                star++;space--;
            }else{
                star--;space++;
            }
            System.out.println();
        }
    }

    // q. 137
    public static void printPattern137(int n){
        int star = 1;int space = n/2;int mid = n/2+1; 
        int num = mid*mid;
        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }

            int val = i;
            if(i<=mid){
                val = i;
            }else{
                val = n-i+1;
            }
            
            for(int j = 1;j<=star;j++){
                System.out.print(val+"   ");
            }
            if(mid >i){
                star++;space--;
            }else{
                star--;space++;
            }
            System.out.println();
        }
    }

    // q.138
    public static void printPattern138(int n){
        int star = 1;int space = n/2;int mid = n/2+1;  
        int num = mid*mid;
        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }

            int val ;
            if(i<=mid){
                val =  n-i+1;
                
            }else{
                val = n-i+1;
            }
            
            for(int j = 1;j<=star;j++){
                System.out.print(val+"   ");
            }
            if(mid >i){
                star++;space--;
            }else{
                star--;space++;
            }
            System.out.println();
        }
    }

    // q. 139
    public static void printPattern139(int n){
        int star = 1;int space = n/2;int mid = n/2+1;  
        int num = mid*mid;
        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }

            int val;
            if(i<=mid){
                val = mid-i;
                
            }else{
                val = i - mid;
            }
            
            for(int j = 1;j<=star;j++){
                System.out.print(val +"   ");
            }
            if(mid >i){
                star++;space--;
            }else{
                star--;space++;
            }
            val++;
            System.out.println();
        }
    }

   // q. 140
   public static void printPattern140(int n){
        int star = 1;int space = n/2;int mid = n/2+1;  
        int num = mid*mid;
        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }

            int val;
            if(i<=mid){
                val = mid-i+1;
                
            }else{
                val = i - mid+1;
            }
            
            for(int j = 1;j<=star;j++){
                System.out.print(val +"   ");
            }
            if(mid >i){
                star++;space--;
            }else{
                star--;space++;
            }
            val++;
            System.out.println();
        }
    }

    // Q. 141
    public static void printPattern141(int n){
        int star = 1;int space = n/2; int mid = n/2+1; int num = 64;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }
            
            for(int j = 1;j<=star;j++){
                System.out.print((char)(num+i)+"   ");
            }

            if(mid > i){
                star ++ ; space--;
            }else{
                space++; star--;
            }
            System.out.println();
        }
    }

    // q. 142
     public static void printPattern142(int n){
        int star = 1;int space = n/2; int mid = n/2+1; int num = 64;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }
            
            for(int j = 1;j<=star;j++){
                System.out.print((char)(num+j)+"   ");
            }

            if(mid > i){
                star ++ ; space--;
            }else{
                space++; star--;
            }
            System.out.println();
        }
    }

    // q. 143

     public static void printPattern143(int n){
        int star = 1;int space = n/2; int mid = n/2+1; int num = 64;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }
            
            
            for(int j = 1;j<=star;j++){
                System.out.print((char)(num+i)+"   ");
            }

            if(mid > i){
                star ++ ; space--;
            }else{
                space++; star--;
            }
            System.out.println();
        }
    }

   // q. 145
   public static void printPattern145(int n){
        int star = 1;int space = n/2; int mid = n/2+1; int num = 65;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }
            
            for(int j = 1;j<=star;j++){
                System.out.print((char)(num++)+"   ");
            }

            if(mid > i){
                star ++ ; space--;
            }else{
                space++; star--;
            }
            System.out.println();
        }
    }

    // q. 146

     public static void printPattern146(int n){
        int star = 1;int space = n/2; int mid = n/2+1; int num = 65+2*n+1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }
            
            for(int j = 1;j<=star;j++){
                System.out.print((char)(num--)+"   ");
            }

            if(mid > i){
                star ++ ; space--;
            }else{
                space++; star--;
            }
            System.out.println();
        }
    }

    // q. 147
    public static void printPattern147(int n){
        int star = 1;int space = n/2;int mid = n/2+1;

        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }

            for(int j = 1;j<=star;j++){
                System.out.print("* ");
            }
            if(mid >i){
                star+=2;space--;
            }else{
                star-=2;space++;
            }
            System.out.println();
        }
    }

    // q. 148
    public static void printPattern148(int n){
        int star = 1;int space = n/2;int mid = n/2+1;

        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }

            for(int j = 1;j<=star;j++){
                System.out.print(i+" ");
            }
            if(mid >i){
                star+=2;space--;
            }else{
                star-=2;space++;
            }
            System.out.println();
        }
    }

     // q. 149
    
    public static void printPattern149(int n){
        int star = 1;int space = n/2;int mid = n/2+1;

        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }

            for(int j = 1;j<=star;j++){
                System.out.print(i%2+" ");
            }
            if(mid >i){
                star+=2;space--;
            }else{
                star-=2;space++;
            }
            System.out.println();
        }
    }

    // q. 150

    public static void printPattern150(int n){
        int star = 1;int space = n/2;int mid = n/2+1;

        for(int i = 1;i<=n;i++){
            int num = 0;
            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }

            for(int j = 1;j<=star;j++){
                System.out.print(num+j  +" ");
            }
            if(mid >i){
                star+=2;space--;
            }else{
                star-=2;space++;
            }
            System.out.println();
        }
    }

    // q. 151

    public static void printPattern151(int n){
        int star = 1;int space = n/2;int mid = n/2+1;

        for(int i = 1;i<=n;i++){
            int num = 0;
            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }

            for(int j = 1;j<=star;j++){
                System.out.print((num+j)%2  +" ");
            }
            if(mid >i){
                star+=2;space--;
            }else{
                star-=2;space++;
            }
            System.out.println();
        }
    }

    // q.152
    public static void printPattern152(int n){
        int star = 1;int space = n/2;int mid = n/2+1; int num = 1;

        for(int i = 1;i<=n;i++){
            
            for(int j = 1;j<=space;j++){
                System.out.print("   ");
            }

            for(int j = 1;j<=star;j++){
                System.out.printf("%-3d",num++);
            }
            if(mid >i){
                star+=2;space--;
            }else{
                star-=2;space++;
            }
            System.out.println();
        }
    }

    // q. 153
       public static void printPattern153(int n){
        int star = 1;int space = n/2;
        int num = n*n/2+1; int rowMid = n/2+1;

        for(int i = 1;i<=n;i++){
            
            for(int j = 1;j<=space;j++){
                System.out.print("   ");
            }

            for(int j = 1;j<=star;j++){
                System.out.printf("%-3d",num--);
            }
            if(rowMid >i){
                star+=2;space--;
            }else{
                star-=2;space++;
            }
            System.out.println();
        }
    }

   // q. 154
   public static void printPattern154(int n){
        int star = 1;int space = n/2;
         int mid = n/2+1;
         int num = n;
        for(int i = 1;i<=n;i++){
            
            for(int j = 1;j<=space;j++){
                System.out.print("   ");
            }

            for(int j = 1;j<=star;j++){
                System.out.printf("%-3d",num);
            }
            num = num-1;
            if(mid > i){
                star+=2;space--;
            }else{
                star-=2;space++;
            }
            System.out.println();
            
        }
    }

    // q. 155
    public static void printPattern155(int n){
        int star = 1;int space = n/2;
         int mid = n/2+1;
         int num = 1;
        for(int i = 1;i<=n;i++){
            
            for(int j = 1;j<=space;j++){
                System.out.print("   ");
            }

            for(int j = 1;j<=star;j++){
                System.out.printf("%-3d",num--);
            }
            //num = num-1;
            if(mid > i){
                star+=2;space--;
            }else{
                star-=2;space++;
            }
            num = num+star;
            System.out.println();
            
        }
    }

    // q.156
    public static void printPattern156(int n){
        int star = 1;int space = n/2;
         int mid = n/2+1;
         int num = 0;
        for(int i = 1;i<=n;i++){
            num = (i<=mid)? num+1 : num-1;
            for(int j = 1;j<=space;j++){
                System.out.print("   ");
            }

            for(int j = 1;j<=star;j++){
                System.out.printf("%-3d",num);
            }
            //num = num-1;
            if(mid > i){
                star+=2;space--;
                
            }else{
                star-=2;space++;
            }
            
            System.out.println();
            
        }
    }

    // q. 157
    public static void printPattern157(int n){
        int star = 1;int space = n/2;
         int mid = n/2+1;
         int num = space+1;
        for(int i = 1;i<=n;i++){
            num = (i<=mid)? num-1 : num+1;
            for(int j = 1;j<=space;j++){
                System.out.print("   ");
            }

            for(int j = 1;j<=star;j++){
                System.out.printf("%-3d",num);
            }
            //num = num-1;
            if(mid > i){
                star+=2;space--;
                
            }else{
                star-=2;space++;
            }
            
            System.out.println();
            
        }
    }

     // q. 158
     public static void printPattern158(int n){
        int star = 1;int space = n/2;
         int mid = n/2+1;
         int num = mid+1;
        for(int i = 1;i<=n;i++){
            num = (i<=mid)? num-1 : num+1;
            for(int j = 1;j<=space;j++){
                System.out.print("   ");
            }

            for(int j = 1;j<=star;j++){
                System.out.printf("%-3d",num);
            }
            //num = num-1;
            if(mid > i){
                star+=2;space--;
                
            }else{
                star-=2;space++;
            }
            
            System.out.println();
            
        }
    }

    // q. 159
    public static void printPattern159(int n){
        int star = 1; int space = n/2;int mid = n/2+1; 

        for(int i = 1;i<=n;i++){
            int num = 1;
            for(int j = 1;j<= space;j++){
                System.out.print("   ");
            }

            for(int j = 1;j<=star;j++){
                System.out.printf("%-3d",num);

                if(j<=star/2){
                    num++;
                }else{
                    num--;
                }
            }

            if(mid > i){
                star+=2;space--;
                
            }else{
                star-=2;space++;
            }
            
            System.out.println();
        }
    }

    // q.160
    public static void printPattern160(int n){
        int star = 1; int space = n/2;int mid = n/2+1; 

        for(int i = 1;i<=n;i++){
            int num = 0;
            for(int j = 1;j<= space;j++){
                System.out.print("   ");
            }

            for(int j = 1;j<=star;j++){
                System.out.printf("%-3d",num);

                if(j== mid){
                    num = num;
                }else{
                    num--;
                }
            }

            if(mid > i){
                star+=2;space--;
                
            }else{
                star-=2;space++;
            }
            
            System.out.println();
        }
    }
}