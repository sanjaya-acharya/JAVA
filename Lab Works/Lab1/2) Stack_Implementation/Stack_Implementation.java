import java.util.*;

class Stack {
	Scanner scanInput= new Scanner(System.in);

	int top, size, stack[];

	Stack (int size) {
		this.size = size;
		stack = new int[size];
		top = -1;
		System.out.println("Stack memory of size " + size + " is allocated!\n");
	}

	boolean isFull() {
		return (top == (size - 1));
	}

	boolean isEmpty() {
		return (top == -1);
	}

	public void push () {
		if (isFull()) {
			System.out.println("Stack is full!\n");
		}
		else {
			System.out.println("Enter a data to push: ");
			int data = scanInput.nextInt();

			stack[++top] = data;
			System.out.println(stack[top] + " is inserted into the stack!\n");
		}
	}

	public void pop () {
		if (isEmpty()) {
			System.out.println("Stack is empty!\n");
		}
		else {
			System.out.println(stack[top--] + " is popped out of the stack!\n");
		}
	}

	public void peek () {
		if (isEmpty()) {
			System.out.println("Stack is empty!\n");
		}
		else {
			System.out.println("Data at peek is = " + stack[top] + "\n");
		}
	}
}

class Stack_Implementation {
	public static void main(String[] args) {
		Scanner scanInput= new Scanner(System.in);

		int size = 0, menuId = -1, data;

		while (size <= 0) {
			System.out.println("Enter the desired size of stack (size > 0)*\n");
			size = scanInput.nextInt();

			if (size <= 0)
				System.out.println ("Enter a valid size!\n");
		}

		Stack s1 = new Stack(size);

		while (menuId != 0) {
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek\nChoose an option from menu (0 - 3)\n");
			menuId = scanInput.nextInt();

			switch (menuId) {
				case 0:
					break;
				case 1:
					s1.push();
					break;
				case 2:
					s1.pop();
					break;
				case 3:
					s1.peek();
					break;
				default:
					System.out.println("Enter a valid Input!\n");
			}
		}
		System.out.println ("Program ended!!!\n");
	}
}