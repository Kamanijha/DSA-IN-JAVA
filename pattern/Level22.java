class Level22{
    

    public static void main(String[] args){
        printPattern45(5);
    }
    
    // q.33

    public static void printPattern33(int n){
        int star = 1; int space = n-1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }


            for(int j = 1;j<=star;j++){
                System.out.print(i+" ");
            }
                star++; space--;
                System.out.println();
            
        }
    }

    // q.34
    public static void printPattern34(int n){
        int star = 1; int space = n-1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }


            for(int j = 1;j<=star;j++){
                System.out.print(i%2+" ");
            }
                star++; space--;
                System.out.println();
            
        }
    }

    // q.35
    public static void printPattern35(int n){
        int star = 1; int space = n-1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }


            for(int j = 1;j<=star;j++){
                System.out.print(j+" ");
            }
                star++; space--;
                System.out.println();
            
        }
    }

    // q.36
    public static void printPattern36(int n){
        int star = 1; int space = n-1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }


            for(int j = 1;j<=star;j++){
                System.out.print(j%2+" ");
            }
                star++; space--;
                System.out.println();
            
        }
    }

    // q.37

    public static void printPattern37(int n){
        int star = 1; int space = n-1; int num = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("   ");
            }


            for(int j = 1;j<=star;j++){
                System.out.printf("%3d",num++);
            }
                star++; space--;
                System.out.println();
            
        }
    }

    // q.38
    public static void printPattern38(int n){
        int star = 1; int space = n-1; int num = n*(n+1)/2;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.printf("%3s","");
            }


            for(int j = 1;j<=star;j++){
                System.out.printf("%3d",num--);
            }
                star++; space--;
                System.out.println();
            
        }
    }

    // q.39

    public static void printPattern39(int n){
        int star = 1; int space = n-1;  int num = n;
        for(int i = 1;i<=n;i++){
            
            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }


            for(int j = 1;j<=star;j++){
                System.out.print(num  +" ");
            }
                star++; space--; num--;
                System.out.println();
            
        }
    }

    // q.40
    public static void printPattern40(int n){
        int star = 1; int space = n-1;  int num = 1;
        for(int i = 1;i<=n;i++){
            
            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }


            for(int j = star;j>=1;j--){
                System.out.print(j  +" ");
            }
                star++; space--; 
                System.out.println();
            
        }
    }

    // q.41
    public static void printPattern41(int n){
        int star = 1;int space = n-1;int num = 1;
        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print("\t");
            }

            for(int j = 1;j<=star;j++){
                System.out.print(num-- +"\t");
            }
            star++;  space--;
            num = num+(2*i+1);
            System.out.println();
        }
    }

    // q.42
    public static void printPattern42(int n){
        int star = 1;int space = n-1; int num = n*(n+1)/2;
        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print("\t");
            }

            for(int j = 1;j<=star;j++){
                System.out.print(num++ + "\t");
            }
            star++;space--; num=num-(2*i+1);
            System.out.println();
        }
    }

    // q.43
    public static void printPattern43(int n){
        int star = 1;int space = n-1; 

        for(int i = 1;i<=n;i++){
                int num = i+64;
            for(int j = 1;j<=space;j++){
                System.out.print("\t");
            }

            for(int k = 1;k<=star;k++){
                System.out.print((char)(num)+"\t");
            }
            star++; space--;
            System.out.println();
        }
    }

    // q.44

    public static void printPattern44(int n){
        int star = 1;int space = n-1;int num = 64;

        for(int i = 1;i<=n;i++){
                

            for(int j = 1;j<=space;j++){
                System.out.print("\t");
            }

            for(int k = 1;k<=star;k++){
                System.out.print((char)(num+k) + "\t");
            }
            star++;space--;
            System.out.println();
        }
    }

    // q.45
    public static void printPattern45(int n){
        int star = 1;int space = n-1;int num = 65;
        for(int i = 1;i<=n;i++){
                
            for(int j = 1;j<=space;j++){
                System.out.print("\t");
            }

            for(int k = 1;k<=star;k++){
                System.out.print((char)(num++) + "\t" );
            }
            star++;space--;
            System.out.println();
        }
    }

    // q.46
    public static void printPattern46(int n){
        int star = 1; int space = n-1;int num = 
    }
}