package exercise_2_Ecommerce_search_function;

public class LinearSearch {

    public static int search(Product[] arr, int target) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i].productId == target) {
                return i;
            }
        }
        return -1;
    }
}
