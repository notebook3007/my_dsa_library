package sorting;

public class MergeSort implements Sort {
    @Override
    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length-1);
    }
    
    private void mergeSort(int[] arr, int start, int end) {
        if(start >= end)
            return;
        
        int middle = start + (end-start)/2;
        mergeSort(arr, start, middle);
        mergeSort(arr, middle+1, end);
        
        merge(arr, start, middle, middle+1, end);
    }
    
    
    private void merge(int[]arr, int l1, int u1, int l2, int u2) {
        int[] temp = new int[u2-l1+1];
        int i1 = l1, i2 = l2;
    
        // While both arrays have elements
        int ptr = 0;
        while(i1 <= u1 && i2 <= u2) {
            if(arr[i1] <= arr[i2]) {
                temp[ptr++] = arr[i1];
                i1++;
            } else {
                temp[ptr++] = arr[i2];
                i2++;
            }
        }
        
        // If array1 still has elements
        while(i1 <= u1) {
            temp[ptr++] = arr[i1];
            i1++;
        }
    
        // If array2 still has elements
        while(i2 <= u2) {
            temp[ptr++] = arr[i2];
            i2++;
        }
        
        // Insert sorted and merged elements back into arr
        System.arraycopy(temp,0,arr,l1,u2-l1+1);
    }
}
