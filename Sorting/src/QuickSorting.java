public class QuickSorting {

    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, int start, int end) {
        if (start < end) {
            //variabila care primeste pozitia ultimului elementul pivot (nu se va modifica)
            //int pivotPosition = quick(array, start, end);
            //sortarea elementelor aflate inainte si dupa ultimul pivot
            //sort(array, start, pivotPosition - 1);
            //sort(array, pivotPosition + 1, end);
        }
    }

    private void quick(int[] array, int start, int end) {
//definesc pivotul ca fiind elementul din mijloc
        int pivot = array[(end+start)/2];
//definesc un index pt elementele mai mici decat pivot
        int smallerElementIndex = start;
//definesc un index pt elementele mai mari decat pivot
        int higherElementIndex = end;
//parcurg array-ul si compar fiecare element cu pivotul

        while(smallerElementIndex < higherElementIndex){
            while(array[smallerElementIndex] < pivot){
                smallerElementIndex ++;
            }
            while(array[higherElementIndex] > pivot){
                higherElementIndex --;
            }
            if(smallerElementIndex <= higherElementIndex){
                swap(array, smallerElementIndex, higherElementIndex);
                smallerElementIndex ++;
                higherElementIndex --;
            }
        }

        if(start < higherElementIndex){
            quick(array, start, higherElementIndex);
        }
        if(smallerElementIndex < end){
            quick(array, smallerElementIndex, end);
        }
    }

    private void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
