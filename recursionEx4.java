//WAP to place Tiles of size 1*m in a floor of n*m;

public class recursionEx4 {

    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        //vertically
        int verticalplacements=placeTiles(n-m, m);
        //horizontally
        int horizontalplacements=placeTiles(n-1,m);
        return verticalplacements+horizontalplacements;
    }

    public static void main(String args[]){
        int n=4,m=2;
        System.out.println(placeTiles(n, m));
    }
    
}
