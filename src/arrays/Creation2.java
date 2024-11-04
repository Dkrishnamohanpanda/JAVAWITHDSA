package arrays;

public interface Creation2 {
    public static void main(String[] args) {
        String [] name = new String[5];
        name [0] = "Krishna";
        name [1] = "Mohan";
        name [2] = "Sashank";
        name [3] = "Banamali";
        name [4] = "nilamani";

        System.out.println(name[4]);
        System.out.println(name[1]);
        System.out.println(name[3]);
//        System.out.println(name[-1]);   ArrayIndexOutOfBoundException
//        System.out.println(name[10]);   ArrayIndexOutOfBoundException


        System.out.println(name.length);

        Boolean[] male_data = new Boolean[2];
        male_data[0] = true;
        male_data[1] = false;
    }
}
