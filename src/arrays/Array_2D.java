package arrays;

public class Array_2D {
    public static void main(String[] args) {
        int[][] arr_2D = new int [3][3] ;
        arr_2D[0][0] = 90;
        arr_2D[0][1] = 90;
        arr_2D[0][2] = 90;

        arr_2D[1][0] = 90;
        arr_2D[1][1] = 90;
        arr_2D[1][2] = 90;

        arr_2D[2][0] = 90;
        arr_2D[2][1] = 90;
        arr_2D[2][2] = 90;

//     for(int i :arr_2D){
//         System.out.println(i);
//     }
        for(int i =0;i<arr_2D.length;i++){
            for(int j =0;j<arr_2D[i].length;j++){
                System.out.print(arr_2D[i][j] + "  ");
            }
            System.out.println();
        }



    }
}
