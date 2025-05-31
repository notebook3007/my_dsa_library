package sorting;

public class SelectionSort implements Sort {

    @Override
    public void sort(int[] arr) {
        for(int sorted = arr.length - 1; sorted > 0; sorted--) {
            int max = arr[sorted];
            int pos = sorted;
            
            for(int i=0; i<sorted; i++) {
                if(arr[i] >= max) {
                    pos = i;
                    max = arr[i];
                }
            }
            // Swap
            int temp = arr[pos];
            arr[pos] = arr[sorted];
            arr[sorted] = temp;
        }
    }
}