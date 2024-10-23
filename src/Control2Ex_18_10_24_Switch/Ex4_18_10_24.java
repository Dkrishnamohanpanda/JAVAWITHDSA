package Control2Ex_18_10_24_Switch;

public class Ex4_18_10_24 {
    public static void main(String[] args) {

        int itemcode = 003;
        switch (itemcode){
            case 001,002,005:
                System.out.println("All of them are electronice gadget");
                break;
            case 006,007,004:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
        }
    }
}
