package arrays;
import java.util.Arrays;
public class DuplicateChecker {
    public static void main(String[] args) {
        int[] arr1 = {2,6,5,4,8,6};
        System.out.println(hasDuplicate(arr1));

        int[] arr2 = {12,44,33,55,66,77};
        System.out.println(hasDuplicate(arr2));

    }
    static boolean hasDuplicate(int[]arr){
        Arrays.sort(arr);
        for(int i =0;i< arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                return true;
            }
        }
        return false;
    }
}
