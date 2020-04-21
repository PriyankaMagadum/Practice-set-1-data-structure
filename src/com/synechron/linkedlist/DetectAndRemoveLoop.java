package com.synechron.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class DetectAndRemoveLoop {

	Node head;

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

	public void print() {

		Node temp = head;

		while (temp != null) {
			System.out.println("data=" + temp.data);
			temp = temp.next;
		}

	}

	public void deletectLoopAndRemove() {

		Node temp = head;
		List<Integer> dataList = new ArrayList<>();

		int count = 0;
		while (temp != null) {

			dataList.add(temp.data);
			if (dataList.contains(temp.next.data)) {
				temp.next = null;
				break;
			}
			temp = temp.next;
		}

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

	public static void main(String[] args) {
		DetectAndRemoveLoop list = new DetectAndRemoveLoop();
		list.head = list.new Node(50);
		list.head.next = list.new Node(20);
		list.head.next.next = list.new Node(15);
		list.head.next.next.next = list.new Node(4);
		list.head.next.next.next.next = list.new Node(10);

		// Creating a loop for testing
		list.head.next.next.next.next.next = list.head.next.next;

		// delect and remove loop in linked list
		list.deletectLoopAndRemove();
		System.out.println("length=" + list.getcountOfNodes());

		list.print();

	}

}
