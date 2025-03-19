import java.util.Scanner;
public class WaKuang {
	 
	// 1:无需package
	// 2: 类名必须Main, 不可修改

  public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   int n = scan.nextInt();
	   int m = scan.nextInt();
	   int[] arr1 = new int[m+1];
	   int[] arr2 = new int[m+1];
	   int[] sum1 = new int[m+1];
	   int[] sum2 = new int[m+1];
	   int zero = 0;
	for (int i = 0; i < n; i++) {
	     int input = scan.nextInt();
	     if (input>0 && input<=m) {
	       arr1[input]++;
	     }
	     else if(input<0 && -input<=m ) {
	     arr2[-input]++;
	  }
	     else if(input == 0)zero++;
	}
	for (int i = 1; i <= m; i++) {
	   sum1[i] = sum1[i-1]+arr1[i];
	   sum2[i] = sum2[i-1]+arr2[i];
	}
	   int Max = Math.max(sum1[m]+zero, sum2[m]+zero);
	    for (int i = 1; m-2*i>=0; i++) {
	    Max = Math.max(Max, sum1[i]+sum2[m-2*i]+zero);
	    Max = Math.max(sum2[i]+sum1[m-2*i]+zero, Max);
	  }

		System.out.println(Max);
	 }
  }


