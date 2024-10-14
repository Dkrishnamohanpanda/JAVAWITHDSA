package Day1Palindrome_13_10;
//check the no is palindrome or not .Leetcode9
public class Solu1 {
    public static void main(String[] args) {
        int x=125;
        int n=x;
        int rev =0,rem;
        while(n>0){
            rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        if(rev == x){
            System.out.println("no is palindromme");
        }else {
            System.out.println("no is not palindrome");
        }
    }
}
