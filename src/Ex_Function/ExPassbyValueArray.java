package Ex_Function;

import java.util.Arrays;

public class ExPassbyValueArray {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[]nums){
        nums[0]=99;
    }
}
