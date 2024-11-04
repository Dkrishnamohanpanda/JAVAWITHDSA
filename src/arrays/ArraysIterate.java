package arrays;
 import java.util.Arrays;

public class ArraysIterate {
    public static void main(String[] args) {
        int[] marks = {12,45,67,87,34,59};
        System.out.println(marks.length);
        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
//        System.out.println(marks[7]);
        System.out.println("-------------------------------");
        for(int i =0;i<marks.length;i++){
            System.out.println(marks[i]);


            Arrays.sort(marks);//{12,34,45,59,67,87}
             int item_index = Arrays.binarySearch(marks,59); //After sorting searching is work
            //Binarysearch required sorted array
            System.out.println(item_index);//3



        }

        System.out.println();

    }
}
