package arrays;

public class Array_2D_Iterate_p1 {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        for(int i =0;i<arr1.length;i++){
            for(int j =0;j<arr1[i].length;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
