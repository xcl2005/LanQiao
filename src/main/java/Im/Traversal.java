package Im;

import java.util.*;

public class Traversal {
    public static void dfs(int start, List<Integer>[] graph) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[graph.length];
        stack.push(start);
        visited[start] = true; // 起始节点入栈时立即标记

        while (!stack.isEmpty()) {
            int node = stack.pop();
            System.out.println(node); // 处理节点(可放在23行stack.push(neighbor);后)
            List<Integer> neighbors = graph[node];
            if (neighbors != null) {
                // 逆序邻居以保证处理顺序与递归DFS一致
                Collections.reverse(neighbors);
                for (int neighbor : neighbors) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true; // 标记邻居为已访问
                        stack.push(neighbor);
                    }
                }
            }
        }
    }

    public static void bfs(int start, List<Integer>[] graph) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.length];
        queue.add(start);
        visited[start] = true; // 起始节点入队时立即标记
        while (!queue.isEmpty()) {
            int node = queue.remove();
            System.out.println(node); // 处理节点

            List<Integer> neighbors = graph[node];
            if (neighbors != null) {
                for (int neighbor : neighbors) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true; // 入队时标记
                        queue.add(neighbor);
                    }
                }
            }
        }
    }
}
