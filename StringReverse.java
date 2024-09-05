import java.util.*;

public class StringReverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb= new StringBuilder("Govind");
        System.out.println(sb);
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-i-1;

            char frontChar =sb.charAt(front);
            char backchar=sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontChar);
        }System.out.println(sb);
    }
}
