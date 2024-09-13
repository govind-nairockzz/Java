import java.util.HashSet;
public class subsequences {

    //print all subsequences of a string;;time complexity=O(2^n)
    public static void subsequence(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        //to be 
        subsequence(str, idx+1, newString+currChar);
        //not to be;
        subsequence(str, idx+1, newString);
    }
    //print all unique subsequences;
    public static void uniquesubsequence(String str,int idx,String newString,HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar=str.charAt(idx);
        //to be 
        uniquesubsequence(str, idx+1, newString+currChar,set);
        //not to be;
        uniquesubsequence(str, idx+1, newString,set);
    }
    public static void main(String args[]){
        String str="aaa";
        subsequence(str, 0,"");

        HashSet<String> set=new HashSet<>();
        uniquesubsequence(str, 0,"", set);
    }
}
