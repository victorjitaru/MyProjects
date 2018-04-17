public class Node {
    private  String value;
    private  Node nextNode;

    public  void setValue(String value){
        this.value = value;
    }
    public  String getValue(){
        return value;
    }

    public  void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }
    public  Node getNextNode(){
        return nextNode;
    }
}
