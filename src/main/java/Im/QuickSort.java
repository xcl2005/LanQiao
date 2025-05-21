package Im;

public class QuickSort {

   public static  void quickSort (String[] arr, int left, int right)
    {
        int pivot_idx; // pivot marker
        if (left<right)
        {
            pivot_idx = partition(arr, left, right);
            quickSort(arr, left, pivot_idx-1); // sort left segment
            quickSort(arr, pivot_idx+1, right);// sort right segment
        }
    }
    public static int partition(String[] arr, int left, int right)
    {
        int pivot_idx = right; String X = arr[pivot_idx];
        int i=left; int j=right-1;
        do {
            while(arr[i].compareTo(X)>0) i++;
            while(arr[j].compareTo(X)>=0 && j>left) j--;
            if (i < j) exch(arr, i, j);
        }while(i < j);
        exch(arr, pivot_idx, i);
        return i;
    }
    public static void exch(String[] arr, int i, int j)
    {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
