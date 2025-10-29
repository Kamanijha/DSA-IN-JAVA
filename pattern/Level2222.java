class Level2222{

    public static void main(String[] args){
        System.out.println("hello");
        printPattern107(7);
    }
    // q.85
    public static void printPattern85(int n){
        int star = 1; int space = n-1; int num= 64;
        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print("   ");
            }

            for(int k = 1;k<=star;k++){
                System.out.printf("%-3c",(char) num+k);
            }
            star+=2;space--;
            num = num+i;
            System.out.println();
        }
    }

    // q. 86
    public static void printPattern86(int n){
        int star = 1; int space = n-1; int num= 64+(n*n);
        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print("   ");
            }

            for(int k = 1;k<=star;k++){
                System.out.printf("%-3c",(char) (num-k+1));
            }
            star+=2;space--;
            num = num-i;
            System.out.println();
        }
    }

    // q.87
    public static void printPattern87(int n){
        int star = 1;int space = n-1;
        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print("   ");
            }
            int num = 64+i;
            for(int k = 1;k<=star;k++){
                System.out.printf("%-3c",(char) num);
            }
            star+=2;space--;
            System.out.println();
        }
    }

    // q.88
    public static void printPattern88(int n){
        int star = 1;int space = n-1;int num = 64;
        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print("   ");
            }
            
            for(int k = 1;k<=star;k++){
                System.out.printf("%-3c",(char) num+k);
            }
            star+=2;space--;
            System.out.println();
        }
    }

    // q.89
    public static void printPattern89(int n){
        int star = 1;int space = n-1;int num = 64+n;
        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print("   ");
            }
            
            for(int k = 1;k<=star;k++){
                System.out.printf("%-3c",(char) num);
            }
            star+=2;space--;
            num--;
            System.out.println();
        }
    }

    // q. 90. // not given correct output  need to MODIFY THIS CODE
    public static void printPattern90(int n){
        int star = 1;int space = n-1;int num = 65;
        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=space;j++){
                System.out.print("   ");
            }
            int temp = num;
            int mid = star/2+1;
            for(int k = 1;k<=star;k++){
                if(k<mid){
                    System.out.printf("%-3c",(char) temp--);
                }else{
                    System.out.printf("%-3c",(char) temp++);
                }
            }
            num+=2;
            star+=2;space--;
            
            System.out.println();
        }
    }

    // q. 91
    public static void printPattern91(int n){
        int star = 1; int space = n-1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("   ");
            }
            int num = 65;
            int mid = star/2+1;
            for(int k = 1;k<=star;k++){
                if(k<mid){
                    System.out.printf("%-3c",(char) num++);
                }else{
                    System.out.printf("%-3c",(char) num--);
                }
            }
            star+=2;
            space--;
            System.out.println();
        }
    }

    // q. 92
    public static void printPattern92(int n){
        int star = 1;int space = n-1; int num = 65;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("   ");
            }
            
            int mid = star/2+1;
            for(int k = 1;k<=star;k++){
                if(k<mid){
                    System.out.printf("%-3c",(char)num++);
                }else{
                    System.out.printf("%-3c",(char)num--);
                }
            }

            star+=2;space--;
            num +=2;
            System.out.println();
        }
    }
    // q.93  NOT GIVE CORRECT OUTPUT CHECK AGAINA
    public static void printPattern93(int n){
        int star = 1;int space = n-1; int num = 65;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("   ");
            }
            
            int mid = star/2+1;
            for(int j= 1;j<=star;j++){
                if(j==mid){
                    System.out.printf("%-3c",(char)num++);
                }else{
                    System.out.printf("%-3c",(char)num--);
                }
            }

            star+=2;space--;
            num +=2;
            System.out.println();
        }
    }

    // Q. 94
    public static void printPattern94(int n){
        int star = n;int space = 0;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print(" ");
            }

            for(int j= 1;j<=star;j++){
                System.out.print("* ");
            }
            star--;
            space++;
            System.out.println();
        }
    }


    // q.95
    public static void printPattern95(int n){
        int star = n;int space = 0; 
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print(" ");
            }
            int num = i;
            for(int j= 1;j<=star;j++){
                System.out.print(i+ " ");
            }
            star--;
            space++;
            System.out.println();
        }
    }

    // q. 96
    public static void printPattern96(int n){
        int star = n;int space = 0; 
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print(" ");
            }
            int num = i;
            for(int j= 1;j<=star;j++){
                System.out.print(i%2+ " ");
            }
            star--;
            space++;
            System.out.println();
        }
    }

    // 97
    public static void printPattern97(int n){
        int star = n;int space = 0; 
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print(" ");
            }
            int num = i;
            for(int j= 1;j<=star;j++){
                System.out.print(j+ " ");
            }
            star--;
            space++;
            System.out.println();
        }
    }
    
    // q. 98
    public static void printPattern98(int n){
        int star = n;int space = 0; 
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print(" ");
            }
            int num = i;
            for(int j= 1;j<=star;j++){
                System.out.print(j%2+ " ");
            }
            star--;
            space++;
            System.out.println();
        }
    }

    // q.99    correct formate logic oe correct
    public static void printPattern99(int n){
        int star = n;int space = 0; int num = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.print("  ");
            }
            
            for(int j= 1;j<=star;j++){
                System.out.printf("%-2d",num++);
            }
            star--;
            space++;
            System.out.println();
        }
    }

    // q. 100
    public static void printPattern100(int n){
        int star = n;int space = 0; int num = n*(n+1)/2;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.printf("%-2s","  ");
            }
            
            for(int j= 1;j<=star;j++){
                System.out.printf("%-4d",num--);
            }
            star--;
            space++;
            System.out.println();
        }
    }

    // q. 101
    public static void printPattern101(int n){
        int star = n;int space = 0; int num = 65;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.printf("%-2s"," ");
            }
            
            for(int j= 1;j<=star;j++){
                System.out.printf("%-4c",(char)(num));
            }
            star--;
            space++;
            num++;
            System.out.println();
        }
    }

    // q.102
    public static void printPattern102(int n){
        int star = n;int space = 0; 
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.printf("%-2s"," ");
            }
            int num = 65;
            for(int j= 1;j<=star;j++){
                System.out.printf("%-4c",(char)(num++));
            }
            star--;
            space++;
            //num++;
            System.out.println();
        }
    }

    // q. 103
    public static void printPattern103(int n){
        int star = n;int space = 0; int num = 65;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.printf("%-2s"," ");
            }
            
            for(int j= 1;j<=star;j++){
                System.out.printf("%-4c",(char)(num++));
            }
            star--;
            space++;
            //num++;
            System.out.println();
        }
    }

    // q. 104
    public static void printPattern104(int n){
        int star = n;int space = 0; int num = 79;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.printf("%-2s"," ");
            }
            
            for(int j= 1;j<=star;j++){
                System.out.printf("%-4c",(char)(num--));
            }
            star--;
            space++;
            //num++;
            System.out.println();
        }
    }
    // q. 105
    public static void printPattern105(int n){
        int star = n;int space = 0; int num = 64+n;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.printf("%-2s"," ");
            }
            
            for(int j= 1;j<=star;j++){
                System.out.printf("%-4c",(char)(num));
            }
            star--;
            space++;
            num--;
            System.out.println();
        }
    }

    // q. 106
    public static void printPattern106(int n){
        int star = n;int space = 0; 
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.printf("%-2s"," ");
            }
            int num = 64+(n-i+1);
            for(int j= 1;j<=star;j++){
                System.out.printf("%-4c",(char)(num--));
            }
            star--;
            space++;
            //num = num+2*2*i;
            System.out.println();
        }
    }
    // q. 107  get help to other  other wise think it
    public static void printPattern107(int n){
        int star = n;int space = 0; 
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=space;j++){
                System.out.printf("%-3s","  ");
            }
          
            for(int j= 1;j<=star;j++){
                System.out.printf("%-3s","*  ");
            }
            star-=2;
            space++;
            
            System.out.println();
        }
    }


}


/// 270
// public static void printPattern270(int n){
//     int mid = n/2+1;
//     int sSpace = n/2; int eStar = 
//     for(int i = 1;i<=n;i++){
//         // part 1
//         for(int j = 1;j<=mid;j++){
//             if(j<sSpace){

//             }
//         }

//         // part 2
//         for(int j= mid+1;j<=n+1;j++){
//             if(i==1||j==n+1|| && i<=mid){
//                 System.ot.print("@ ");

//             }else{
//                 System.ot.print(" ");
//             }
//         }

//         // part 3
//             for(int j= n+2;j<=2*n-1;j++){
//                 if(i>mid){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }

//         // part 4
//         for(int j = 2*n;j<=5*n/2;j++){
//             if(i==1 || j==2*n && i<=mid){
//                 System.out.print("@ ");
//             }else{
//                 System.out.print("  ");
//             }
//         }

//         // art 5
//         for(int  j = 2*n+mid;j<=eStar)
//     }
// }
        


