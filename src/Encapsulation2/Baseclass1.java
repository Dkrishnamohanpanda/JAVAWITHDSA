package Encapsulation2;

public class Baseclass1 {
    private String password;
    Baseclass1(){
        System.out.println("Dc ----> Baseclass1");
    }
    Baseclass1(String password){
        System.out.println("Pc ----> Baseclass1");
    }

    public String getPassword(){
        return password;
    }
    public String setpassword(String password){
        this.password = password ;
        return password;
    }

    void givePassword(){
        System.out.println("share the password");
    }
    void givePassword(String password){
        System.out.println("share the password");
    }
}
