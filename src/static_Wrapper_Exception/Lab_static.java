package static_Wrapper_Exception;

public class Lab_static {
    public static void main(String[] args) {

//        s1.age = 45;
//        System.out.println(Student.name);//Static object can acxcess by class name
//    }
        Student s1 = new Student(23);
        Student s2 = new Student(33);

        System.out.println(Student.name);
        Student.name = "Krishna";
        System.out.println(Student.name);
        System.out.println(s1.name);
        System.out.println(s2.name);


    }
}

class Student {
    int age;
    static String name = "Abc";

    Student(int age){
        this.age = age;
    }



    {
        System.out.println("IIB");
        System.out.println("IIB is executed when object is created ");
    }

    static{
        System.out.println("Static block");
        System.out.println("Static block is loaded once , when class is loaded");
    }


}
