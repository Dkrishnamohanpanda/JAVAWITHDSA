package Encapsulation.Police;

public class Cop {
   public int gun;
     public String i_card;
    private String name;
    protected  String car;

    public Cop(int gun){
      this.gun = gun;
    }
    public boolean canIShoot(){
        System.out.println("Can i shoot");
        return false;
    }
}
