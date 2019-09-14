public class SelectionSort implements SortingAlgorithm {

    public void sort(int [] a){
        for(int i = 0; i < a.length; i++){
            swap(a, i, findMin(a, i));
        }
    }

    private void swap(int[] a, int index1, int index2){
        int tempValue = a[index1];
        a[index1] = a[index2];
        a[index2] = tempValue;
    }

    private int findMin(int[] a, int startIndex){
        int indexOfMin = startIndex;
        for(int i = startIndex + 1; i < a.length; i++){
            if(a[i] < a[indexOfMin]){
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }

}
