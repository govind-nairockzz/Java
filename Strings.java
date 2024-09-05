import java.util.*;

public class Strings {
    //Strings are immutable;
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
       

        //Ex-1
        /*  String name1 = "Tony";
        String fullName1= "Tony Stark";
        String sentence1 = "Hello welcome to java";
        */ 



        //Ex-2
        /* String name=sc.next();//next()used to input single word;
        String name1=sc.nextLine();//nextLine() is used to input all String;
        System.out.println("Your name is :"+name1);
 */

        //Ex-3
    /*     String firstName="Tony";
        String lastName="Stark";
        String fullName=firstName+" "+lastName;
        System.out.println("Full Name :"+fullName);
        //length(); function
        System.out.println("Full Name length :"+fullName.length());
        //charAt; function
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        } */


       //Ex-4(comparing Strings)
/* 
        String name1 = "Tony";
        String name2 = "Tony";

        //1 s1>s2 : +ve values;
        //2 s1==s2 :0;
        //3 s1<s2 :-ve value;

        if(name1.compareTo(name2)==0){//(name1==name2)this can be used but sometimes there are cases when it does not work in java strings;

            System.out.println("Strings are equal");
        }
        else{
            System.out.println("String are not equal");
        } */


        //Ex-5(Substrings)
        String sentence ="My name is Tony";
        String name =sentence.substring(11, sentence.length());
        System.out.println(name);

        String name1="TonyStark";
        String firstName= name1.substring(0,4);
        System.out.println(firstName);

        String lastName=name1.substring(4);
        System.out.println(lastName);
    }
}
