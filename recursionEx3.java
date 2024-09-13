//WAP to count total pathsin a maze to move from(0,0) to (n,m).
//(can move only either down or towards right)

public class recursionEx3 {
    //Using Backtracking
    public static int countPaths(int i,int j,int n,int m){
        if(i==n || j==n){
            return 0;
        }
        if(i==n-1 && j==n-1){
            return 1;
        }

        int downPaths=countPaths(i+1, j,n, m);
        int rightPaths=countPaths(i, j+1,n, m);
        return downPaths+rightPaths;

    }

    public static void main(String args[]){
        int n=3,m=3;
        int totalPaths=countPaths(0, 0, n, m);
        System.out.println(totalPaths);
    }
}
