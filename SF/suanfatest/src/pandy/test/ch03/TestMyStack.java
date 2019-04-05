package pandy.test.ch03;

import java.util.ArrayList;

public class TestMyStack {
	public static void main(String[] args) {
		MyStack ms = new MyStack(4);
		ms.push(12);
		ms.push(123);
		ms.push(3);
		ms.push(66);
		System.out.println(ms.isEmpty());
		System.out.println(ms.isFull());
		System.out.println(ms.peek());
		while(!ms.isEmpty()) {
			System.out.print(ms.pop()+" ,");
		}
	}
}