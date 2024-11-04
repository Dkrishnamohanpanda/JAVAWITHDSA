package arrays;

public class Array_forEach {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 34;
        a[1] =-3;
        a[2] = 9;
//        for(int i=0; i<a.length;i++){
//            System.out.println(a[i]);
//        }
        for(int i :a){
            System.out.println(i);
        }

        String[] names = {"Aju","pupun","Biju","Krishna"};
        for(String name :names){
            System.out.println(name);
        }

    }
}
