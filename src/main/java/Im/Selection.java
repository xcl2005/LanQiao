package Im;

public class Selection {
     public static void selectionSort(String[] arr,int N) {
         for (int i = 0; i < N; i++) {
             int minIdex = i;
             for (int j = i + 1; j < N; j++) {
                 if (arr[j].compareTo(arr[minIdex])<0) {
                     minIdex = j;
                 }
             }
             if (minIdex != i) {
                 String temp = arr[i];
                 arr[i] = arr[minIdex];
                 arr[minIdex] = temp;
             }
         }
    }
}
