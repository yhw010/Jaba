package sub1;

import java.util.Scanner;

/*
 * ��¥ : 2020/05/01
 * �̸� : ������
 * ���� : ���ǹ� switch �ǽ��ϱ�
 */

public class SwitchTest {
	public static void main(String[] args) {
		
		int num = 3;
		
		switch(num) {
		case 1:
			System.out.println("num�� 1�Դϴ�.");
			break;
		case 2:
			System.out.println("num�� 2�Դϴ�.");
		    break;
		case 3:
			System.out.println("num�� 3�Դϴ�.");
			break;
		default :
			System.out.println("num�� 1,2,3�� �ƴմϴ�.");
			break;
			
		}
		// ��������
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է�");
		int score = sc.nextInt();
		
		System.out.println("�Է��� ������ "+score+"�Դϴ�.");
		
		int grade =score / 10;
		
		switch(score) {
		case 10:
		case 9:
			System.out.println("����� A�Դϴ�.");
			break;
		case 8:
			System.out.println("����� B�Դϴ�.");
			break;
		case 7:
			System.out.println("����� C�Դϴ�.");
			break;
		case 6:
			System.out.println("����� D�Դϴ�.");
	    default:
	    	System.out.println("����� F�Դϴ�.");
	    	break;
				
		}
		
		
	}

}
