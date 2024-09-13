
public class recursionEx2 {

    //Check if an array is sorted..
    public static boolean isSorted(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]>=arr[idx+1]){
            return false;
        }else{
            return isSorted(arr, idx+1);
        }
    }
    //Move all 'x' to the end of String;
    public static void moveAllX(String str,int idx,int count,String newString){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newString +='x';
            }
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar=='x'){
            count++;
            moveAllX(str, idx+1, count, newString);
        }
        else{
            newString+=currChar;
            moveAllX(str, idx+1, count, newString);
        }
    }

    //Remove duplicates in a String
    public static boolean[] map=new boolean[26];

    public static void removeDuplicates(String str,int idx, String newSring){
        if(idx==str.length()){
            System.out.println(newSring);
            return;
        }
        
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDuplicates(str, idx+1, newSring);
        }
        else{
            newSring +=currChar;
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newSring);

        }
    }

    public static void main(String args[]){
        int arr[]={1,3,5};
        System.out.println(isSorted(arr, 0));
        String str="axbcxxd";
        moveAllX(str, 0, 0,"");
        String str1="abbccda";
        removeDuplicates(str1, 0,"");
    }
    
}
