package com.sai.junk;

public class SimpleLinkedList {

	Node head = null;
	

	public static void main(String args[]){
		Node n = new Node(4, null);
		n.data = 4;
		n.nextNode = null;
	}



	public void addFirst(Node newNode) {
		if (newNode == null) {
			return;
		} else {
			if (head == null) {
				head = newNode;
				head.nextNode = null;
			} else {
				newNode.nextNode = head;
				head = newNode;
			}
		}
	}

	public void addLast(Node newNode) {
		if (newNode == null) {
			return;
		} else {
			if(head == null) addFirst(newNode);
			else {
				Node tmp = head;
				while (tmp.nextNode != null) {
					tmp = tmp.nextNode;
				}
				tmp.nextNode = newNode;
			}

		}
	}
	
	public void insertAfter(int key, int newValue) {
		
		Node tmp = head;
		
		while(tmp != null && !(tmp.data == key)){
			tmp = tmp.nextNode;
		}
		
		tmp.nextNode = new Node(newValue, tmp.nextNode);
		
		
	}


}
