package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//19703
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
        long sum = 0; int prr=0;
        for (int i = n-1; i>=0; i--) {
                sum += arr[i][0];
            if ( sum>=s) {
                   prr =i;
                   break;
            }
        }//按照训练次数从小到大排序，找到整体训练一次比s更便宜的临界点 prr只是数组下标，本质上是确定训练次数
        //就像金字塔一样，团体训练次数越大，最后还有剩余训练次数的士兵越少，所有人单独训练一次的整体花费越少
        //比较点就是所有还有剩余次数的士兵单独训练一次的累加金额与s的比较
        //此时确定的团体训练次数是arr[prr][1] 所有训练次数大于arr[prr][1]的士兵要单独训练
        long money =arr[prr][1]*s;
        for (int i = prr+1; i <n ; i++) {
             money += (long)(arr[i][1]-arr[prr][1])*arr[i][0];
             /* 差值*数量 prr是需求相同训练次数的中间位置，按道理需要prr+1开始累加
              那些共同训练后还有次数剩余的士兵   但是arr[i][1]-arr[prr][1]使所有为prr的士兵
             */
        }
        System.out.println(money);

    }
}
