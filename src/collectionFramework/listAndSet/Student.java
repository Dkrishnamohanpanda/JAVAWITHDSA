package collectionFramework.listAndSet;

public class Student {
  private String name;
  private Integer no;

  Student(String name,int no){
      this.name = name;
      this.no = no;
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }
    public void printDetails(){
        System.out.println("Student name :"+this.name);
        System.out.println("Student no :"+this.no);


    }
}
