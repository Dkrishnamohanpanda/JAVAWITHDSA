package Encapsulation;

public class Enscp {
    public static void main(String[] args) {
        Person p = new Person("Krishna","9348396011");
        p.getName();
        p.setName("Mohan");

    }

}
class Person{
  private String name;
    private String ph_no;

    Person(String name,String ph_no){
        this.name = name;
        this.ph_no= ph_no;
    }
    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPh_no(){
        return ph_no;
    }
    public void setPh_no(String ph_no){
        this.ph_no = ph_no;
    }

}
