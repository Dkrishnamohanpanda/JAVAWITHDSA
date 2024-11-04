package arrays;

public class ArrayMax {
    public static void main(String[] args) {
        int[] array = {34,24,12,67,98,45};
         int max_value = find_max(array);
        System.out.println(max_value );

    }
    static int find_max(int[] array){
        int max = array[0];
        for(int i =0;i<array.length;i++){
            if(max < array[i]){
                max = array[i];

            }
        }
        return max;
    }
}
