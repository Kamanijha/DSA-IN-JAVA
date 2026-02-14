import java.util.ArrayList;
import java.util.List;

public class collection2 {
    public static void main(String[] args) {
         List <Object> l = new ArrayList<>();
        l.add(12);l.add(11);l.add(190);l.add(145);l.add(156);
        l.add(22);l.add(2);l.add(32);l.add("hello");l.add("world");
        //printInteger(l);
       // evenInteger(l);
       // printThreeDigitInteger(l);
        getSumOfInteger(l);
    }
   
    // q. 2
    public static void printInteger(List<Object> l){
        for(Object obj: l){
            if(obj instanceof Integer){
                System.out.println(obj);
            }
        }
    }

    // q. 3
    public static void evenInteger(List<Object> l){
        for(Object obj: l){
            if(obj instanceof Integer){
                int num =(Integer) obj;
                if(num % 2 == 0){
                    System.out.println(num);
                }
            }
        }
    }

     public static void oddInteger(List<Object> l){
        for(Object obj: l){
            if(obj instanceof Integer){
                int num =(Integer) obj;
                if(num % 2 != 0){
                    System.out.println(num);
                }
            }
        }
    }
     public static void printThreeDigitInteger(List<Object> l){
        for(Object obj: l){
            if(obj instanceof Integer){
                int num =(Integer) obj;
                int digit = getdigit(num);
                if(digit == 3){
                    System.out.println(num);
                }
            }
        }
    }

    public static int getdigit(int n){
        int count = 0;
        while (n>0) {
            count ++;
            n/=10;
        }
        return count;
    }

    // q. 6
    public static void getSumOfInteger(List<Object> l){
        int sum = 0;
         for(Object obj: l){
            if(obj instanceof Integer){
                int num =(Integer) obj;
                sum = sum+num;
            }
        }
        System.out.println(sum);
    }

    // q. 7
    public static void  smallAndLargestInteger(List<Object> l){
        for(Object obj: l){
            if(obj instanceof Integer){
                int num =(Integer) obj;
                
            }
        }
    }

    
}
