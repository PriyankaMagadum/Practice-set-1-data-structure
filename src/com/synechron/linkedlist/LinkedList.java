package com.synechron.linkedlist;

public class LinkedList {

	public Node head;

	public void push(int element) {

		// add node at first
		Node newNode = new Node(element);
		newNode.next = head;
		head = newNode;
	}

	public void getNthNodeFromEndOfLinkedList(int n) {

		int length = getcountOfNodes();
		if (length < n) {
			return;
		}

		Node temp = head;

		for (int i = 1; i <= length - n + 1; i++) {
			temp = temp.next;
		}

		System.out.println(n + "th element from the end of linked list=" + temp.data);

	}

	public int getcountOfNodes() {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}

	public void printMiddleElementInLinkedList() {

		Node temp = head;

		int length = getcountOfNodes();
		int reminder = length % 2;
		int answer = length / 2;
		int n;
		if (reminder == 0) {
			n = answer + 1;
		} else {
			n = answer + reminder;
		}

		for (int i = 1; i < n; i++) {
			temp = temp.next;
		}

		System.out.println("middle element in linked list=" + temp.data);

	}

	public void print() {

		Node temp = head;

		while (temp != null) {
			System.out.println("data=" + temp.data);
			temp = temp.next;
		}

	}

	public void reverse() {

		Node temp = head;
		Node current = null;
		Node previous = null;
		while (temp != null) {

			current = temp;
			temp = temp.next;
			current.next = previous;
			previous = current;

		}

		head = previous;

	}
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.push(1);
		linkedList.push(2);
		linkedList.push(3);
		linkedList.push(4);
		linkedList.push(5);

		// get nth node from the end of linked list
		linkedList.getNthNodeFromEndOfLinkedList(3);

		System.out.println("length=" + linkedList.getcountOfNodes());

		// get middle element in linked list
		linkedList.printMiddleElementInLinkedList();

		// print linked list
		linkedList.print();
		System.out.println(
				"==================================reverse linked list=========================================");
		linkedList.reverse();

		// print linked list
		linkedList.print();

	}

}

class Node {

	public int data;
	public Node next;

	public Node() {
		super();
	}

	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}

}
