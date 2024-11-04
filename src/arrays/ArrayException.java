package arrays;

public class ArrayException {
    public static void main(String[] args) {
        int[] a = new int[-1]; //NegativeArraySizeException
//        int[] a2 = new int[5];//ArrayOutOfBoundException
//        System.out.println(a2[10]);
       System.out.println(a);
    }
}
