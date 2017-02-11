package com.sai.junk;

public class SimpleLinkedList {

	 Node head = null;


	public static void main(String args[]){
		
		SimpleLinkedList ll = new SimpleLinkedList();
		ll.addFirst(4);
		ll.addFirst(6);
		ll.addLast(77);
		ll.addLast(68);
		ll.addLast(600);
		ll.insertAfter(77, 78);
		ll.printlist();
		ll.delete(77);
		ll.printlist();
		ll.find(68);
	}
	
	
	public void find(int v) {
		
	}


	public void printlist() {
		Node tmp = head;
		while(tmp.nextNode != null) {
			System.out.println("__"+tmp.data);
			tmp = tmp.nextNode;
		}
		System.out.println("__"+tmp.data);//print the last one
	}
	
	
	public void delete(int val){
		
		Node tmp = head;
		Node before = null;
		while (tmp.data != val && tmp.nextNode != null) {
			before = tmp;
			//System.out.println("__"+tmp.data);	
			tmp = tmp.nextNode;
		}
		before.nextNode = tmp.nextNode; //update link
		
	}
	

	public void addFirst(int val) {

		if (head == null) {
			head = new Node(val, null);
		} else {
			Node n = new Node(val, head);
			head = n; //new head

		}
	}

	public void addLast(int val) {
		if(head == null) addFirst(val);
		else {
			Node tmp = head;
			while (tmp.nextNode != null) {
				tmp = tmp.nextNode;
			}
			tmp.nextNode = new Node(val, null);
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
