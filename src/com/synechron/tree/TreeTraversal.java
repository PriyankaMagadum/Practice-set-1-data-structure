package com.synechron.tree;

public class TreeTraversal {

	Node root;
	int i = 0;

	class Node {
		int key;
		Node left, right;

		public Node() {
			super();
		}

		public Node(int key) {
			super();
			this.key = key;
			this.left = null;
			this.right = null;
		}
	}

	public void preOrderTraversal() {
		Node temp = root;

		while (temp != null) {
			System.out.println(temp.key);
			temp = temp.left;
		}

	}

	void printPreorder(Node node) {
		if (node == null)
			return;

		System.out.print(node.key + " ");

		printPreorder(node.left);

		printPreorder(node.right);
	}

	void printPostOrder(Node node) {
		if (node == null)
			return;

		printPostOrder(node.left);

		printPostOrder(node.right);

		System.out.print(node.key + " ");
	}

	void printInOrder(Node node) {
		if (node == null)
			return;

		printPostOrder(node.left);

		System.out.print(node.key + " ");

		printPostOrder(node.right);

	}

	public void levelOrderTraversal(Node node, int count) {

		System.out.println(node.key);

		if (count == i) {
			levelOrderTraversal(node.left, count);
		}

	}

	public static void main(String[] args) {

		TreeTraversal treeTraversal = new TreeTraversal();

		treeTraversal.root = treeTraversal.new Node(1);
		treeTraversal.root.left = treeTraversal.new Node(2);
		treeTraversal.root.right = treeTraversal.new Node(3);
		treeTraversal.root.left.left = treeTraversal.new Node(4);
		treeTraversal.root.left.right = treeTraversal.new Node(5);

		treeTraversal.preOrderTraversal();

		System.out.println("=================Pre order traversal=====================");

		treeTraversal.printPreorder(treeTraversal.root);
		System.out.println("");

		System.out.println("=================Post order traversal=====================");
		treeTraversal.printPostOrder(treeTraversal.root);
		System.out.println("");

		System.out.println("=================In order traversal=====================");
		treeTraversal.printInOrder(treeTraversal.root);

	}

}
