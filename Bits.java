import java.util.*;
public class Bits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=5;
        int pos=1;
        //Bit Masking
        int bitMask=1<<pos;
        int notBitMAsk=~(bitMask);

        //GET BIT
        if((bitMask &n)==0){
            System.out.println("Bit is Zero");
        }
        else{
            System.out.println("Bit is One");
        } 

        //SET BIT
        int newNumber=bitMask|n;
        System.out.println("New number after SET :"+newNumber);
        
        //CLEAR BIT
        int nwNumber=(notBitMAsk&n);
        System.out.println(nwNumber);

        //UPDATE BIT
        int oper=sc.nextInt();
        //int oper=1;//update bit to 1 or 0 as per requirement;
        if(oper==1){
            //SET BIT
            int nwwNumber=bitMask|n;
            System.out.println(nwwNumber);
        }
        else{
            //CLEAR BIT 
            int result=notBitMAsk&n;
            System.out.println(result);
        }
    }
    }
