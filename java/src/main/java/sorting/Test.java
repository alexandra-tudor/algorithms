package sorting;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array1 = new int[]{7, 20, 3, 31, 4, 17, 9, 40, 26, 19};
        QuickSort.sort(array1, 0, 9);
        System.out.println(Arrays.toString(array1));

        int[] array2 = new int[]{7, 20, 3, 31, 4, 17, 9, 40, 26, 19};
        HeapSort.sort(array2, 10);
        System.out.println(Arrays.toString(array2));
    }
}
