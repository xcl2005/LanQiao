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
        Stack<Node> stack = new Stack<>();
        System.out.println(root.data);
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            if (node.left != null) {
                stack.push(node.left);
                System.out.print(node.left.data + " ");
            }
            else if (node.right != null) {
                stack.push(node.right);
                System.out.print(node.right.data + " ");
            }
        }
    }

    public static void main(String[] args) {

    }
}
