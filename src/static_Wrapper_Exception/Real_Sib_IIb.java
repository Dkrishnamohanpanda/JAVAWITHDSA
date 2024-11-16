package static_Wrapper_Exception;

public class Real_Sib_IIb {
    public static void main(String[] args) {
        Atb9x s1 = new Atb9x("Amit");
        Atb9x s2 = new Atb9x("Krishna");
        Atb9x s3 = new Atb9x("nepu");
        Atb9x s4 = new Atb9x("tabu");

        s1.readDocument();
        s2.readDocument();


//        static
        Atb9x.course_name = "Automation testing";
        Atb9x.do_assignment();
    }
}
class Atb9x{
    Atb9x(String name){
        this.name = name;
    }
//    IIB block
    {
        System.out.println("IIB");
        System.out.println("Reading from csv file");
    }
//    static block
    static {
        System.out.println("SIB");
    }
    private String name ;
    private String mobile_no;
    static String course_name = "Atb9x";

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;

    }
    public String getMobile_no(){
        return mobile_no;
    }
    public void setMobile_no(){
        this.mobile_no = mobile_no;
    }
    void readDocument(){
        System.out.println("Non static method");
        System.out.println(course_name);
//  non static function can access a static variable
    }
    static void do_assignment(){
//        System.out.println(name);
//        System.out.println(mobile_no);
// a static block can not able to access a non static variable
// static variable loaded during the class loading time
// non static variabler can only call after object creation
    }
}
