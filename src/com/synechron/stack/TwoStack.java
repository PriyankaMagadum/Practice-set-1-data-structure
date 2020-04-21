package com.synechron.stack;

import java.util.Queue;

public class TwoStack {

	int top1;
	int top2;
	int size;
	int arr[];

	public TwoStack() {
		super();
	}

	public TwoStack(int size) {
		this.size = size;
		this.top1 = -1;
		this.top2 = this.size;
		this.arr = new int[size];
	}

	public void push(int element) {

		if (top1 <= top2 - 1) {
			arr[++top1] = element;
		} else {
			System.out.println("Stack overflow error");
		}

	}

	public int pop() {

		if (top1 >= 0) {
			int element = arr[top1];
			top1--;
			return element;
		} else {
			System.out.println("Stack overflow error");
			return 0;
		}

	}

	public static void main(String[] args) {
		TwoStack stack = new TwoStack(5);

		stack.push(12);
		stack.push(4);
		stack.pop();

	}

}
