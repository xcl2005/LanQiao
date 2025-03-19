import java.util.Scanner;

public class LIS {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		int dp[] = new int[n+1];
		dp[0] = 1;
		int max = 0;
		for (int i = 1; i <n; i++) {
			 for(int j = 0; j<i;j++) {
				 if(a[i]>a[j]) dp[i] = Math.max(dp[j]+1, dp[i]);
				 else dp[i] = Math.max(1, dp[i]);
			 }
			max = Math.max(max, dp[i]); 
		}
		System.out.print(max);
	}
	

}
