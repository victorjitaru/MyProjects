import java.util.Stack;

public class CopyLinkedListToStack extends CreateSingleLinkedList {

    public static void main(String[] args) {
        Stack myStack = new Stack();
        int numberOfElements = createList();
        if(myStack.empty()){
            System.out.println("Inserting elements in empty stack!");
        } else{
            System.out.println("Inserting elements in already occupied stack");
        }

        for(int i = 0; i < numberOfElements; i++){
            myStack.add(getElement(i, numberOfElements));
        }
        System.out.println("The last element inserted into the stack is " + myStack.peek());
        System.out.println();
        System.out.println("Testing the search option for stack");
        System.out.print("Trying to display element in position 1: " + myStack.search(1));
        System.out.println();
        System.out.print("The LinkedList elements copied to the Stack are: ");
        for(int i = 0; i < numberOfElements; i ++){
            System.out.print(myStack.pop() + "\t");
        }
        System.out.println();
        System.out.println("Testing the search option for stack");
        System.out.print("Trying to display element in position 1: " + myStack.search(1));
    }
}
