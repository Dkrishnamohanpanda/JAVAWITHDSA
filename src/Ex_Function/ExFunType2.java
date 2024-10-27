package Ex_Function;
//without argument with return type
public class ExFunType2 {
    public static void main(String[] args) {
    int voting = votingAge();
        System.out.println(voting);
        if(voting >= 18){
            System.out.println("Eligible for vote");
        }else {
            System.out.println("not eligible for vote");
        }
    }
    static int votingAge(){
        System.out.println("Voting");
        return 17;
    }
}
