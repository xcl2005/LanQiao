package Im;

public class QuickSort {

   public static  void quickSort (int A[], int left, int right)
    {
        int pivot_idx; // pivot marker
        if (left<right)
        {
            pivot_idx = partition(A, left, right);
            quickSort(A, left, pivot_idx-1); // sort left segment
            quickSort(A, pivot_idx+1, right);// sort right segment
        }
    }
    public static int partition(int A[], int left, int right)
    {
        int pivot_idx = right; int X = A[pivot_idx];
        int i=left; int j=right-1;
        do {
            while(A[i] < X) i++;
            while(A[j] >= X && j>left) j--;
            if (i < j) exch(A, i, j);
        }while(i < j);
        exch(A, pivot_idx, i);
        return i;
    }
    public static void exch(int A[], int i, int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
