public class PropperNode {
    private Location knight;
    private PropperNode previous;
    public PropperNode(int x, int y){
        knight = new Location(x,y);
    }
    public void setPrevious(PropperNode loc){
        previous=loc;
    }

    public PropperNode getPrevious() {
        return previous;
    }

    public Location getKnight(){
        return knight;
    }
}
