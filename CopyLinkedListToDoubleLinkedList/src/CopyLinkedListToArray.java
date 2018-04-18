public class CopyLinkedListToArray extends CreateSingleLinkedList {

    public static void main(String[] args) {

        int arrayLength = createList();
        int[] copiedList = copyListToArray(arrayLength);
        displayArray(copiedList);
    }

    static int[] copyListToArray(int arrayLength){
        int[] array = new int[arrayLength];
        Node currentNode = firstNode;
        for(int i = 0; i < arrayLength; i++){
            array[i] = currentNode.getValue();
            currentNode = currentNode.getNextNode();
        }
        return array;
    }

    static void displayArray(int[] array){
        System.out.println("The array copying the Linked List is: ");
        System.out.print("[");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if(i < array.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
