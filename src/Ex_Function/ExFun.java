package Ex_Function;
//pass the value of numbers when you are calling the method in main
public class ExFun {
    public static void main(String[] args) {
        int sum = sum1(10,20);
        System.out.println(sum);

    }
    static int sum1(int a,int b){
        int sum = a+b;
        return sum;
    }
}
