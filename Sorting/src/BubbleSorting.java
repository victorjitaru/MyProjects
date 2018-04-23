public class BubbleSorting {
    public void sort(int[] array){
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for(int i = 0; i < array.length-1; i++){
                if(array[i] > array[i+1]){
                    swap(array, i);
                    isSorted = false;
                }
            }
        }
    }

    private void swap(int[] array, int i){
        int temp = array[i];
        array[i] = array[i+1];
        array[i+1] = temp;
    }
}
