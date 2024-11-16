package static_Wrapper_Exception;

public class Lab3_Enum_p {
    public static void main(String[] args) {
        System.out.println(Color.blue.getHexcode());
        System.out.println(Color. red.getHexcode());
        System.out.println(Color. green.getHexcode());
        System.out.println(Color.pink.getHexcode());

        if(Color. green.getHexcode() == "#3cb371"){
            System.out.println("Color is grreen ");
        }
    }
}
enum Color{
    red("#ff0000"),
    blue("#0000ff"),
    green("#3cb371"),
    pink("#ee82ee");

    private String hexcode;

    Color(String hexcode){
        this.hexcode = hexcode;

    }

    String getHexcode(){
        return this.hexcode;
    }
}
