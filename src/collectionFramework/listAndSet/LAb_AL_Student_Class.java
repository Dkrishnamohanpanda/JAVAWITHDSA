package collectionFramework.listAndSet;

import java.util.ArrayList;
import java.util.List;

public class LAb_AL_Student_Class {
    public static void main(String[] args) {
        Student s = new Student(" Krishna", 89);
        Student s1 = new Student(" Krishna", 89);
        Student s2= new Student(" Krishna", 89);
        Student s3 = new Student(" Krishna", 89);

        List<Student> myStudent = new ArrayList<>();
        myStudent.add(s);
        myStudent.add(s1);
        myStudent.add(s2);
        myStudent.add(s3);
        System.out.println(myStudent);

        s.printDetails();
        s1.printDetails();
        s2.printDetails();
        s3.printDetails();
        System.out.println(myStudent);


    }
}
