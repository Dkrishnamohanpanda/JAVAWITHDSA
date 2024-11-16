package static_Wrapper_Exception.Wrapper;

public class Conversion {
    public static void main(String[] args) {
   String num = "10";
//   String -> wrapper -> primitive  int
       Integer a = Integer.valueOf(num);
       int a2 = a;
//       String to primitive
        int a3 = Integer.parseInt(num);

    }
}

//Integer a = Integer.valueof(num);
//int a1 = a;
//
//int a3 = Integer.parseInt(num);