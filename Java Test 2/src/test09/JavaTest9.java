package test09;
/*
 * ��¥ : 2020/05/07
 * �̸� : ������
 * ���� : �ڹ� �ڷᱸ�� ����(Stack)��������
 */

public class JavaTest9 {
	
	static int STACK_SIZE = 10;
	static int stack[] = new int[STACK_SIZE];
	static int top = 0;
	
	public static void main(String[] args) {
		
		push(100);
		push(200);
		push(300);
		
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
	}
	
	piblic static void push(int data) {
		if (top == STACK_SIZE) {
			System.out.println("���̻� �����͸� ���� �� �� �����ϴ�.");
		}
		stack[top++] = ;
	}
	
		public static int pop() {
			if (top ==0) {
				System.out.println("�����Ͱ� �����ϴ�.\n");
				return 0;
			}
			return stack[];
		
	}

}
