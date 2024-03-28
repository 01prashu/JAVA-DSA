import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {12, 5, 2, 8, 9, 11, 1};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int getPartition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int left = start ;
        int right = end;

        while (left < right) {
            while (left <= right && arr[left] <= pivot) {
                left++;
            }
            while (left <= right && arr[right] >= pivot) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        // Swap pivot with the correct position
        int temp = arr[start];
        arr[start] = arr[right];
        arr[right] = temp;

        return right;
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = getPartition(arr, low, high);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }
    }
}
