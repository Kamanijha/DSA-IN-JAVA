class Level2{
    public static void main(String[] args){
        //System.out.println("hello");
        printPattern19(5);
    }
    
    // q.13
    public static void printPattern(int n){
        int start = 1;
        for(int i =1;i<=n;i++){
            for(int j = 1; j<=start;j++){
                System.out.print("* ");
                
            }
            start++;
            System.out.println();
        }
    }

    // q.14
    public static void printPattern2(int n){
        int start = n;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=start;j++){
                System.out.print("* ");
            }
            start--;
            System.out.println();
        }
    }
    // q.15
    public static void printPattern3(int n){
        int star = 1; int space = n-1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }


            for(int j = 1;j<=star;j++){
                System.out.print("* ");
            }
                star++; space--;
                System.out.println();
            
        }
    }

    // q.16
    public static void printPattern33(int n){
        int star = n; int space = 0;
        for(int i = 1;i<=n;i++){
    
            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }

            for(int j = 1;j<=star;j++){
                System.out.print("* ");
            }
            star --; space ++;
            System.out.println();
        }
        
    }
   

   // q.17
    public static void printPattern4(int n){
        int start = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=start;j++){
                System.out.print(i+" ");
            }
            start++;
            System.out.println();
        }
    }
    
    // q.18
    public static void printPattern5(int n){
        int start = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=start;j++){
                System.out.print(i%2+" ");
            }
            start++;
            System.out.println();
        }
    }
    
    // q.19
    public static void printPattern6(int n){
        int start = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=start;j++){
                System.out.print(j+" ");
            }
            start++;
            System.out.println();
        }
    }
    
    // 20
    public static void printPattern7(int n){
        int start = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=start;j++){
                System.out.print(j%2+" ");
            }
            start++;
            System.out.println();
        }
    }
   
   // 21
    public static void printPattern8(int n){
        int star= n;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                
                 System.out.print(star +" ");
            }
            //System.out.print(star +" ");
            star --;
            System.out.println();
        }
    }

    // q.22
    public static void printPattern9(int n){
        int star = 1;
        for(int i = 1;i<=n;i++){
            int num = i;
            for(int j = 1;j<=star;j++){
                System.out.print(num-- + " ");
            }
            star++;
            System.out.println();
        }
    }

    // q. 23
    public static void printPattern10(int n){
        int num = 1;
        int star = 1;
        for(int i = 1 ;i<=n;i++){
            for(int j = 1;j<=star;j++){
                   System.out.print(num++ + " ");
            }
            star++;
            System.out.println();
        }
    }

    // q 24
     public static void printPattern11(int n){
        int num = 1;
        int star = 1;
        for(int i = 1 ;i<=n;i++){
            for(int j = 1;j<=star;j++){
                   System.out.print(num-- + " ");
            }
            star++;  num = num+2*i+1;
            System.out.println();
        }
    }

    // q .25    try it later again it
    public static void printPattern12(int n){

        int star = 1;
        int num = n*(n+1)/2;
        for(int i = 1;i<=n;i++){
            for(int j = num-star+1;j<=num;j++){
                System.out.print(j + " ");
            }
             num = num - star;
            star ++ ;
            System.out.println();
        }
    }



    // q. 26  try agian

     public static void printPattern13(int n){
        int star = 1;
        int num = n*(n+1)/2;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=star;j++){
                System.out.print(num++ + " ");
            }
            star ++ ; num = num - i;
            System.out.println();
        }
    }

    // q.27
    public static void printPattern14(int n){
        int star = 1; int num = 65;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=star;j++){
                System.out.print((char) (num++) +" ");
            }
            star++;
            System.out.println();
        }
    }

    // q. 28
    public static void printPattern15(int n){
        int star = 1; int num = n*(n+1)/2 +64;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=star;j++){
               System.out.print((char) (num--) +" ");
            }
            star++;
            System.out.println();
        }
    }
    

    // q.29
    public static void printPattern16(int n){
        int star = 1;
        for(int i = 1;i<=n;i++){
             int num = i+64;
            for(int j = 1;j<=star;j++){
                System.out.print((char)(num) + " ");
            }
            star++;
            System.out.println();
        }
    }

    // q.30
    public static void printPattern17(int n){
        int star = 1;  
        for(int i = 1;i<=n;i++){
            // int star = 1;
            for(int j = 1;j<=star;j++){
               System.out.print((char)(j+64) + " ");
            }
            star++;
            System.out.println();
        }
    }

    // q.31
    public static void printPattern18(int n){
        int star = 1;  int num = n+64;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=star;j++){
                System.out.print((char)(num) + " ");
            }
            num--;
            star++;
            System.out.println();
        }
    }

    // q.32
    public static void printPattern19(int n){
        
        int star = 1;
        for(int i = 1;i<=n;i++){
            int num = i+64;
            for(int j = 1;j<=star;j++){
                System.out.print((char)(num--) +" ");
            }
            star++;
            System.out.println();
        }
    }
    
}