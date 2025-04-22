package org.example;

import java.util.*;

public class BFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <=n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.get(x).add(y);
        }
        long mod = (long) 1e9 + 7;
        long[] dp = new long[n+1];
        long[] dis = new long[n+1];
        Arrays.fill(dis, Long.MAX_VALUE);
        dis[1] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        while (q.size() > 0) {
            int u = q.poll();
            for (int x : list.get(u)) {

            }
        }

    }
}
