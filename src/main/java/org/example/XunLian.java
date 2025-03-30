package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class XunLian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = sc.nextLong();
        long[][] arr = new long[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr,( long[] a,long[] b)->Long.compare(a[1],b[1]));
        int sum = 0; int prr=0;
        for (int i = 0; i < n; i++) {
            if ( sum < (long)arr[i][1]*s) sum += arr[i][0]*arr[i][1];
            else { if(i==n-1 || arr[i+1][1]>arr[i][1])prr = i;
                   else prr =i-1;
                   break;
            }
        }
        long money =arr[prr][1]*s;
        for (int i = prr+1; i < n; i++) {
             money += (arr[i][1]-arr[prr][1])*arr[i][0];
        }
        System.out.println(money);

    }
}
