import java.util.ArrayList;
class GameBoardNode{
    private boolean working=true;
    private int[][] board;
    private int x;
    private int y;
    private int counter=0;
    private GameBoardNode previous = null;
    private ArrayList<GameBoardNode> next = new ArrayList<>();
    public GameBoardNode(int[][] board, int x, int y){
        this.board=board;
        this.x=x;
        this.y=y;
    }
    public int[][]getBoard(){
        return board;
    }
    public ArrayList<GameBoardNode> getNext(){
        return next;
    }
    public void addNext(GameBoardNode board){
        next.add(board);
    }
    public GameBoardNode getPrevious(){
        return previous;
    }
    public void setPrevious(GameBoardNode previous){
        this.previous=previous;
    }
    public boolean getWorking(){
        return working;
    }
    /*private void setFalse(){
        working=false;
        previous.checkState();
    }
  public ArrayList<Location> getNeighbors(){
    return 
  }
  public boolean checkState(){
    if(board==null){
      setFalse();
      return false;
    }
    if(neighbors arent valid){
      setFalse();
      return false;
    } else{
        for(int i =0; i<board.length;i++){
          for(int j=0; j<board[0].length;i++){
        
        }
      }
    }
  }
  */
}