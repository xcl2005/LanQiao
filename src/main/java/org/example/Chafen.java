import java.util.*;


public class Chafen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int q = scan.nextInt();
	    long[] a = new long[n+10];
	    long[] diff = new long[n+10];
	    for (int i = 1; i <= n; i++) {
			a[i] = scan.nextInt();
			diff[i] = a[i]-a[i-1];
		}
	    for (int i = 1; i <= q; i++) {
			int l = scan.nextInt();
			int r = scan.nextInt();
			int x = scan.nextInt();
			diff[l]+=x;
			diff[r+1]-=x;
		}
	    for (int i = 1; i <= n; i++) {
			diff[i] += diff[i-1];
			System.out.print(Math.max(0, diff[i])+" ");
		
		}
	    
	}

}
