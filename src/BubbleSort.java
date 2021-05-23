public class BubbleSort {
    static int[] a = {4, 2, 3, 5, 1};

    public static void main(String[] args) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    swap(i, j);
                }
            }
        }

        for (int val : a) {
            System.out.println(val);
        }

    }

    static void swap(int i, int j) {
        int temp;

        temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }


}
