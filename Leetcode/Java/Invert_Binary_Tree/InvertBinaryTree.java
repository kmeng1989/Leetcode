package Invert_Binary_Tree;

public class InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}
		TreeNode tempNode = root.left;
		root.left = root.right;
		root.right = tempNode;
		invertTree(root.left);
		invertTree(root.right);
		return root;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode(int v) {
		val = v;
	}
}
