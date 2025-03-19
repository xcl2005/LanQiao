import java.security.PublicKey;
import java.util.*;
public class pack {
	  static int n ;
	  static int m ;
	  static int[] w;
	  static int[] v;
	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  n = scan.nextInt();
	  m = scan.nextInt();
	  w= new int[n+1];
	  v= new int[n+1];
	 for (int i = 0; i <n; i++) {
		w[i] = scan.nextInt();
		v[i] = scan.nextInt();
	}
	 int a = m;
	 int ans=dfs(0, a);
	 System.out.println(ans);
	 
	
	}
	public static int dfs(int i, int j) {
		
		if(i==n) return 0;
		if(j<=0) return 0;
		int v2=dfs(i+1, j);
		if(j>=w[i]) {
			int v1 = dfs(i+1, j-w[i])+v[i];
			return Math.max(v2, v1);
		}
		else return v2;
		
	}
}
