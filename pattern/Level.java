class Level{

    public static void main(String[] args){
       //printPattern11(9);
       //swasticPrint(9);
       printPattern12(9);
    }

    public static void printPattern(int n){
        for(int i = 1;i<= n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // q.1
    public static void printPattern1(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=n;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // q 2
    public static void printPattern2(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print(i%2 + " ");
            }
            System.out.println();
        }
    }

    //q 3
     public static void printPattern3(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // q 4
    public static void printPattern4(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print(j%2 + " ");
            }
            System.out.println();
        }
    }

    // q 5
    public static void printPattern5(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i == 1 || i == n || j ==1|| j == n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printPattern6(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i == 1 || i == 2|| i == n-1 || i == n || j ==1||j == 2|| j == n -1|| j == n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printPattern7(int n){
        for(int i = 1;i<=n;i++){
            int mid = (n+1)/2;
            for(int  j = 1;j<=n;j++){
                
                if(i == mid || j == mid){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }

    public static void printPattern8(int n){
        for(int i = 1; i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i == j || i+j == n+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
   // q. 9
    public static void printPattern10(int n){
        for(int i = 1; i<=n;i++){
            int mid = (n+1)/2;
            for(int j = 1;j<=n;j++){
                if(i == j || i+j == n+1 || i == mid || j == mid || i == 1 || i == n || j == 1 || j == n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // 10  
    public static void printPattern11(int n){
        int mid = (n+1)/2;
        for(int i = 1; i<=n;i++){
            // int mid = (n+1)/2;
            for(int j = 1;j<=n;j++){
                if(i == j || i+j == n+1 || i == mid || j == mid || i == 1 || i == n || j == 1 || j == n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for(int i = 1; i<=n ;i++){
                System.out.println("* *");
        }
    }

    public static void swasticPrint(int n){
        int mid = (n+1)/2;
        for(int i = 1 ; i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i == mid || j == mid || i==1&&j>mid || i==n&&j<mid || j==n&&i>mid || j==1&&i<mid){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printPattern12(int n){
        for(int i = 1;i <=n ; i++){
            for(int j = 1; j<= n; j++){
                System.out.print("("+i+","+j+")");
            }
            System.out.println();
        }
    }
}