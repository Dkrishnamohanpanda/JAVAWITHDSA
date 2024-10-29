package Oct25_24_Strings;

public class stringBuilder_stringBuffer {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Krishna");
        stringBuilder.append(" Mohan");
        System.out.println(stringBuilder);

//The diferrence is StringBuffer is thread safe but StringBuilder is not thread ssafe
        //StringBuffer is slow and  StringBuilder is faster

        StringBuffer stringBuffer = new StringBuffer("D.");
        stringBuffer.append("Krishna");
        System.out.println(stringBuffer);

    }
}
