
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
        // String res = reverse(s);
        // System.out.println(res);
        // reverse1(s);
        // boolean res = isPalindrome1(s);
        // System.out.println(res);
        // String[] arr= {"abc","car","cool"};
        // String res= getFirstPalindrome(arr);
        // System.out.println(res);

        // String res = replaceSpaceChar("hello world");
        // System.out.println(res);

        // boolean r=  isContainsDigit("23f45");
        // System.out.println(r);
        // String res =   margeString("hackerrank","mountain");
        // System.out.println(res);
        
        String[] arr = {"ram", "sita", "gitaaa"};
       //getSecondLargestStr(arr);
        //getLargestStr(arr);
       // getEvenLengthStr(arr);

        int[] array =  {2,5,4,3,6};
       int[] resArr =  asceptSelfSum(array);
       for (int a : resArr) {
        System.out.println(a);
       }

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
    
    // q. 4
    public static void getLargestStr(String[] s){
        int[] cntArr= new int[s.length];
        for(int i  = 0;i<s.length;i++){
            System.out.println(s[i]);
            int len = getLength(s[i]);
            cntArr[i] = len;
        }
        int maxLen = 0; int secMax= 0;
        for(int i = 0;i<cntArr.length;i++){
            if(cntArr[i] > maxLen){
                
                maxLen = cntArr[i];
            }
        }
        System.out.println(maxLen);

    }

    public static int getLength(String s){
        int count = 0;
        for(int i = 0;i<s.length();i++){
            count++;
        }
        return count;
    }

    // return second max string length

    public static void getSecondLargestStr(String[] s){
        int[] cntArr= new int[s.length];
        for(int i  = 0;i<s.length;i++){
            System.out.println(s[i]);
            int len = getLength(s[i]);
            cntArr[i] = len;
        }
        int maxLen = 0; int secMax= 0;
        for(int i = 0;i<cntArr.length;i++){
            if(cntArr[i] > maxLen){
                secMax = maxLen;
                maxLen = cntArr[i];
            }else if(cntArr[i] > secMax && cntArr[i] != maxLen){
                secMax = cntArr[i];
            }
        }
        System.out.println(secMax);

    }

    // q. 5 later
     public static void getEvenLengthStr(String[] s){
        int[] cntArr= new int[s.length];
        for(int i  = 0;i<s.length;i++){
            //System.out.println(s[i]);
            int len = getLength(s[i]);
            cntArr[i] = len;
        }
        
        for(int i = 0;i<cntArr.length;i++){
           if(cntArr[i] % 2 == 0){
           // System.out.println(cntArr[i]); // this line print the string length
            System.out.println(s[i]); // thos leine print the string whic has even
           }
        }
       

    }

    // q. 6
    public static int[] asceptSelfSum(int[] arr){
        int[] newArr= new int[arr.length];
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum + arr[i];
        }

        for(int i = 0;i<arr.length;i++){
            int newSum = 0;
            newSum = sum - arr[i];
            newArr[i] = newSum;
        }
        return  newArr;
    }

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
    public static void printNumbricIndex(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                System.err.println(i);
            }
        }
    }

    // q. 8
    public static void printSpaceIndex(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                System.err.println(i);
            }
        }
    }

    // q. 9
    public static String segregateNum(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                res = res + c;
            } else {
                res = c + res;
            }
        }
        return res;
    }

    // q. 10
    public static String segregateNumAndChar(String s) {
        String num = "";
        String alp = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                num = num + c;
            } else {
                alp = alp + c;
            }
        }
        return alp + num;
    }

    // q. 11
    public static String reverse(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            res = c + res;
        }
        return res;

    }

    public static void reverse1(String s) {
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }

    // q. 12. one way
    public static void isPalindrome(String s) {
        String res = "";
        String temp = s;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            res = c + res;
        }
        if (res.equalsIgnoreCase(temp)) {
            System.out.println("this is palindrome");
        } else {
            System.out.println("this is not palindrome");
        }
    }

    // q. 12 // this is check palindrome without reverse the string
    public static boolean isPalindrome1(String s) {
        s = s.toLowerCase();
        int st = 0;
        int end = s.length() - 1;

        while (st < end) {
            if (s.charAt(st) != s.charAt(end)) {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }

    // q. 13
    public static String getFirstPalindrome(String[] arr) {

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];

            if (isPalindrome1(word)) {
                return word;

            }
        }

        return "";
    }

    /// q. 15
    public static String replaceSpaceChar(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                res = res + "_";
            } else {
                res = res + c;
            }
        }
        return res;
    }

    // q.16
    public static boolean isContainsDigit(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c <'0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    // q 17 later 
    // q. 18 later
    // 19
    public static String margeString(String s1,String s2){
        String res = "";
        int i = 0;
        while (i<s1.length() && i < s2.length()) {
            res = res + s1.charAt(i) + s2.charAt(i);
            i++;
        }
        return i < s1.length()? res + s1.substring(i) : res+s2.substring(i);
    }

    // q 20
    // q. 21 later zig zag conversion
}
