package Oct25_24_Strings;

import java.util.Locale;

public class ImutableNature {
    public static void main(String[] args) {
        String name = "krishna mohan";
        name.toUpperCase(Locale.ROOT);
        System.out.println(name);//It will print krishna mohan
        //String is immutablke in nature,

        //HOW TO SOLVE THIS PROBLEM??
        name = name.toUpperCase(Locale.ROOT);
        System.out.println(name);
    }
}
