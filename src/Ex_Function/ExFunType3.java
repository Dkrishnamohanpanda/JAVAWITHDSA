package Ex_Function;
//with argument without return type
public class ExFunType3 {
    public static void main(String[] args) {

        greetWithName("Rishu");
        greetWithName("Bishnupriya");
        greetWithName("Krishna");

    }
    static void greetWithName(String name){
        System.out.println("Good morning "+name);
    }
}
