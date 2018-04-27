public class MergeSorting {


    public void sort(int[] array) {
        mergeSortArray(array, 0, array.length - 1);
    }

//fara calcularea mijlocului (lua valori ciudate)
    private void mergeSortArray(int[] array, int start, int end) {
        if (end - start > 1) {
//sortare prima jumatate a sirului
            mergeSortArray(array, start, ((start + end) / 2));
//sortare a doua jumatate a sirului
            mergeSortArray(array, (((start + end) / 2) + 1), end);
//MERGING!!!!!!
            merge(array, start, end);
        } else if(end - start == 1){
            if (array[start] > array[end]) {
                swap(array, start, end);
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private void merge(int[] array, int start, int end) {
        int i = start;
        int j = ((start + end) / 2) + 1;
        int bufferLength = (end-start) + 1;
        int[] buffer = new int[bufferLength];
        int position = 0;
        while (i <= ((start + end) / 2) && j <= end) {
            if (array[i] < array[j]) {
                buffer[position] = array[i];
                i++;
            } else {
                buffer[position] = array[j];
                j++;
            }
            position++;
        }
        while (j <= end && i > (start + end)/2) {
            buffer[position] = array[j];
            j++;
            position++;
        }
        while (i <= (start + end) / 2 && j > end) {
            buffer[position] = array[i];
            i++;
            position++;
        }
        copyArray(buffer, array, start, bufferLength);
    }

    private void copyArray(int[] source, int[] dest, int start, int arrayLength){
        for (int i = 0; i < arrayLength; i++){
            dest[start + i] = source[i];
        }
    }
}
