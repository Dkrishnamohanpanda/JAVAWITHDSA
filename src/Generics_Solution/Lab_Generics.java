package Generics_Solution;

public class Lab_Generics {
    public static void main(String[] args) {
//    sum_two(5,8);
//    sum_two("manas","bdas");

        sum_two(34,67);
        sum_two("kanha","muna");
        sum_two(9.7,6.8);
        sum_two(true,false);

    }
    public static <T> T sum_two(T a,T b){
        System.out.println(a);
        System.out.println(b);

        return  null;
    }

//    public static Integer sum_two(Integer a, Integer b) {
//        System.out.println(a);
//        System.out.println(b);
//
//        return a+b;
//    }
//
//
//    public static String sum_two(String a, String b) {
//        System.out.println(a);
//        System.out.println(b);
//
//        return null;
//    }
}

