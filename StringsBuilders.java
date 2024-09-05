import java.util.*;

public class StringsBuilders {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Tony");
        StringBuilder sb1=new StringBuilder("H");
        System.out.println(sb);

        //char at particular index;
        System.out.println(sb.charAt(0));
        //set char at some index
        sb.setCharAt(0,'P');
        System.out.println(sb);
        //inserting char in string;
        sb.insert(0,'S');
        System.out.println(sb);
        sb.insert(2,'n');
        System.out.println(sb);
        //deleting chars in string;
        sb.delete(2, 3);
        System.out.println(sb);
        //appending in Strings;
        System.out.println(sb1);
        sb1.append("e");
        sb1.append("l");
        sb1.append("l");
        sb1.append("o");
        System.out.println(sb1);
    }
}
