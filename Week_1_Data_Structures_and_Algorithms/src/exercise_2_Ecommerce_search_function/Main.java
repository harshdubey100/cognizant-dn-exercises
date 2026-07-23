package exercise_2_Ecommerce_search_function;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Watch", "Accessories");
        Product p2 = new Product(102, "Laptop", "Electronics");
        Product p3 = new Product(103, "Tablet", "Electronics");
        Product p4 = new Product(104, "Phone", "Electronics");
        Product p5 = new Product(105, "Shoes", "Fashion");

        Product[] arr = EcommerceManager.createArray(p4, p2, p1, p3, p5);
        Product[] sortedArr = EcommerceManager.createSortedArray(p1, p2, p3, p4, p5);

        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("sortedArr: " + Arrays.toString(sortedArr));

        int target = 102;

        int resultLinearSearch = LinearSearch.search(arr, target);
        int resultBinarySearch = BinarySearch.search(sortedArr, target);

        System.out.print("resultBinarySearch: " + resultBinarySearch+ " " + " resultLinearSearch: "+ resultLinearSearch);
    }
}
