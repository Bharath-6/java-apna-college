public class Tic_tac_toe_Winner {
    public String tictactoe(int[][] moves) {
        if(moves==null || moves.length>9){
            throw new IllegalArgumentException("Input move list is invalid");
        }
        int n=3;
        int[] rows = new int[n];
        int[] cols = new int[n];
        int diag1=0;
        int diag2=0;

        int numMoves = moves.length;

        for(int i=0;i<numMoves;i++){
            int r = moves[i][0];
            int c = moves[i][1];
            int val = i%2 ==0 ? 1: -1;
            rows[r]+=val;
            cols[c]+=val;
            if(r==c){
                diag1+=val;
            }
            if(r + c == n-1){
                diag2+=val;
            }
            if(Math.abs(rows[r])==n || Math.abs(cols[c])==n || Math.abs(diag1)==n || Math.abs(diag2)==n){
                if(i!=numMoves-1){
                    throw new IllegalArgumentException("Input move list is invalud");
                }
                return val==1? "A":"B";
            }
        }
        return numMoves == 9 ? "Draw" : "Pending";
}
