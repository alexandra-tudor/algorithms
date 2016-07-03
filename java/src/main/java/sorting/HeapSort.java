package sorting;

public class HeapSort {

    private static int parent(int i) {
        return (i-1)/2;
    }

    private static int leftChild(int i) {
        return i*2 + 1;
    }

    private static int rightChild(int i) {
        return i*2 + 2;
    }

    /**
     * MAXHEAP
     * @param a array
     * @param len array length
     */
    private static void heapify(int[] a, int len) {
        int start = parent(len);
        while (start >= 0) {
            int left = leftChild(start);
            int right = rightChild(start);
            if (left <= len) {
                if (a[start] < a[left]) {
                    int aux = a[start];
                    a[start] = a[left];
                    a[left] = aux;
                }
            }
            if (right <= len) {
                if (a[start] < a[right]) {
                    int aux = a[start];
                    a[start] = a[right];
                    a[right] = aux;
                }
            }
            start--;
        }
    }

    public static void sort(int[] a, int len) {
        int end = len - 1;
        while(end > 0) {
            heapify(a, end);
            int aux = a[end];
            a[end] = a[0];
            a[0] = aux;
            end--;
        }
    }
}
