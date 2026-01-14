import java.util.HashMap;
import java.util.Map;

public class String3 {
    public static void main(String[] args) {
        // String s1 = "abbsdfefd";
        // String s2 = "bsd";
        // boolean res = isSubstring(s1,s2);
        // System.out.println(res);
        String s = "abeffeadbk";
        // int res = lengthOfLargestPalindromicSubstr(s);
        // System.out.println(res);
    //    String res=  getLargestPalindromicSubstr(s);
    //    System.out.println(res);

        // int  res = lengthOfLargestUniqueSubstring(s);
        // System.out.println(res);

        // String res =  geLargestUniqueSubstring(s);
        // System.out.println(res);

        permutation("abc");
    }

    // q. 45
    public static boolean isSubstring(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        for (int i = 0; i < l1 - l2; i++) {
            int j = 0;
            while (j < l2 && s2.charAt(j) == s1.charAt(i + j)) {
                j++;
            }
            if (j == l2) {
                return true;
            }
        }
        return false;
    }

    // q. 47

    public static int lengthOfLargestPalindromicSubstr(String s) {
        int maxlen = 1;
        for (int i = 0; i < s.length(); i++) {
            int l1 = expendAroundCentre(s, i, i);
            int l2 = expendAroundCentre(s, i, i + 1);
            int len = l1 > l2 ? l1 : l2;
            maxlen = maxlen > len ? maxlen : len;
        }
        return maxlen;

    }

    public static int expendAroundCentre(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    // get largest palindromic subtring 
    public static String getLargestPalindromicSubstr(String s) {
        String largest = "";
        for (int i = 0; i < s.length(); i++) {
            String p1 = expendAroundCentre1(s, i, i);
            String p2 = expendAroundCentre1(s, i, i + 1);

            // u can use ternorany operator / if conditional 
            //largest = p1.length() > largest.length()?p1:p2.length() > largest.length()?p2:largest;
            if(p1.length() > largest.length()){
                largest = p1;
            }
            if(p2.length() > largest.length()){
                largest = p2;
            }
            
        }
        return largest;
        

    }

    public static String expendAroundCentre1(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left+1, right);
    }
    
    // q. 46
    // get largest substrign without repition
    // public static void getLargestSubstringWihtoutReapet()

    // lenth of largest substrign without repition
    public static int lengthOfLargestUniqueSubstring(String s){
        int n = s.length(); int left = 0; int maxLen = 0;
        Map<Character , Integer> m = new HashMap<>();
        for(int right = 0; right <s.length();right++){
            char c = s.charAt(right);
            if(m.containsKey(c)){
                left= Math.max(m.get(c)+1,left);
            }
            m.put(c, right);
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }

    // get largest unique substring 
    public static String geLargestUniqueSubstring(String s){
        int n = s.length(); int left = 0; int maxLen = 0; String res = "";
        Map<Character , Integer> m = new HashMap<>();
        int right;
        for( right = 0; right <s.length();right++){
            char c = s.charAt(right);
            if(m.containsKey(c)){
                left= Math.max(m.get(c)+1,left);
            }
            m.put(c, right);
            if(right-left+1 > maxLen){
                maxLen = Math.max(maxLen,right-left+1);
                res = s.substring(left, right+1);
            }
            
        }
        
        return res;
    }


    // print permutation
    public static void permutation(String s){
        printPermutation("", s);
    }

    public static void printPermutation(String prefix,String rem){
        if(rem.length()==0){
            System.out.println(prefix);
            return;
        }
        for(int i = 0;i<rem.length();i++){
            char c = rem.charAt(i);
            String left  = rem.substring(0, i);
            String rigth = rem.substring( i+1);

            printPermutation(prefix+c,left+rigth);
        }
    }
}
