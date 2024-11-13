package Encapsulation2;

public class Test2 extends Baseclass1{

    Test2(){
        super();
        System.out.println("Dc------>Test2");
    }
    void sharePass(){
        givePassword();
    }

    @Override
    public String setpassword(String password) {
        return super.setpassword(password);
    }
}
