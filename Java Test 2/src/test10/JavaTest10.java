package test10;
/*
 * ��¥ : 2020/05/07
 * �̸� : ������
 * ���� : �ڹ� �ڷᱸ�� ť(Queue) ��������
 */
public class JavaTest10 {
	
	static int QUEUE_SIZE = 10;
	static int queue[] = new int[QUEUE_SIZE];
	static int front = 0, rear = 0;
	
	public static void main(String[] args) {
		
		insert(100);
		insert(200);
		insert(300);
		
		System.out.println(delete());
		System.out.println(delete());
		System.out.println(delete());
		System.out.println(delete());
		
	}

	public static void insert(int date) {
		if (rear == QUEUE_SIZE) {
			System.out.println("���̻� �����͸� ���� �� �� �����ϴ�.");
		}
		= data;	
	}
	public static int deldte() {
		if (front == QUEUE_SIZE) {
			System.out.println("�����Ͱ� �����ϴ�.");
			retutn 0;
		}
		return queue[front++];
	}
}
