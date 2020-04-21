package com.synechron.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	private Queue<Integer> q1 = new LinkedList<>();
	private Queue<Integer> q2 = new LinkedList<>();
	private int currentSize;

	public StackUsingQueue() {
		super();

		this.currentSize = 0;

	}

	public void push(int element) {

		currentSize++;
		q2.add(element);

		while (!q1.isEmpty()) {

			q2.add(q1.peek());
			q1.remove();
		}

		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;

	}

	public void pop() {

		if (q1.isEmpty()) {
			return;
		} else {
			currentSize--;
			int element = q1.peek();
			q1.remove();
			System.out.println("Removed element=" + element);

		}

	}

	public int size() {
		return currentSize;
	}

	public int top() {

		if (q1.isEmpty()) {
			return -1;
		}

		return q1.peek();
	}

	public static void main(String[] args) {

		StackUsingQueue stackUsingQueue = new StackUsingQueue();

		stackUsingQueue.push(1);
		stackUsingQueue.push(2);
		stackUsingQueue.push(3);
		stackUsingQueue.pop();
		stackUsingQueue.push(4);
		for (int a : stackUsingQueue.q1) {
			System.out.println(a);
		}

		System.out.println("size of statck=" + stackUsingQueue.size());

		System.out.println("top element is:" + stackUsingQueue.top());

	}

}
