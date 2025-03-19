import java.util.Arrays;
import java.util.Scanner;

public class TanxinChafen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n+1];
		int[] diff = new int[n+1];
		for (int i = 1; i <=n; i++) {
			a[i] = scan.nextInt();
		}
		int m = scan.nextInt();
	    for (int i = 1; i <=m ; i++) {
			int l = scan.nextInt();
			int r = scan.nextInt();
			diff[l]+=1;
			if(r+1<=n)diff[r+1]-=1;
		}
	    for (int i = 1; i <= n; i++) {
			diff[i]+=diff[i-1];
		}
	    long num = 0;
	    for (int i = 1; i <= n; i++) {
			num+=(long)a[i]*diff[i];
		}
	    long current = 0;
	    Arrays.sort(a);
	    Arrays.sort(diff);
	    for (int i = 1; i <= n; i++) {
			current+=(long)a[i]*diff[i];
		}
	    System.out.println(current-num);
	}

}
