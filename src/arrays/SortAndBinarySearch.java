package arrays;
import java.util.Arrays;
public class SortAndBinarySearch {
    public static void main(String[] args) {
        int [] numbers ={3,7,4,89,54};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int index =Arrays.binarySearch(numbers,4);
        System.out.println(index);
        String [] names ={"Aju","D","Raja","Krishna"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}
//After sorting binary search will be perform.
