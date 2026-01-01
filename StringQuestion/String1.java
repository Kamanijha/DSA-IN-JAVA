
public class String1 {
    public static void main(String[] args) {
        String s = "Madam";
        // for(int i = 0;i<s.length();i++){
        // System.out.println(s.charAt(i));
        // }

        // for(int i = s.length()-1;i>=0;i--){
        // System.out.println(s.charAt(i));
        // }

        // for(int i = 0;i<s.length();i++){

        // }
        // String res= reverseWord(s);
        // System.out.println(res);

        // int res = countAllVowel(s);
        // System.out.println(res);
    //    String res =  reverse(s);
    //    System.out.println(res);
    //reverse1(s);
   boolean res = isPalindrome1(s);
   System.out.println(res);
     
    }

    public static String reverseWord(String s) {
        String temp = " ";
        String word = " ";
        for (int i = 0; i <= s.length() - 1; i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                temp = temp + c;
            }
            if (c == ' ' || i == s.length() - 1) {
                word = temp + " " + word;
                temp = " ";
            }
        }
        return word;
    }

    // q. 2
    // public static int CountNumbricChar(String s){
    // int count =0;
    // for(int i = 0;i<s.length();i++){
    // char c = s.charAt(i);
    // if((int)c >=48 && (int)c <=57){
    // count ++;
    // System.out.println(c);
    // }
    // }
    // return count;
    // }

    // 2. another way
    public static int CountNumbricChar(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {

            if (c >= '0' && c <= '9') {
                count++;
                System.out.println(c);
            }
        }
        return count;
    }
    // q . get numberic value sum
    // public static int getNumbricSum(String s){
    // int sum =0;
    // for(char c: s.toCharArray()){

    // if(c >='0' && c <='9'){
    // sum = sum+(int)c-((int)'0');
    // System.out.println(c);
    // }
    // }
    // return sum;
    // }

    // in another way
    public static int getNumbricSum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((int) c >= 48 && (int) c <= 57) {
                sum = sum + (int) c - 48;
                // System.out.println(c);
            }
        }
        return sum;
    }

    // q. count word
    public static int countWordWithoutSpace(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i == 0 && c != ' ' || (c != ' ' && s.charAt(i - 1) == ' ')) {
                count++;
            }
        }
        return count;
    }

    // q. 3 count charcter

    public static int countCharWithoutSpace(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                count++;
        }
        return count;
    }

    // q. 5 later
    // q. 4 later
    // q. 6 count all vowel
    public static int countAllVowel(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    // q. 7
    public static void printNumbricIndex(String s){
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= '0' && c <= '9'){
                System.err.println(i);
            }
        }    
    }

    // q. 8
    public static void printSpaceIndex(String s){
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c==' '){
                System.err.println(i);
            }
        }
    }

    // q. 9
    public static String segregateNum(String s){
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >='0' && c <='9'){
                res = res +c;
            }else{
                res = c+res;
            }
        }  
        return res;  
    }

    // q. 10
    public static String segregateNumAndChar(String s){
        String num = "";String alp = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >='0' && c <='9'){
                num = num +c;
            }else{
                alp = alp + c;
            }
        }  
        return alp+ num ; 
    }

    // q. 11
    public static String reverse(String s){
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            res = c+res;
        }   
        return res; 

    }

    public static void reverse1(String s){
         String res = "";
         for(int i = s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
         }
    }

    // q. 12.  one way
    public static void isPalindrome(String s){
        String res = ""; String temp = s;
         for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            res = c+res;
        }
        if(res.equalsIgnoreCase(temp)){
            System.out.println("this is palindrome");
        }else{
            System.out.println("this is not palindrome");
        }
    }

    // q. 12 // this is check palindrome without reverse the string
    public static boolean isPalindrome1(String s){
        s = s.toLowerCase();
        int st = 0; int end = s.length()-1;

        while (st < end) {
            if(s.charAt(st) != s.charAt(end)){
                return false;
            }
            st++; end--;
        }
        return true;
    }
}
