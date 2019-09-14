public class BubbleSort implements SortingAlgorithm {

    public void sort(int [] a){
        boolean swapped = true;
        while(swapped){
            swapped = false;
            for(int i=0; i < a.length - 1; i++){
                if(a[i] > a[i+1]){
                    swap(a, i, i+1);
                    swapped = true;
                }
            }
        }
    }

    private void swap(int[] a, int index1, int index2){
        int tempValue = a[index1];
        a[index1] = a[index2];
        a[index2] = tempValue;
    }
}
