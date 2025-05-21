package Im;

import java.util.Stack;

public class BinarySearch {
    class Node {
        int data;
        Node left, right;

    }


    public void dfs(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        dfs(root.left);
        dfs(root.right);
    }

    public void dfsByStack(Node root) {
        if (root == null) return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.print(node.data + " "); // 访问节点

            // 注意先压右节点，再压左节点（因为栈是后进先出）
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }


    public static void main(String[] args) {

    }
}
