package Oct25_24_Strings;

public class FunInString {
    public static void main(String[] args) {
//        String name = "D.krishna mohan panda";
//        String name2 = name.substring(10,15);
//        System.out.println(name2);
//        System.out.println(name.substring(6,10));

        //Concatenation
//        String s1 = "Krishna";
//        String s2 = s1.concat(" mohan");
//        System.out.println(s2);

        //split
//        String fruits = "Apple,Orange,Banana";
//        String[] split_Fruits = fruits.split(",");
//        System.out.println(split_Fruits[0]);
//        System.out.println(split_Fruits[1]);
//        System.out.println(split_Fruits[2]);


//
//        String fruits2 = "ABC-XYZ-UVW";
//        String[] split_Fruits2 = fruits2.split("-");
//        System.out.println(split_Fruits2[0]);
//        System.out.println(split_Fruits2[1]);
//        System.out.println(split_Fruits2[2]);

//        String s0 = "Krishna";
//        System.out.println(s0.charAt(0));
//        System.out.println(s0.charAt(1));
//        System.out.println(s0.charAt(10));


//         String s5 = "  Mohan  ";
//        System.out.println(s5);
//        //trim removes the leading and trailing spaces .
//        System.out.println(s5.trim());
//

        //indexOf -> It will find index of character
        String s6 = "Krishna";
        System.out.println(s6.indexOf("r"));

        //contains -> Return true if and onlyif contains the same value
        String s7 = "Mohan";
        System.out.println(s7.contains("OH"));
        System.out.println(s7.contains("oh"));

        //lastIndexOf -> return the index of last occurance

        String s8 = "Krishna mohan";
        System.out.println(s8.lastIndexOf("o"));
        System.out.println(s8.lastIndexOf("n"));

        //replace -> it will replace all occurance
        String s9 = "Pramoddutta";
        System.out.println(s9.replace("d","Z"));
        String s91 = "Krishna Mohan";
        System.out.println(s91.replaceAll("a","Z"));
        String original1 = "Hello123 World5656!";
         String original2 = original1.replaceAll("\\d","");
        System.out.println(original2);



        String s10 = "Krishna Mohan";
        System.out.println(s10.startsWith("Kr"));
        System.out.println(s10.startsWith("kr"));
        System.out.println(s10.endsWith("an"));
        System.out.println(s10.endsWith("Kr"));



    }
}
