package com.synechron.stack;

import java.util.Stack;

public class StackWithMinimumValue {

	private Stack<Integer> stack = new Stack<>();
	private Stack<Integer> minValueStack = new Stack<>();

	public void push(int element) {

		stack.push(element);

		if (!minValueStack.isEmpty()) {
			if (minValueStack.peek() > element)
				minValueStack.push(element);
		} else {
			minValueStack.push(element);
		}

	}

	public int pop() {
		int element = 0;

		if (!stack.isEmpty()) {
			element = stack.peek();
			if (element == minValueStack.peek()) {
				minValueStack.pop();
			}
			System.out.println("element=" + element + " poped=" + stack.pop());
		}
		return element;
	}

	public int getMinValue() {
		if (!minValueStack.isEmpty()) {
			return minValueStack.peek();
		} else {
			System.out.println("Stack is Empty.");
			System.exit(1);
		}
		return 0;
	}

	public static void main(String[] args) {

		StackWithMinimumValue stackWithMinimumValue = new StackWithMinimumValue();
		stackWithMinimumValue.push(32);
		stackWithMinimumValue.push(5);
		stackWithMinimumValue.push(10);
		stackWithMinimumValue.push(2);
		stackWithMinimumValue.push(42);

		for (int element : stackWithMinimumValue.stack) {
			System.out.println(element);
		}

		System.out.println("minimum value=" + stackWithMinimumValue.getMinValue());
		System.out.println("====================================================================");
		System.out.println("Peek element=" + stackWithMinimumValue.stack.peek());
		System.out.println("removed element=" + stackWithMinimumValue.pop() + " minimum value="
				+ stackWithMinimumValue.getMinValue());
		System.out.println("====================================================================");
		System.out.println("Peek element=" + stackWithMinimumValue.stack.peek());

		System.out.println("removed element=" + stackWithMinimumValue.pop() + " minimum value="
				+ stackWithMinimumValue.getMinValue());
		System.out.println("====================================================================");
		System.out.println("Peek element=" + stackWithMinimumValue.stack.peek());
		System.out.println("removed element=" + stackWithMinimumValue.pop() + " minimum value="
				+ stackWithMinimumValue.getMinValue());

		System.out.println("====================================================================");
		for (int element : stackWithMinimumValue.stack) {
			System.out.println(element);
		}

	}

}
