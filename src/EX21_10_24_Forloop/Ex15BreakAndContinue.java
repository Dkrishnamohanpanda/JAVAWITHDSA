package EX21_10_24_Forloop;

public class Ex15BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if(i %2 == 0){
                System.out.println("Even no "+i);
                continue;
            }
            System.out.println(i);//except 5 it will print 0 to 49
        }
    }
}
