package arrays;

import java.util.Arrays;

public class Q_reverse_Array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int i = 0,j=arr.length-1,temp;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
            System.out.println(Arrays.toString(arr));
        }


//        int arr[] = {1,2,3,4,5};
//        int i =0,j=arr.length - 1,temp;
//        while(i<j){
//        if i>j and i ==j then the reverse will not work
//           temp = arr[i];
//           arr[i] = arr[j];
//           arr[j] = temp;
//           i++;
//           j--;
//            System.out.println(Arrays.toString(arr));
//        }

    }
}
