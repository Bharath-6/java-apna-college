package RecursionAdvance;

public class TilingProblem {
    public static int placeTiles(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //vertically
        int vertPlacements=placeTiles(n-m,m);
        //horizontally
        int horplacements=placeTiles(n-1,m);
        return vertPlacements+horplacements;
    }
    public static void main(String args[]){
        int n= 4,m=2;
        System.out.println(placeTiles(n, m));
    }
    
}
