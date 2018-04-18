import java.util.Scanner;

public class CreateSingleLinkedList {
    static Node firstNode;
    static private Node lastNode;

    static int createList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of nodes: ");
        int numberOfNodes = sc.nextInt();
        for (int i = 0; i < numberOfNodes; i++) {
            System.out.print("Input value of element " + i + ": ");
            int value = sc.nextInt();
            addSingleLinked(value);
        }
        return numberOfNodes;
    }

    private static void addSingleLinked(int value) {
        Node newNode = new Node(value, null);
        if (firstNode == null) {
            addFirst(newNode);
        } else {
            addLast(newNode);
        }
    }

    private static void addFirst(Node newNode) {
        firstNode = newNode;
        lastNode = newNode;
    }

    private static void addLast(Node newNode) {
        lastNode.setNextNode(newNode);
        lastNode = newNode;
    }

    static int getElement(int index, int numberOfNodes){
        Node currentNode = firstNode;
        int nodeCounter = 0;
        while(index != nodeCounter && nodeCounter < numberOfNodes){
            currentNode = currentNode.getNextNode();
            nodeCounter++;
        }
        return currentNode.getValue();
    }

    static void displayList() {
        Node currentNode = firstNode;
        System.out.println("The Linked List is: ");
        System.out.print("{");
        while (currentNode != null) {
            System.out.print(currentNode.getValue());
            currentNode = currentNode.getNextNode();
            if (currentNode != null) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }


}
