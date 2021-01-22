package sorting;

import java.util.Arrays;

public class SortingService {
    public static void main(String[] args) {
        int[] array = {5, 63, 94, 1, -5, 107};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
