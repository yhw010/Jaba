package test03;
/*
 * ��¥ : 2020/05/07
 * �̸� : ������
 * ���� : �ڹ� �迭 �������� �����ϱ�
 */
public class JavaTest3 {
	
	public static void main(String[] args) {
		
		int srr[i] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// ���� �迭 ���
		for (int i = 0; i < 10; i++) {
			     System.out.print(arr[i]+",");
		}
		System.out.print("\n");
		
		// �迭�� ���Ҹ� �������� ����
		for (int j = 0; i < 5; j++) {
			int temp = arr[j];
			 = arr[9 - j];
			 arr[9 - j] = temp;
		}
		
		// �������� ���ĵ� �迭 ���
		for (int k = 0; k < 10; k++) {
			System.out.println(arr[k]+", ");
		}
	}
}
