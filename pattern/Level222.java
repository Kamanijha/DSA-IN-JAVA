public class Level222{

    public static void main(String[] args){
        printPattern84(5);
    }
    // q.51
    public static void printPattern51(int n){
        int star = 1;int space = n-1;
        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print(" ");
            }

            for(int k = 1;k<=star;k++){
                System.out.print("* ");
            }
            star++;
            space--;
            System.out.println();
        }
    }

    // 52
    public static void printPattern52(int n){
        int star = 1;int space = n-1;
        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print(" ");
            }

            for(int k = 1;k<=star;k++){
                System.out.print(i+" ");
            }
            star++;
            space--;
            System.out.println();
        }
    }
    
    // 53
    public static void printPattern53(int n){
        int star = 1;int space = n-1;
        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print(" ");
            }

            for(int k = 1;k<=star;k++){
                System.out.print(i%2+" ");
            }
            star++;
            space--;
            System.out.println();
        }
    }

    // q.54

    public static void printPattern54(int n){
        int star = 1;int space = n-1;
        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print(" ");
            }

            for(int k = 1;k<=star;k++){
                System.out.print(k+" ");
            }
            star++;
            space--;
            System.out.println();
        }
    }

    // q.55
    public static void printPattern55(int n){
        int star = 1;int space = n-1;
        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print(" ");
            }

            for(int k = 1;k<=star;k++){
                System.out.print(k%2+" ");
            }
            star++;
            space--;
            System.out.println();
        }
    }

    // q. 56
    public static void printPattern56(int n){
        int star = 1;int space = n-1;int num = 1;
        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }

            for(int k = 1;k<=star;k++){
                System.out.print(num++ +" ");
            }
            star++;
            space--;
            System.out.println();
        }
    }

    // q.57
    public static void printPattern57(int n){
        int star = 1;int space = n-1;int num = n*(n+1)/2;
        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.printf("%-2s","  ");
            }

            for(int k = 1;k<=star;k++){
                System.out.printf("%-4d",num-- );
            }
            star++;
            space--;
            System.out.println();
        }
    }

    // q.58
    public static void printPattern58(int n){
        int star = 1;int space = n-1;
        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.printf("%-2s","  ");
            }
            int num = i;
            for(int k = 1;k<=star;k++){
                System.out.printf("%-4d",num-- );
            }
            star++;
            space--; 
            System.out.println();
        }
    }

    // q.59
    public static void printPattern59(int n){
        int star = 1;int space = n-1;
        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.printf("%-2s","  ");
            }
            int num = n;
            for(int k = 1;k<=star;k++){
                System.out.printf("%-4d",num-- );
            }
            star++;
            space--; 
            System.out.println();
        }
    }

// q.60
    public static void printPattern60(int n){
        int star = 1;int space = n-1;int num = n;
        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.printf("%-2s","  ");
            }
            
            for(int k = 1;k<=star;k++){
                System.out.printf("%-4d",num );
            }
            star++;
            space--; 
            num--;
            System.out.println();
        }
    }

    // q. 61
    public static void printPattern61(int n){
        int star = 1;int space = n-1;
        for(int i = 1;i<=n;i++){
            int num = i+64;
            for(int j = 1;j<=space;j++){
                System.out.printf("%-2s","  ");
            }
            
            for(int k = 1;k<=star;k++){
                System.out.printf("%-4c",(char)num );
            }
            star++;
            space--; 
            //num++;
            System.out.println();
        }
    }

    // q.62
    public static void printPattern62(int n){
        int num = 64;
        int star = 1;int space = n-1;
        for(int i = 1;i<=n;i++){
       
            for(int j = 1;j<=space;j++){
                System.out.printf("%-2s","  ");
            }
            
            for(int k = 1;k<=star;k++){
                System.out.printf("%-4c",(char)num+k );
            }
            star++;
            space--; 
            //num++;
            System.out.println();
        }
    }

    // q.63
    public static void printPattern64(int n){
        int num = 64+n;
        int star = 1;int space = n-1;
        for(int i = 1;i<=n;i++){
       
            for(int j = 1;j<=space;j++){
                System.out.printf("%-2s","  ");
            }
            
            for(int k = 1;k<=star;k++){
                System.out.printf("%-4c",(char)num );
            }
            star++;
            space--; 
            num--;
            System.out.println();
        }
    }

    // q.67
    public static void printPattern67(int n){
        int star = 1; int space = n-1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("   ");

            }

            for(int k = 1;k<=star;k++){
                System.out.print("*  ");
            }
            star +=2; space --;
            System.out.println();
        }
    }

    // q. 68
    
    public static void printPattern68(int n){
        int star = 1; int space = n-1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("   ");

            }

            for(int k = 1;k<=star;k++){
                System.out.printf("%-3d",i);
            }
            star +=2; space --;
            System.out.println();
        }
    }

    // q.69
    public static void printPattern69(int n){
        int star = 1; int space = n-1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("   ");

            }

            for(int k = 1;k<=star;k++){
                System.out.printf("%-3d",i%2);
            }
            star +=2; space --;
            System.out.println();
        }
    }

    // q. 70

    public static void printPattern70(int n){
        int star = 1; int space = n-1; int num = n;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("   ");

            }

            for(int k = 1;k<=star;k++){
                System.out.printf("%-3d",num);
            }
            star +=2; space --;
            num--;
            System.out.println();
        }
    }

    // 71
    public static void printPattern71(int n){
        int star = 1; int space = n-1;  
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("   ");

            }
           
            for(int k = 1;k<=star;k++){
                System.out.printf("%-3d",k);
            }
            star +=2; space --;
            //num--;
            System.out.println();
        }
    }

    // q. 72
    public static void printPattern72(int n){
        int star = 1; int space = n-1;  
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("   ");

            }
           
            for(int k = 1;k<=star;k++){
                System.out.printf("%-3d",k%2);
            }
            star +=2; space --;
            //num--;
            System.out.println();
        }
    }

    // q. 73
    public static void printPattern73(int n){
        int star = 1; int space = n-1;  
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("   ");

            }
           int num = star;
            for(int k = 1;k<=star;k++){
                System.out.printf("%-3d",num--);
            }
            star +=2; space --;
            //num--;
            System.out.println();
        }
    }

    // q.74
    public static void printPattern74(int n){
        int star = 1; int space = n-1;  int num = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("   ");

            }
           
            for(int k = 1;k<=star;k++){
                System.out.printf("%-3d",num++);
            }
            star +=2; space --;
            //num--;
            System.out.println();
        }
    }

    // q.75
    public static void printPattern75(int n){
        int star = 1; int space = n-1;  int num = n*n;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("   ");

            }
           
            for(int k = 1;k<=star;k++){
                System.out.printf("%-3d",num--);
            }
            star +=2; space --;
            //num--;
            System.out.println();
        }
    }

    // q.76
    public static void printPattern76(int n){
        int star = 1; int space = n-1;  
        for(int i = 1;i<=n;i++){
            int num = 1;
            for(int j = 1;j<=space;j++){
                System.out.print("   ");

            }
           int colMid = star/2+1;
            for(int k = 1;k<=star;k++){
                if(k<colMid){
                    System.out.printf("%-3d",num++ );
                }else{
                    System.out.printf("%-3d",num-- );
                }
            }
            star +=2; space --;
            //num--;
            System.out.println();
        }
    }

    // q.77
    public static void printPattern77(int n){
        int star = 1;int space = n-1;
        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print("   ");
            }
            int num = n;
            for(int k = 1;k<=star;k++){
                if(k <= star/2+1){
                    System.out.printf("%-3d",num-- );
                }else{
                    System.out.printf("%-3d",++num );
                }
            }
            star+=2;space--;
            System.out.println();
        }
    }

    // q. 78
   
    public static void printPattern78(int n){
        int star = 1; int space = n-1; int num = n;
        for(int i = 1;i<=n;i++){
            
            for(int j = 1;j<=space;j++){
                System.out.print("   ");

            }

            int colMid = star/2+1;
            for(int k = 1;k<=star;k++){
                if(k<colMid){
                    System.out.printf("%-3d",num++ );
                }else{
                    System.out.printf("%-3d",num-- );
                }
            }
            star +=2; space --;
            //num--;
            System.out.println();

        }    
    }

    // q.79
    public static void printPattern79(int n){
        int star = 1;int space = n-1; 
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("   ");
            }
            int num = i;
            //int colMid = star/2+1;
            for(int k = 1;k<=star;k++){
                if(k<star/2+1){
                    System.out.printf("%-3d",num--);
                }else{
                    System.out.printf("%-3d",num++);
                }
            }
            star+=2; space--;
            System.out.println();
            
        }
    }

    // q. 80
    public static void printPattern80(int n){
        int star = 1;int space = n-1; 
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("   ");
            }
            int num = i-1;
            //int colMid = star/2+1;
            for(int k = 1;k<=star;k++){
                if(k<star/2+1){
                    System.out.printf("%-3d",num--);
                }else{
                    System.out.printf("%-3d",num++);
                }
            }
            star+=2; space--;
            System.out.println();
            
        }
    }

    // q.81
    public static void printPattern81(int n){
        int star = 1;int space = n-1; 
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("   ");
            }
            int num = i;
            //int colMid = star/2+1;
            for(int k = 1;k<=star;k++){
                if(k<star/2+1){
                    System.out.printf("%-3d",num++);
                }else{
                    System.out.printf("%-3d",num--);
                }
            }
            star+=2; space--;
            System.out.println();
            
        }
    }

    // q. 82
    public static void printPattern82(int n){
        int star = 1;int space = n-1; int num = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("   ");
            }
            
            //int colMid = star/2+1;
            for(int k = 1;k<=star;k++){
                if(k<star/2+1){
                    System.out.printf("%-3d",num++);
                }else{
                    System.out.printf("%-3d",num--);
                }
            }
            star+=2; space--;
            num = num+i+1;
            System.out.println();
            
        }
    }

    // q.83
    public static void printPattern83(int n){
        int star = 1;int space = n-1;int num = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("   ");

            }
            int mid = star/2+1;
            for(int k = 1;k<=star;k++){
                if(k == mid){
                    System.out.printf("%-3d",0);
                }else{
                    System.out.printf("%-3d",num++);
                }
            }
            star+=2;space--;
           
            System.out.println();
        }
    }

    // q.84
    public static void printPattern84(int n){
        int star = 1;int space = n-1;int num = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("   ");

            }
            int mid = star/2+1;
            for(int k = 1;k<=star;k++){
                if(k == mid){
                    System.out.printf("%-3d",1);
                }else{
                    System.out.printf("%-3d",num++);
                }
            }
            star+=2;space--;
           
            System.out.println();
        }
    }

}