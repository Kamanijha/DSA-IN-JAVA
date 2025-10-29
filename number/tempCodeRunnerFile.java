Scanner sc = new Scanner(System.in);
        // System.out.print("enter the number :");
        // int n = sc.nextInt();


        // Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
       int res =  Isprime(10);
       System.out.println("total count is :"+res);
    }
    
    // public static boolean Isprime1(int n){
    //     if(n<1) return false;
        
    //     for(int i = 2;i*i<=n-1;i++){
    //         if(n%i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    
    // public static int  Isprime(int s,int e){
        
    //     int count=0;
    //     for(int i = s+1;i<=e-1;i++){
    //         boolean IsPrime = true;
    //         for(int j =2;j<i;j++){
    //           if(i%j == 0){
    //               IsPrime = false;
    //               break;
    //             }
    //         }
    //         if(IsPrime){
    //             count++;
    //             System.out.println(i);
    //         }
            
    //     }
    //     return count;
        
    // }
    
    //  public static int  Isprime(int s,int e){
        
    //     int count=0;
    //     for(int i = s;i<=e;i++){
    //         boolean IsPrime = true;
    //         for(int j =2;j<i;j++){
    //           if(i%j == 0){
    //               IsPrime = false;
    //               break;
    //             }
    //         }
    //         if(IsPrime){
    //             count++;
    //             System.out.println(i);
    //         }
            
    //     }
    //     return count;
        
    // }
    
    //  public static int  Isprime(int e){
    //     if(e <2) {
    //         System.out.println("invalid number");
    //         return 0;
    //     }
    //     int count=0;
    //     for(int i =2;i<=e;i++){
    //         boolean IsPrime = true;
    //         for(int j =2;j<i;j++){
    //           if(i%j == 0){
    //               IsPrime = false;
    //               break;
    //             }
    //         }
    //         if(IsPrime){
    //             count++;
    //             System.out.println(i);
    //         }
            
    //     }
    //     return count;
    // }
    
    public static int  Isprime(int e){
        if(e <2) {
            System.out.println("invalid number");
            return 0;
        }
        int count=0; int cntSum =0;
        for(int i =2;i<=e;i++){
            boolean IsPrime = true;
            for(int j =2;j<i;j++){
               if(i%j == 0){
                   IsPrime = false;
                  break;
                }
            }
            if(IsPrime){
                count++;
                cntSum = cntSum+i;
                System.out.println(i);
            }
            
        }
        if(Isprime1(cntSum)){
            System.out.println("count sum is prime number ");
        }else{
            System.out.println("count sum is prime number ");
        }
        
        return cntSum;
    }
    public static boolean Isprime1(int n){
        if(n<1) return false;
        
        for(int i = 2;i*i<=n-1;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void rverseNumber(int n){
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = 
        }
    }
    
}