package Im;

public class Selection {
     public static void selectionSort(int arr[],int N) {
         for (int i = 0; i < N; i++) {
             int minIdex = i;
             for (int j = i + 1; j < N; j++) {
                 if (arr[j] < arr[minIdex]) {
                     minIdex = j;
                 }
             }
             if (minIdex != i) {
                 int temp = arr[i];
                 arr[i] = arr[minIdex];
                 arr[minIdex] = temp;
             }
         }
    }
}
