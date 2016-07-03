import dynamic_programming.MaximalIncreasingSequence;
import sorting.HeapSort;
import sorting.QuickSort;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array1 = new int[]{7, 20, 3, 31, 4, 17, 9, 40, 26, 19, 34};
        QuickSort.sort(array1, 0, 10);
        System.out.println(Arrays.toString(array1));

        int[] array2 = new int[]{7, 20, 3, 31, 4, 17, 9, 40, 26, 19, 34};
        HeapSort.sort(array2, 11);
        System.out.println(Arrays.toString(array2));

        int[] array3 = new int[]{4, 7, 8, 1, 2, 3, 4, 2, 3, 8, 1, 90, 10, 20};
        int[] result = MaximalIncreasingSequence.get(array3, 14);
        for (int i = result[0]; i < result[1]; i++)
            System.out.print(array3[i] + " ");
    }
}
