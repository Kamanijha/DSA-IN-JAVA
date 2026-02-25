public class String2 {
    public static void main(String[] args) {
        // int res = evenNumberSumInString("a3f4j5m6");
        // System.out.println(res);
        // String res = removeDuplicate("aabbddd");
        // System.out.println(res);
        // printFrequncy("dnnddeeaack");
        // int res = countWord("hello world ");
        // System.out.println(res);
        // int num = bigNumbricChar("hello");
        // System.out.println(num);
        // int secBigNUm = secondBigNum("ef4fgh4");
        // System.out.println(secBigNUm);
       // AlphabateUpperCase("aBBN23@fKNghL");
        // System.out.println(res);
        // printCharcterOnce("programming");
        // printFreqOfCharcter("hell345@@oo");
        // printOnce("hello world") ;
        //printMoreOnce("hello");
        //maxFreqCharcter("aaBBBBBBcbdf");
        //BigCharMaxFreqCharcter("aaaefbbbgccc");
        //smallCharMaxFreqCharcter("abceeefggg");
        //firstUniqChar("leetcode");
       convertCapitalToSmall("HeLlO");
        
    }

    // 22
    public static int NumberSumInString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 48 && c <= 57) {
                sum = (sum + c) - 48;
            }
        }
        return sum;
    }

    // q 23
    public static int evenNumberSumInString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 48 && c <= 57) {
                if (c % 2 == 0) {
                    sum = (sum + c) - 48;
                }

            }
        }
        return sum;
    }

    // 24
    public static String removeDuplicate(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!res.contains(c + "")) {
                res = res + c;
            }
        }
        return res;
    }

    // build frequency array string
    // public static void printFrequncy(String s){
    // int[] freq = new int[26];
    // for(int i = 0;i<s.length();i++){
    // char c = s.charAt(i);
    // if(c >=65 && c <= 90){
    // freq[c-65]++;
    // }else if(c >= 97 && c <=122){
    // freq[c-97]++;
    // }
    // }

    // for(int i = 0;i<freq.length;i++){
    // if(freq[i] >0){
    // //System.out.println((char)(i +97) + " is " + freq[i] + " times");
    // }
    // }
    // }

    // 24 using freq array string
    public static void printFrequncy(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 65 && c <= 90) {
                freq[c - 65]++;
            } else if (c >= 97 && c <= 122) {
                freq[c - 97]++;
            }
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i + 97));
            }
        }
    }

    // q. 25
    public static int countWord(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i == 0 && c != ' ' || (c != ' ' && s.charAt(i - 1) == ' ')) {
                count++;
            }
        }
        return count;
    }

    // 26 countword using split method

    // q. 27
    public static int bigNumbricChar(String s) {
        int num = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                int digit = c - '0';
                if (num < digit) {
                    num = digit;
                }
            }
        }
        return num;
    }

    // 28
    public static int secondBigNum(String s) {
        int big = -1;
        int secBig = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                int digit = c - '0';
                if (big < digit) {
                    secBig = big;
                    big = digit;
                } else if (digit > secBig && digit != big) {
                    secBig = digit;
                }
            }
        }
        return secBig;
    }

    // q. 29. "ab@34AcB4nM". o/p = ABM. i will check later this logic is not remove
    // duplicate only give work on upper case
    public static void AlphabateUpperCase(String ss) {
        int[] freq = new int[26];
         String s = ss.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 65 && c <= 90) {
                freq[c - 65]++;
            }
        }

        for (int i = 0; i < freq.length; i++) {
            if(freq[i] == 1){
                System.out.println((char)(i+65));
            }
        }
    }

    // q. 30 

     public static void AlphabateLowerCase(String ss) {
        int[] freq = new int[26];
         String s = ss.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 97 && c <= 122) {
                freq[c - 97]++;
            }
        }

        for (int i = 0; i < freq.length; i++) {
            if(freq[i] == 1){
                System.out.println((char)(i+97));
            }
        }
    }

    // 31  which chacter present onec in all string  print them 
    public static void printCharcterOnce(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1) {
                System.out.println((char) i);
            }
        }
    }

    // q. 32
    // public static void printFreqOfCharcter(String s) {
    //     int[] freq = new int[26];
    //     for (int i = 0; i < s.length(); i++) {
    //         char c = s.charAt(i);
    //         if (c >= 65 && c <= 90) {
    //             freq[c - 65]++;
    //         } else if (c >= 97 && c <= 122) {
    //             freq[c - 97]++;
    //         }
    //     }

    //     for (int i = 0; i < freq.length; i++) {
    //         if (freq[i] > 0) {
    //             System.out.println((char) (i + 97) + " is " + freq[i] + " times");
    //         }
    //     }
    // }
    
    // q. 32
     public static void printFreqOfCharcter(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i) + " is " + freq[i] + " times");
            }
        }
    }

    // q. 33
    public static void printOnce(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1) {
                System.out.println((char) i);
            }
        }
    }

    // q. 34
    public static void printMoreOnce(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) {
                System.out.println((char) i);
            }
        }
    }

    // q. 35

    // q. 36
    public static void maxFreqCharcter(String s){
        int[] freq = new int [26];
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c >= 65 && c <= 90){
                freq[c-65] ++;
            }else if(c >= 97 && c <= 122){
                freq[c-97]++;
            }
        }
        int max =0;int index = 0;
        for(int i = 0;i<freq.length;i++){
            if(freq[i] > max){
                max = freq[i];
                index = i;
            }
        }
        System.out.println((char) (index+97));
    }

    // q. 37
    public static void smallCharMaxFreqCharcter(String s){
         int[] freq = new int [26];
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c >= 65 && c <= 90){
                freq[c-65] ++;
            }else if(c >= 97 && c <= 122){
                freq[c-97]++;
            }
        }

        int max = 0; int index = 0;
        for(int i = 0;i<freq.length;i++){
            if(freq[i] >max){
                max = freq[i];
                index = i;
            }else if(freq[i] == max && i < index){
                index = i;
            }
        }
        System.out.println((char) (index + 'a'));
    }

    // q. 38
     public static void BigCharMaxFreqCharcter(String s){
        int[] freq = new int [26];
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            freq[c-'a'] ++;
        }
        int max =0;int index = 0;
        for(int i = 0;i<freq.length;i++){
            if(freq[i] >= max){
                max = freq[i];
                index = (char) i;
            }
        }
        System.out.println((char) (index+'a'));
    }

    // q. 39   not correct logic
    public static void firstUniqChar(String s){
        int[] freq = new int[26];
        for(int i = 0;i<s.length();i++){
            char c= s.charAt(i);
            freq[c-'a']++;
        }
        int index = 0;
        for(int i = 0;i<freq.length;i++){
            if(freq[i] == 1){
                index = i;
                return;
            }
        }
        System.out.println((char) (index +'a'));
    }
     
    // hElLo HeLlO
    public static void convertCapitalToSmall(String s){
        String temp = "";
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            int num = (int) c;
            if(num >= 97 && num <= 122){
                temp = temp + (char) (num - 32);
            }
            else if(num >= 65 && num <= 90){
                temp = temp + (char) (num + 32);
            }
        }
        System.out.println(temp);
    }
}
