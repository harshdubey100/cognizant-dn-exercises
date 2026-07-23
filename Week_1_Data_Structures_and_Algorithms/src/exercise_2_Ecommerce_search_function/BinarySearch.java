package exercise_2_Ecommerce_search_function;

public class BinarySearch {
    public static int search(Product[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid].productId == target) {
                return mid;
            }
            else if (arr[mid].productId < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
