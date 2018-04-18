public class Node {
    private int value;
    private Node previousNode;
    private Node nextNode;

    public void setValue(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public void setPreviousNode(Node previousNode){
        this.previousNode = previousNode;
    }
    public Node getPreviousNode(){
        return previousNode;
    }
    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }
    public Node getNextNode(){
        return nextNode;
    }

    public Node(int value, Node nextNode){
        this.value = value;
        this.nextNode = nextNode;
    }

    public Node(int value, Node nextNode, Node previousNode){
        this.value = value;
        this.nextNode = nextNode;
        this.previousNode = previousNode;
    }
}
