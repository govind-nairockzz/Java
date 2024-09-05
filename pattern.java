import javax.swing.plaf.synth.SynthOptionPaneUI;

class Pattern 
{
    public static void main(String args[]){
 int n=5;

 //Pattern-1
 /*    for(int i=1;i<n;i++){
        for(int j=1;j<=i;j++){
            int a=i+j;
            if(a%2==0){
            System.out.print("1 ");
            }else{
            System.out.print("0 ");}
        }System.out.println();
    } */

//Pattern-2
/* 
    //upperhalf
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        //spaces
        int spaces=2*(n-i);
        for(int j=1;j<=spaces;j++)
        {
            System.out.print(" ");
        }
        //2nd part
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }System.out.println();
    }
    //lower half
    for(int i=n;i>=1;i--)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        //spaces
        int spaces=2*(n-i);
        for(int j=1;j<=spaces;j++)
        {
            System.out.print(" ");
        }
        //2nd part
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }System.out.println();
    } */

    //Pattern-3
 /*    for (int i=1;i<=n;i++)
    {
        //spaces
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }

        //starts
        for(int j=1;j<=n;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    } */

    //Patter-4
/*     for(int i=1;i<=n;i++){
        //spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        } 
        //numbers -->print row no,row no times
        for(int j=1;j<=i;j++){
            System.out.print(i+ " ");
        }
        System.out.println();
    } */

    //Patter-5(palindromic pattern)
 /*    for(int i=1;i<=n;i++){
        //spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //1st half
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        //2nd half
        for(int j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    } */

    //Pattern-6(Diamond pattern)
    //upper half
     for(int i=1;i<=n;i++){
        //spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    //lower half
    for(int i=n;i>=1;i--){
        //spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    } 

}}