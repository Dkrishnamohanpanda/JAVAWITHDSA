package operator;

public class Ternary2 {
    public static void main(String[] args) {
        int score = 90;
        String grade = (score >=90) ? "A" :(score >=80) ? "B" : (score >=70) ? "C" :"F";
        System.out.println(grade);
    }
}
