package binarysearch;

public class BinarySearch {

    
    public static void main(String[] args) {
        int[] arrs = new int[]{-35, -16, 75, 108, 932, 1072};
        int i = BinarySearch.binarySearch(arrs, 600);
        System.out.printf("Index: %d", i);
    }
    
    // return -1 if val not found 
    public static int search(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        return -1;
    }
    
    public static int binarySearch(int[] arr, int val) {
        int start = 0;
        int end = arr.length;  // last index + 1
        while (start < end) {
            System.out.printf("Start: %d, end: %d\n", start, end);
            int mid = start + ((end - start) / 2);
            if (arr[mid] == val) {
                return mid;
            } else if (arr[mid] < val) {
                start = mid + 1;
            } else { // if (arr[mid] > val)
                end = mid;
            }
        }
        return -1;
    }
}