package TaskATB9xOops;

public class ObjectIntializeByMethod {
    String color;
    int age;
    void initObj(String s,int a){
        color = s;
        age = a;

    }
    void display(){
        System.out.println(color + " " + age);
    }

    public static void main(String[] args) {
       ObjectIntializeByMethod tommy = new ObjectIntializeByMethod();
        tommy.initObj("Red" ,15);
        tommy.display();
    }
}
