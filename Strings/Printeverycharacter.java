package SDET_JAVA_CODING.Strings;

public class Printeverycharacter{
    public static void main(String[] args) {
        String s="automation";

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            System.out.println(ch);
        }
    }
}