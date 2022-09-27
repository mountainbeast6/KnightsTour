public class PropperList {
    public PropperNode top=null;
    public PropperNode removeTop(){
        if(top==null){
            return null;
        }
        PropperNode temp =top;
        top = top.getPrevious();
        return temp;
    }
    public PropperNode getTop(){
        return top;
    }
    public void addTop(Location yes){
        top=new PropperNode(yes.getX(), yes.getY());
    }
}
