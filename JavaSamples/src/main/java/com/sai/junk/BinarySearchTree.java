package com.sai.junk;

public class BinarySearchTree {

	static Node root=null;

	public static void main(String []args) {

		BinarySearchTree bst = new BinarySearchTree();

		System.out.println("____" + root);
		bst.insertNode(14, root);
		System.out.println("____" + root);
		bst.insertNode(22, root);
		System.out.println("____" + root);
		bst.insertNode(1, root);

		System.out.println("____" + root);
		printBST(root);
		bst.searchNode(22, root);
		System.out.println("____" + root);
	}


	public static void printBST(Node root){

		if(root!=null){
			printBST(root.leftNode);
			System.out.print(" " + root.data);
			printBST(root.rightNode);
		}
	}


	public void insertNode(int key, Node root){
		if (root == null) {
			root = new Node(key, null, null);
			this.root = root;

		} else {

			if(key < root.data){
				if(root.leftNode != null) {
					insertNode(key, root.leftNode);
				} else {
					root.leftNode = new Node(key, null, null);
				}
				
			} else if (key >= root.data){
				
				if (root.rightNode != null) {
				insertNode(key, root.rightNode);
				} else {
					root.rightNode = new Node(key, null, null);
				}
			}

		}

	}


	public Node searchNode(int key, Node root){
		if(key == root.data){
			return root;
		} else if (key < root.data){
			searchNode(key, root.leftNode);
		} else {
			searchNode(key, root.rightNode);
		}
		return null;
	}

	class Node {

		int data;
		Node leftNode = null;
		Node rightNode = null;

		Node (int data, Node leftNode, Node rightNode) {
			this.data = data;
			this.leftNode = leftNode;
			this.rightNode = rightNode;
		}

	}//innner class node

}


