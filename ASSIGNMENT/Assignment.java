
public class Assignment {
    public static void main(String[] args) {
        // reverseStr("hello");
        // reverseString("hello");
        // reverseStrr("hello");
        // int[] array = { 0, 0, 1, 4, 8 };
        // int res = SecondLargest(array);
        // System.out.println(res);
        // boolean res = isAnagram("listen","silent");
        // System.out.println(res);
        // moveZero(array);
        int[] array = { 1, 2, 3, 4, 5 };
        // int missingNum = missingNumber(array);
        // System.out.println(missingNum);
        // int[] res = rotateKposition(array,2);
        // for(int x : res){
        // System.out.print(x + " ");
        // }
        // nonRepeatingChar("aabbcdde");
        boolean res = isPalindromeStr("mam");
        System.out.println(res);
    }

    // q.1 reverse string
    public static void reverseStr(String s) {
        // empty string for storing the result string
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result = c + result;
        }
        System.out.println(result);
    }

    // 2nd way by using two pointer
    public static void reverseString(String s) {
        // covert string into char array
        char[] array = s.toCharArray();
        // two pointer
        int st = 0;
        int end = array.length - 1;

        while (st < end) {
            // in this stage swap the two variable using temp
            int temp = array[st];
            array[st] = array[end];
            array[end] = (char) temp;
            // increment and decrement
            st++;
            end--;
        }
        // convert array into string
        String str = new String(array);
        System.out.println(str);

    }

    // 3rd way run loop oppsite
    public static void reverseStrr(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i) + "");
        }
        System.out.println();
    }

    // q. 2
    public static int SecondLargest(int[] arr) {
        // Initialize with negative number i assume that array contains non-nagative
        // number
        // Initialize with Integer.MAX_VALUE also
        int largest = -1;
        int secLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            // check if current number is bigger then largest then update
            if (arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];
                // when current number is less then largest and bigger then seclargest and
                // Duplicate largest values are ignored . then update secondlargest
            } else if (arr[i] > secLargest && arr[i] != largest) {
                secLargest = arr[i];
            }
        }
        return secLargest;
    }

    // q. 3
    // this logic is not working
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (freq[i] == 0) {
                return false;
            }
            freq[c - 'a']--;
        }

        return true;
    }


    // is anagram q. 3
    public static boolean isAnagramStr(String s1, String s2) {
        // called getfreq method
        int[] freq1 = getFreq(s1);
        int[] freq2 = getFreq(s2);
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[1]) {
                return false;
            }
        }
        return true;
    }

    // this method bulid frequency array and i assume that only samall charecter is
    // present in string
    public static int[] getFreq(String s) {
        // length of frequency array is 26 acconding to alphabat
        int[] freq = new int[26];
        for (int i = 0; i < 26; i++) {
            // s.charAt(i) - 97 : if character is 'b', its ASCII value is 98
            // 98 - 97 = 1, so frequency of 'b' is store at index 1 in the array
            freq[s.charAt(i) - 'a']++;
        }
        return freq;
    }
    

    // q. 4
    public static void moveZero(int[] arr) {
        // build temp array
        int[] temp = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            // non zero store in frequecy array
            if (arr[i] != 0) {
                temp[index] = arr[i];
                index++;
            }
        }
        // print temp array
        for (int x : temp) {
            System.out.println(x + " ");
        }
    }

    // q. 5
    public static int missingNumber(int[] arr) {
        int n = arr.length + 1;
        // sum of n natural number
        int sumOfNaturalNum = (n * (n + 1)) / 2;
        int elementSum = 0;
        for (int i = 0; i < arr.length; i++) {
            // here calculate the element sum
            elementSum = elementSum + arr[i];
        }
        // return the difference of natural sum and element sum
        return sumOfNaturalNum - elementSum;
    }

    // q. 6 later

    // q.7
    public static int[] rotateKposition(int[] arr, int k) {
        // build temp array
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            // store current element in temp array
            temp[(i + k) % arr.length] = arr[i];
        }
        // I used a temporary array to store rotated elements and then copied them back
        // to the original array so return original array
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
        return arr;
    }

    // q.8 Non-Repeating character
    public static char nonRepeatingChar(String s) {
        int[] frequency = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                frequency[c - 'A']++;
            } else if (c >= 'a' && c <= 'z') {
                frequency[c - 'a']++;
            }

        }
        int i;
        for (i = 0; i < frequency.length; i++) {
            if (frequency[i] == 1) {
                System.out.println((char) (i + 97));
                break;
            }
        }

    }

    // q. 10

    public static boolean isPalindromeStr(String s) {
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

}
