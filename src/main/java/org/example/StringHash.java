package org.example;

import java.util.Scanner;

public class StringHash {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char c1[] = scan.next().toCharArray();
		char c2[] = scan.next().toCharArray();
		long h[] = new long[c2.length+1];
		long b[] = new long[c2.length+1];
		int n = c1.length;
		int m = c2.length;
		long base = 131;
		long res=0;
		for (int i = 0; i < c1.length; i++) {
			res=res*base+c1[i]-'A'+1;
		}
		b[0]=1;
		for (int i = 1; i <= c2.length; i++) {
			h[i]=h[i-1]*base+c2[i-1]-'A'+1;
			b[i]=b[i-1]*base;
		}
		int ans=0;
		for (int i = 0; i+n<=c2.length; i++) {
			long sum=h[i+n]-h[i]*b[n];
			if(sum==res)ans++;
		}
		
		System.out.println(ans);
	}

}
