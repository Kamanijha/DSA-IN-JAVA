public class Array6 {
    public static void main(String[] args) {
        // int[] a= {1,3,5,7,9};
        // int[] b = {2,4,8,10,11};
        int[] a = { 1, 4, 2, 12, 9, 14 };
        int[] b = { 45, 67, 34, 13, 48, 32 };
        int[] res = margeUnsortedArray(a, b);
        // int[] res= margeSortedArray(a,b);
        for (int i : res) {
            System.out.print(i + " ");
        }
        // int[] c = sortArray(a);
        // for(int i :c){
        // System.out.print(i);
        // }

    }

    public static int[] sortArray(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

    public static int[] margeSortedArray(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result[k] = a[i];
                k++;
                i++;
            } else {
                result[k] = b[j];
                k++;
                j++;
            }
        }

        while (i < a.length) {
            result[k++] = a[i++];
        }

        while (j < b.length) {
            result[k++] = b[j++];
        }
        return result;
    }

    public static int[] margeUnsortedArray(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[a.length + b.length];

        while (i < a.length) {
            result[k++] = a[i++];
        }
        while (j < b.length) {
            result[k++] = b[j++];
        }

        for (int c = 0; c < result.length; c++) {
            for (int d = 0; d < result.length - 1; d++) {
                if (result[d] > result[d + 1]) {
                    int temp = result[d];
                    result[d] = result[d + 1];
                    result[d + 1] = temp;
                }
            }
        }
        return result;
    }
}
