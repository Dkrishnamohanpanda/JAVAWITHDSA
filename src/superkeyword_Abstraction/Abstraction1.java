package superkeyword_Abstraction;

public class Abstraction1 {
}
class Krishna extends Father{
    @Override
    int  loan50k(){
        System.out.println("50k repay");
        return 0;
    }
}
 abstract class Father{
    abstract int loan50k();
}
