package Algorythms;

import java.util.ArrayList;
import java.util.Stack;

public class БиДеревоГлубина {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> lists = new ArrayList<Integer>();
        if (root == null)
            return lists;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode tree = stack.pop();
            // Вставьте сначала правый узел в стек, а затем в левый узел,
            // чтобы выталкивание стека было первым левым узлом, а затем правым узлом.
            if (tree.right != null)
                stack.push(tree.right);
            if (tree.left != null)
                stack.push(tree.left);
            lists.add(tree.val);
        }
        return lists;

    }
}
