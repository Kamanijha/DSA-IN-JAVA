import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Array2 {
    public static void main(String[] args) {
        // int[] arr = { 10, 20, 30, 40 };
        // printNewArray(arr);
        // printNewArray1(arr);
        // int[] result = runningSum(arr);
        // for(int s : result){
        // System.out.print(s + " ");
        // }
        // int res = differenceOfSum(arr);
        // System.out.println(res);
        // int[] res = productExceptSelf(arr);
        // for (int s : res) {
        // System.out.print(s + " ");
        // }
        // System.out.println();
        // int res = findMaxConsecutiveOnes(arr);
        // int res = findMaxConsecutiveNum(arr,7);
        // System.out.println(res);

        // System.out.println("before revsres array");
        // for(int i = 0;i<arr.length;i++){
        // System.out.print(arr[i] +" ");
        // }
        // int mid = arr.length/2;
        // reverseArray(arr,0,mid);
        // reverseArray(arr,mid,arr.length-1);
        // System.out.println("after revsres array");
        // // for(int i = 0;i<arr.length;i++){
        // // System.out.print(arr[i] +" ");
        // // }

        // for(int x : arr){
        // System.out.print(x +" ");
        // }
        // int[] arr = {10 ,20 ,30 ,40 ,30 ,20 ,10};
        // boolean res = isPalindrome(arr);
        // System.out.println(res);
        // int[] arr = { 12, 7, 11, 2 };
        // int[] res = twoSum(arr, 9);
        // System.out.println(res);
        // for(int x:res){
        // System.out.print(x + " ");
        // }

        // reverseArr(arr, 0, arr.length-1);
        // for (int x: arr) {
        // System.out.print(x +" ");
        // }

        // int[] a = { 10, 20, 30, 40, 50, 60, 70 };
        // for (int x : a) {
        // System.out.print(x + " ");
        // }
        // System.out.println("========================");
        // int[] b = rotateEleByOneLeftSide(a);
        // for (int x : b) {
        // System.out.print(x + " ");
        // }

        int[] a = { 1, 2, 3, 4, 0, 6, 0 };
        // int res= missingElement(a);
        // System.out.println(res);
        // boolean res = checkSortedOrNot(a);

        // System.out.println(res);
        // int[] b = rightRotationKpostion(a, 2);
        // for (int x : b) {
        // System.out.print(x + " ");
        // }
        // rotateLeft(a,3);
        // for (int i = 0;i<a.length;i++) {
        // System.out.print(a[i] + " ");
        // }

        // int[] ar = leftRotationKpostion(a, 3);
        // for (int x : ar) {
        // System.out.print(x + " ");
        // }
        // int[] b = reverseHalfArray(a,0,a.length-1);
        // for(int x : b){
        // System.out.print(x + " ");
        // }
        //int[] b = moveZeross(a);
        int[] c = twoSumUsingMap(a,7);
        for (int x : c) {
            System.out.print(x + " ");
        }

    }

    // q. 6
    public static void printNewArray(int[] a) {
        int[] NewArr = new int[a.length];
        int sm = calculateSum(a);
        for (int i = 0; i < a.length; i++) {
            NewArr[i] = sm - a[i];
            System.out.print(NewArr[i] + " ");
        }
    }

    public static int calculateSum(int[] a) {
        int sum = 0;
        for (int x : a) {
            sum = sum + x;
        }
        return sum;
    }

    // q. 7 // this program for multiply of all element expect self
    public static void printNewArray1(int[] a) {
        int[] NewArr = new int[a.length];
        int multiply = calculateMultiply(a);
        for (int i = 0; i < a.length; i++) {
            NewArr[i] = multiply / a[i];
            System.out.print(NewArr[i] + " ");
        }

    }

    public static int calculateMultiply(int[] a) {
        int mul = 1;
        for (int x : a) {
            mul = mul * x;
        }
        return mul;
    }

    // 7 . leetcode probelem = 1480

    public static int[] runningSum(int[] a) {
        int[] res = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum = sum + a[j];
            }
            res[i] = sum;
        }
        return res;
    }

    // q. 8
    // public static int differenceOfSum(int[] arr) {
    // int elementSum = 0;
    // int digitSum = 0;
    // for (int number : arr) {
    // elementSum = elementSum + number;

    // int temp = number;
    // while (temp > 0) {
    // int rem = temp % 10;
    // digitSum = digitSum + rem;
    // temp /= 10;
    // }
    // }
    // return elementSum - digitSum;

    // }

    // q. 9
    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        int mid = nums.length / 2 - 1;

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
        }
        return result;
    }

    // q. 10 using / division operator
    // public static int[] productExceptSelf(int[] arr){
    // int product = 1; int[] result = new int[arr.length];
    // for(int i = 0;i<arr.length;i++){
    // product = product*arr[i];

    // }
    // for(int i = 0;i<arr.length;i++){
    // result[i]=product/arr[i];
    // }
    // return result;
    // }

    // without using / didvsion operator
    public static int[] productExceptSelf(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    product = product * arr[j];
                }
            }
            result[i] = product;

        }

        return result;
    }

    // q.12
    public static int findMaxConsecutiveOnes(int[] nums) {
        int tempCnt = 0;
        int finalCnt = 0;
        for (int x : nums) {
            if (x == 1) {
                tempCnt++;
            } else {
                if (tempCnt > finalCnt) {
                    finalCnt = tempCnt;
                }
                tempCnt = 0;
            }
        }
        if (tempCnt > finalCnt) {
            finalCnt = tempCnt;
        }
        return finalCnt;
    }

    // q. 13
    public static int findMaxConsecutiveNum(int[] nums, int n) {
        int tempCnt = 0;
        int finalCnt = 0;
        for (int x : nums) {
            if (x == n) {
                tempCnt++;
            } else {
                if (tempCnt > finalCnt) {
                    finalCnt = tempCnt;
                }
                tempCnt = 0;
            }
        }
        if (tempCnt > finalCnt) {
            finalCnt = tempCnt;
        }
        return finalCnt;
    }

    // q.14
    // public static void swapTwoIndexValuesOfTheArray(int[] nums){

    // }

    // q. 15
    // public static void swapTwoIndexVal(int[] arr,int indx1,int indx2){
    // for(int i =0;i<arr.length;i++){
    // if()
    // }
    // }

    // q. 16
    public static void reverseArray(int[] arr, int st, int end) {
        while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;

            st++;
            end--;
        }

    }

    // q. 17
    public static int[] reverseHalfArray(int[] arr, int st, int end) {
        reverseArray(arr, 0, 3);
        reverseArray(arr, 4, arr.length - 1);
        return arr;
    }

    // Q. 18
    public static boolean isPalindrome(int[] arr) {
        int st = 0;
        int end = arr.length - 1;
        while (st < end) {
            if (arr[st] != arr[end]) {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }

    // q. 19
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    // two sum using map

    public static int[] twoSumUsingMap(int[] nums, int target) {
        Map<Integer, Integer> m1 = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (m1.containsKey(complement)) {
                return new int[] {
                        m1.get(complement), i
                };
            }
            m1.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void reverseArr(int[] arr, int st, int end) {
        while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }

    }

    // q. 20
    public static int[] removeEleFromCertainPosition(int[] arr, int index) {
        int[] b = new int[arr.length - 1];

        for (int i = 0; i < b.length; i++) {
            if (i < index) {
                b[i] = arr[i];
            } else {
                b[i] = arr[i + 1];
            }
        }

        return b;
    }

    // q. 21
    public static int[] insertEleFromCertainPosition(int[] a, int index, int val) {
        int[] b = new int[a.length + 1];

        for (int i = 0; i < b.length; i++) {
            if (i < index) {
                b[i] = a[i];
            } else if (i == index) {
                b[i] = val;
            } else {
                b[i] = a[i - 1];
            }
        }

        return b;
    }

    // q. 22
    public static int[] rotateEleByOnePositionRightSide(int[] arr) {
        int[] b = new int[arr.length];
        b[0] = arr[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {

            b[i + 1] = arr[i];

        }

        return b;
    }

    public static void rotateLeft(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);
    }

    public static void reverse(int[] a, int i, int j) {
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

    // q. 26
    public static int[] leftRotationKpostion(int[] arr, int k) {
        int[] b = new int[arr.length];
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            b[(i - k + n) % n] = arr[i];
        }
        return b;
    }

    // q. 24 try later
    // q. 26 try again
    // q. 29 try agin

    // q. 23
    public static int[] rightRotationKpostion(int[] a, int k) {
        int[] b = new int[a.length];
        int n = a.length;
        for (int i = 0; i < a.length; i++) {
            b[(i + k) % n] = a[i];
        }
        return b;
    }

    // q. 25
    public static int[] rotateEleByOneLeftSide(int[] arr) {
        int[] b = new int[arr.length];
        b[arr.length - 1] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            b[i - 1] = arr[i];
        }
        return b;
    }

    // q 27
    public static int missingElement(int[] arr) {
        int n = arr.length;
        int totalSum = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return totalSum - sum;
    }

    // q. 30
    public static boolean checkStrictlyIncreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // q. 31
    public static boolean checkSortedOrNot(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // q. 32
    public static void moveZeros(int[] a) {
        int[] temp = new int[a.length];
        int i = 0;
        for (int n : a) {
            if (n != 0) {
                temp[i] = n;
                i++;
            }
        }

        for (int x : temp) {
            System.out.print(x + " ");
        }
    }

    // q. 32
    public static int[] moveZeross(int[] a) {
        int j = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        for (int i = j + 1; i < a.length; i++) {
            if (a[i] != 0) {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                j++;
            }
        }
        return a;
    }

    // Sieve of Eratosthenes
    public static void SieveOfEratosthenes(int n) {
        boolean[] prime = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            prime[i] = true;
        }
        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        int count = 0;
        for (int p = 2; p <= n; p++) {
            if (prime[p]) {
                System.out.println(p);
            }
        }
    }
}
