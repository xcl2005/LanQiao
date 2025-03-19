package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n  = scan.nextInt();
		int k  = scan.nextInt();
		int[] a = new int[n+1];
		int[] b = new int[n+1];
		for (int i = 1; i <= n; i++) {
		    a[i] = scan.nextInt();
		    b[i] = a[i]-a[i-1];
		}
		b[1]=0;//*有不用的元素排序前要么排除，要么不要存入  
		Arrays.sort(b);
		int sum =0;
        for (int i = 2; i <= n-k+1; i++) {
		      sum+=b[i];
		}
		System.out.println(sum);
	}

}
