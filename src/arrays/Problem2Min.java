package arrays;

public class Problem2Min {
    public static void main(String[] args) {
        int []nums ={3,6,4,34,56,78,90};
        int min =Integer.MAX_VALUE;
        for(int num:nums){
            if(num < min){
                min = num;
            }
        }
        System.out.println("small no is : "+ min);
    }
}
