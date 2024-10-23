package EX21_10_24_Forloop;

public class Ex14BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if(i==5){
                continue;
            }
            System.out.println(i);//except 5 it will print 0 to 49
        }
    }
}
