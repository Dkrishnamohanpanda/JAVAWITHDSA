package arrays;

public class Problem1Array {
    public static void main(String[] args) {
        int marks[] = {23,45,67,89,90,13};
        int sum = 0;
        for(int mark:marks){
            sum=sum+mark;
        }
        System.out.println("sum of marks :"+ sum);

    }
}
