package sorting;

public class QuickSort implements Sort {
    @Override
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }
    
    void quickSort(int[] arr, int lb, int ub) {
        if(lb >= ub)
            return;
        
        int mid = partition(arr, lb, ub);
        quickSort(arr, lb, mid-1);
        quickSort(arr, mid+1, ub);
    }
    
    /**
     * Hoare's Partition Scheme
     */
    private int partition(int[] arr, int lb, int ub) {
        int pivot = arr[lb];
        int low = lb;
        int high = ub;
        int temp;
        
        while(low < high) {
            while(low < arr.length && arr[low] <= pivot)
                low++;
            while(arr[high] > pivot)
                high--;
            
            if(low >= high)
                break;
            // Swap
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
        }
        temp = arr[high];
        arr[high] = pivot;
        arr[lb] = temp;
        
        return high;
    }
}
