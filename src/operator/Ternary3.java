package operator;

public class Ternary3 {
    public static void main(String[] args) {
        int a = 10,b=45,c=90;
        int result = (a>b)?a:(b>c)?b:c;
        System.out.println(result);
    }
}
