import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testSelectionSort {

    @Test
    public void testPositives() {
        SelectionSort sorter = new SelectionSort();
        int[] arr = {5, 2, 8, 1, 9};
        int[] expected = {1, 2, 5, 8, 9};
        sorter.selectionSort(arr);
        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void testNegatives() {
        SelectionSort sorter = new SelectionSort();
        int[] arr = {-5, -2, -8, -1, -9};
        int[] expected = {-9, -8, -5, -2, -1};
        sorter.selectionSort(arr);
        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void testMixed() {
        SelectionSort sorter = new SelectionSort();
        int[] arr = {5, -2, 0, 1, -9};
        int[] expected = {-9, -2, 0, 1, 5};
        sorter.selectionSort(arr);
        Assertions.assertArrayEquals(expected, arr);
    }
}
