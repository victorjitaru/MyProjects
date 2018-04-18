import java.util.ArrayDeque;
import java.util.Queue;

public class CopyLinkedListToQueue extends CreateSingleLinkedList{

    public static void main(String[] args) {
        Queue<Integer> myQueue = new ArrayDeque<>();
        int numberOfElements = createList();

        for(int i = 0; i < numberOfElements; i++){
            myQueue.add(getElement(i, numberOfElements));
        }

        System.out.println("The total number of elements in queue is: " + myQueue.size());
        System.out.println("The peeked element is " + myQueue.peek());
        System.out.println("The peeked element is " + ((ArrayDeque<Integer>) myQueue).peekFirst());
        System.out.println("The peeked element is " + ((ArrayDeque<Integer>) myQueue).peekLast());
        System.out.print("The elements inserted into the queue are: ");
        for(int i = 0; i < numberOfElements; i++){
            System.out.print(myQueue.remove()+ ", ");
        }

    }

}
