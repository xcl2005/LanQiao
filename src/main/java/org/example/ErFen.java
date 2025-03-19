import java.util.Arrays;
import java.util.Scanner;

public class ErFen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=scan.nextInt();
		}
		int[] b = Arrays.copyOf(a, n);
		Arrays.sort(b);
		int smaller = 0;
		int larger = 0;
		int cnt = 0;
		for (int i = 0; i < b.length; i++) {
		      if(b[i]<b[n/2]) smaller++;
		      else if(b[i]>b[n/2])larger++;
		}
		if(larger>smaller) cnt = 1;
		for (int i = 0; i < a.length; i++) {
			/*int l = 0;
			int r = n-1;
			int mid = 0;
			int prr = 0;
			while(l<r) {
				mid=(r+l)/2;
				if (a[i]<b[mid]) {
					r=mid-1;
				}
				if(a[i]>b[mid]) {
					l=mid+1;
				}
				else break;
				
			}*/
			int mid = Arrays.binarySearch(b, a[i]);
			int result = 0;
			if(mid<n/2) result =b[n/2]-a[i]+cnt;
			else if(mid>=n/2)result = 0;
			System.out.print(result+" ");
		}
	}

}