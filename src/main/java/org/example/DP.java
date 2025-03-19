import java.util.*;
import java.util.Scanner;

public class DP {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int w[] = new int[n+1];
		int v[] = new int[n+1];
		for (int i = 1; i <= n; i++) {
			w[i] = scan.nextInt();
			v[i] = scan.nextInt();
		}
		int[][] dp = new int [n+1][m+1];//int[i][j]中，i代表对i件物体做决策，有两种方式—放入背包和不放入背包。j表示当前背包剩余的容量。
	
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if(j>=w[i]) {
					dp[i][j] = Math.max(dp[i-1][j-w[i]]+v[i], dp[i-1][j]);
				}
				else dp[i][j] = dp[i-1][j];
			}
			
		}
		
		System.out.println(dp[n][m]);
		
		
		
		
	}		
}
