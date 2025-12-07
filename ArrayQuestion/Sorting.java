public class Sorting {
    public static void main(String[] args) {
        int[] a = { 2, 1, 3, 9, 5 };
        int[] b = asecdingOredr(a);
        for (int i : b) {
        System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        // return a;
    }

    public static void margeSort(int[] a, int st, int end) {
        if (st < end) {
            int mid = st + (end - st) / 2;
            margeSort(a, st, mid);
            margeSort(a, mid + 1, end);
            marge(a, st, mid, end);
        }
    }

    public static void marge(int[] a, int st, int mid, int end) {
        int index1 = st, index2 = mid + 1, index3 = 0;
        int[] marged = new int[end - st + 1];

        while (index1 <= mid && index2 <= end) {
            if (a[index1] < a[index2]) {
                marged[index3] = a[index1];
                index1++;
                index3++;
            } else {
                marged[index3] = a[index2];
                index3++;
                index2++;
            }
        }

        while (index1 <= mid) {
            marged[index3++] = a[index1++];
        }

        while (index2 <= end) {
            marged[index3++] = a[index2++];
        }

        // copy of all emennt
        for (int i = st, j = 0; j < marged.length; j++, i++) {
            a[i] = marged[j];
        }
    }

    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {

            int min = a[i];
            int minIndex = i;

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    minIndex = j;
                }
            }

            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }

    // public static void margeSort(int[] a,int st,int end){
    // int mid = st+(end-st)/2;

    // margeSort(a,st,mid);
    // margeSort(a,mid+1,end);
    // marge()
    // }

    // asecding order program
    public static int[] asecdingOredr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        return a;
    }
}
