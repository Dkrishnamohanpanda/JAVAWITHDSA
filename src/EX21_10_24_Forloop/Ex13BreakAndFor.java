package EX21_10_24_Forloop;

public class Ex13BreakAndFor {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if(i==5){
                break;
            }
            System.out.println(i);//0,1,2,3,4
        }
    }
}
