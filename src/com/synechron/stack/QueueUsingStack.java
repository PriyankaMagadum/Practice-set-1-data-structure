package com.synechron.stack;

import java.util.LinkedList;
import java.util.Stack;

public class QueueUsingStack {

	private Stack<Integer> stack1 = new Stack<>();
	private Stack<Integer> stack2 = new Stack<>();
	private int currentSize;

	public QueueUsingStack() {
		super();
		currentSize = 0;
	}

	public void enQueue(int element) {

		currentSize++;
		stack1.push(element);

		if (!stack2.isEmpty()) {

			for (int i = 0; i < stack2.size(); i++) {
				stack1.push(stack2.get(i));
			}
			stack2.removeAllElements();
		}

		Stack<Integer> tempStack = stack1;
		stack1 = stack2;
		stack2 = tempStack;
	}

	public int deQueue() {

		currentSize--;
		if (stack2.isEmpty()) {
			System.out.println("Queue is empty.");
			System.exit(1);
		}
		int element = stack2.peek();
		stack2.pop();
		return element;

	}

	public int size() {
		return currentSize;
	}

	public static void main(String[] args) {
		QueueUsingStack queueUsingStack = new QueueUsingStack();
		queueUsingStack.enQueue(1);
		queueUsingStack.enQueue(2);
		queueUsingStack.enQueue(3);

		// after adding data into queue
		System.out.println("enqueue========================================");
		for (int element : queueUsingStack.stack2) {
			System.out.println(element);
		}

		// now there are three elements in queue
		// now we are removing one element
		queueUsingStack.deQueue();
		System.out.println("dequeue========================================");
		for (int element : queueUsingStack.stack2) {
			System.out.println(element);
		}

		// now there are two elements in queue
		// now removing two elements.
		queueUsingStack.deQueue();
		queueUsingStack.deQueue();
		System.out.println("dequeue========================================");
		for (int element : queueUsingStack.stack2) {
			System.out.println(element);
		}
		// in above queue there is no data or we can say queue is empty.
		// now try to dequeue empty queue, it will give empty queue.

		queueUsingStack.deQueue();
	}

}
