public class GameBoard {
    public boolean[][] board;
    public PropperList stack= new PropperList();
    public GameBoard(int size){
        board = new boolean[size][size];
    }
}
