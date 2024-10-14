package Day2Palindrome_14_10;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n){
        if(n<1){
            return false;
        } else if (n ==1) {
            return  true;
        }
        else {
            while (n %2 == 0){
                n = n/2;
            }
            if (n == 1){
                return true;
            }else {
                return false;
            }
        }

    }

    public static void main(String[] args) {
        PowerOfTwo p = new PowerOfTwo();
        int n = 16;
        boolean result = p.isPowerOfTwo(n);
        System.out.println(" Is " + n + "  power of two : " +result);

    }
}
