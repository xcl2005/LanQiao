import java.util.Scanner;

public class DFS {
	public static long factorial(long n) {
		if (n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		System.out.println(factorial(n));
	}
	

}
