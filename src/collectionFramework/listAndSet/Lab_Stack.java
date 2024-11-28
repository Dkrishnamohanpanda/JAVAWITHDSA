package collectionFramework.listAndSet;

import java.util.Stack;

public class Lab_Stack {
    public static void main(String[] args) {
        Stack s = new Stack();
//        s.add("D");
//        s.add("Krishna");
//        s.add("Mohan");
//        s.add("Panda");

        s.push("D");
        s.push("Krishna");
        s.push("Mohan");
        s.push("Panda");
//        stack is in Lifo:Last in Fast Out Concept
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.size());
        s.push("Bishnupriya");
        System.out.println(s);
        s.add("pradhan");
        System.out.println(s);
        s.add(0,"Rishu");
        System.out.println(s);
        System.out.println(s.get(0));
        System.out.println(s.get(1));
//        Stack is indexd based
//        Stack extends Vector extends ArrayList extends Array



    }
}
