package com.sai.junk;

public class BinarySearchTree {

	static Node root=null;

	public static void main(String []args) {

		BinarySearchTree bst = new BinarySearchTree();

		bst.insertNode(14, root);
		bst.insertNode(22, root);
		bst.insertNode(10, root);
		bst.insertNode(1, root);
		bst.insertNode(21, root);
		

		bst.printBST(root);
		bst.searchNode(22, root);
		bst.printMinValue(root);
		bst.printMaxValue(root);
		
		System.out.println("IN order");
		bst.inorder(root);
		System.out.println("----------");
		System.out.println("Pre order");
		bst.preorder(root);
		System.out.println("----------");
		System.out.println("Post order");
		bst.postorder(root);
	}

	
	public void printMinValue(Node root){
		
		if (root.leftNode != null) {
			printMinValue(root.leftNode);
		} else {
		System.out.println("Min:" + root.data);
		}
		
	}
	
	public void printMaxValue(Node root){
		if (root.rightNode != null) {
			printMaxValue(root.rightNode);
		} else {
		System.out.println("Max:" + root.data);
		}
		
	}

	public  void printBST(Node root){
		if(root!=null){
			System.out.print(" " + root.data);
			printBST(root.leftNode);
			printBST(root.rightNode);
		}
	}
	

	public void inorder(Node root){
		if(root!=null){
			printBST(root.leftNode);
			System.out.print(" " + root.data);
			printBST(root.rightNode);
		}
	}
	
	public void preorder(Node root){
		if(root!=null){
			System.out.print(" " + root.data);
			printBST(root.leftNode);
			printBST(root.rightNode);
		}
	}
	
	public void postorder(Node root){
		if(root!=null){
			printBST(root.leftNode);
			printBST(root.rightNode);
			System.out.println(" " + root.data);
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


