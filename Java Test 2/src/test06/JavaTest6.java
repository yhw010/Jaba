package test06;
import java.util.Scnner;
/*
  ��¥ : 2020/05/07
  �̸� : ������
  ���� : �Լ� ��������
 */

public class JavaTest6 {
	public static void main() {
		System.out.println("******* START *******");
		System.out.println("�ΰ��� ������ �Է�");
    }
	
	public static int void(name) {
		System.out.print("���� "+naem+" �� �Է� : ");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;	
	}
	
	public static void result (int val) {
		System.out.println("���� ��� : "+val);
		System.out.println("****** END *******");
	}
	
	public static     add(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		intro();
		
		int a = input("a");
		int b = input("b");
		
		int output = add(a, b);
		result(output);
			
	}

}
