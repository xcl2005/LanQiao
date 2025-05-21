package Im;

public class InsertSort {
    public static void insertSort(String[] arr,int N) {
        for (int i = 1; i < N; i++){
            String x = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j].compareTo(x)>0; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = x;
        }
    }
}
