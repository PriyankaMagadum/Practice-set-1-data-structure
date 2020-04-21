package com.synechron.linkedlist;

public class TwoLinkedList {

	Node head1, head2;

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

	public int intersectionPoint() {
		int intersectionPoint = 0;
		Node temp1 = head1;
		Node temp2 = head2;

		int length1 = getcountOfNodes(temp1);
		int length2 = getcountOfNodes(temp2);
		int count = 0;
		while (temp1 != null) {
			while (temp2 != null) {
				if (temp1.data == temp2.data) {
					count = count + 1;
					intersectionPoint = temp1.data;
					break;
				}
				if (count > 0) {
					break;
				}
				temp2 = temp2.next;
			}
			temp2 = head2;
			temp1 = temp1.next;
		}
		return intersectionPoint;
	}

	public int getcountOfNodes(Node head) {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		TwoLinkedList list = new TwoLinkedList();

		// creating first linked list
		list.head1 = list.new Node(3);
		list.head1.next = list.new Node(6);
		list.head1.next.next = list.new Node(9);
		list.head1.next.next.next = list.new Node(15);
		list.head1.next.next.next.next = list.new Node(30);

		// creating second linked list
		list.head2 = list.new Node(10);
		list.head2.next = list.new Node(15);
		list.head2.next.next = list.new Node(30);

		System.out.println("Intersection point=" + list.intersectionPoint());
	}

}
