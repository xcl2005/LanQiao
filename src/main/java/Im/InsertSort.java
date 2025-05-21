package Im;

public class InsertSort {
    public static void insertSort(int arr[],int N) {
        for (int i = 1; i < N; i++){
            int x = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > x; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = x;
        }
    }
}
