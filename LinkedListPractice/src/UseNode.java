import java.util.Scanner;

public class UseNode {
    private static Node firstNode;
    private static Node lastNode;

    private static int readNodeList() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of nodes: ");
        int nodesNumber = sc.nextInt();
        for (int i = 0; i < nodesNumber; i++) {
            readElement(sc, i);
        }
        return nodesNumber;
    }

    private static void readElement(Scanner scanner, int index) {
        System.out.print("Input list element " + index + ": ");
        add(scanner.next());
    }

    private static void add(String value) {
        Node newNode = new Node();
        newNode.setValue(value);
        if (firstNode == null) {
            firstNode = newNode;
            lastNode = newNode;
            firstNode.setNextNode(null);
        } else {
            lastNode.setNextNode(newNode);
            lastNode = newNode;
        }
    }

    private static void display() {
        Node currentNode = firstNode;
        System.out.print("{");
        while (currentNode != null) {
            System.out.print(currentNode.getValue());
            if (currentNode.getNextNode() != null) {
                System.out.print(", ");
            }
            currentNode = currentNode.getNextNode();
        }
        System.out.println("}");
    }

//itereaza pana la nodul anterior celui necesar

    private static Node iterateToPositionMinus1(int position) {
        int index = 0;
        Node currentNode = firstNode;
        Node previousNode = null;
        if(position != index) {
            while (index < position) {
                previousNode = currentNode;
                currentNode = currentNode.getNextNode();
                index++;
            }
        }
        return previousNode;
    }

//insereaza un nod la pozitia specificata
    private static void insertNodeToPosition(int position, String value){
        Node previousNode = iterateToPositionMinus1(position);
        Node newNode = new Node();
        newNode.setValue(value);
        if(previousNode == null){
            insertToFirstPosition(newNode);
        } else if(previousNode.getNextNode().getNextNode() == null){
            insertToLastPosition(newNode);
        } else{
            insertToInlinePosition(newNode, previousNode);
        }
    }

    private static void insertToFirstPosition(Node newNode){
        Node tempNode = firstNode;
        firstNode = newNode;
        newNode.setNextNode(tempNode);
    }

    private static void insertToInlinePosition(Node newNode, Node previousNode){
        Node tempNode = previousNode.getNextNode();
        previousNode.setNextNode(newNode);
        newNode.setNextNode(tempNode);
    }

    private static void insertToLastPosition(Node newNode){
        lastNode.setNextNode(newNode);
        lastNode = newNode;
    }

//sterge noduri de la o anumita pozitie
    private static void deleteNode(Node previousNode) {
        Node currentNode = firstNode;
        if (previousNode == null) {
            deleteFirstNode();
        } else if (currentNode.getNextNode() == null) {
            deleteLastNode(previousNode);
        } else {
            deleteInlineNode(previousNode);
        }
    }

    private static void deleteFirstNode() {
        firstNode = firstNode.getNextNode();
    }

    private static void deleteInlineNode(Node previousNode) {
        previousNode.setNextNode(previousNode.getNextNode().getNextNode());
    }

    private static void deleteLastNode(Node previousNode) {
        previousNode.setNextNode(null);
        lastNode = previousNode;
    }

    private static int removeNodeValue(String value, boolean stopOnFirst) {
        Node currentNode = firstNode;
        Node previousNode = null;
        int numberOfDeletedNodes = 0;
        while (currentNode != null) {
            if (currentNode.getValue().equals(value)) {
                deleteNode(previousNode);
                if(stopOnFirst){
                    break;
                }
                numberOfDeletedNodes++;
            } else {
                previousNode = currentNode;
            }
            currentNode = currentNode.getNextNode();
        }
        return numberOfDeletedNodes;
    }

    public static void main(String[] args) {
        readNodeList();
        display();
        System.out.println();
        int counter = removeNodeValue("abc", false);
        System.out.println("You deleted " + counter + " nodes");
        display();
        System.out.println();
        insertNodeToPosition(2, "poloBear");
        display();
    }
}
