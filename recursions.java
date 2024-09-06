import java.util.*;

public class recursions {

    //printing numbers in reverse order;
    public static void printNumbers(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printNumbers(n-1);
    }

    //sum of n numbers;
    public static void naturalNumbersum(int i,int n,int sum){
        if(i==n){
            sum +=i;
            System.out.println("\nSum of natural number "+n+" = " +sum);
            return;
        }
        sum+=i;
        naturalNumbersum(i+1,n,sum);

    }

    //Factorial of n;
    public static int factorial(int n){ 
        if(n==0 || n==1){
            return 1;
        }
        int fact_nm1=factorial(n-1);
        int fact_n=n*fact_nm1;
        return fact_n;
    }

    //Fibonaci Series;
    public static void fibonacci(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        fibonacci(b, c, n-1);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range :");
        int n=sc.nextInt();
        printNumbers(n);
        naturalNumbersum(1,n,0);
        System.out.println("Factorial is :"+factorial(n));
        int a=0,b=1;
        System.out.println("Fibonaci Series of "+n+" numbers :");
        System.out.println(a);
        System.out.println(b);
        fibonacci(a, b, n-2);
    }
}
