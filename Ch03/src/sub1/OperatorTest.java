package sub1;

/*
 * ��¥ : 2020/04/29
 * �̸� : ������
 * ���� : ������ �ǽ��ϱ�
 */
public class OperatorTest {
	
	public static void main(String[] args) {
		//���������
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		
		int rs1 = num1 + num2;
		int rs2 = num1 - num2;
		int rs3 = num3 * num2;
		int rs4 = num4 / num2;
		int rs5 = 7% num2;//������ �������� ���ϴ� ������
		
		System.out.println("rs1 :"+rs1);
		System.out.println("rs2 :"+rs2);
		System.out.println("rs3 :"+rs3);
		System.out.println("rs4 :"+rs4);
		System.out.println("rs5 :"+rs5);
		
		//����, ���� ������
		int n1 = 1;
		int n2 = 2;
		
		n1++;
		n2--;

		++n1;
		--n2;
		
		System.out.println("n1�� ��: "+n1);
		System.out.println("n2�� ��: "+n2);
		
		//���մ��Կ�����
		int no1 = 1, no2 = 2, no3 = 3, no4 = 4;
		
		no1 += 1; //no1 = no1 +1;
		no2 -= 2; //no2 = no2 -2;
		no3 *= 3; //no3 = no3 *3;
		no4 /= 4; //no4 = no4 /4;
		
		System.out.println("���� no1�� �� :"+no1);
		System.out.println("���� no2�� �� :"+no2);
		System.out.println("���� no3�� �� :"+no3);
		System.out.println("���� no4�� �� :"+no4);
		
		//�񱳿�����
		int var1 = 1;
		int var2 = 2;
		
		boolean res1 = (var1 > var2);  // var1�� var2���� ũ��.
		boolean res2 = (var1 < var2);  // var1�� var2���� �۴�.
		boolean res3 = (var1 >= var2); // var1�� var2���� ũ�ų�����.
		boolean res4 = (var1 <= var2); // var1�� var2���� �ڰƳ� ����.
		boolean res5 = (var1 == var2); // var1�� var2�� ���� ����.
		boolean res6 = (var1 != var2); // var1�� var2�� ���� �ٸ���.
		
		System.out.println("res1 : "+res1);
		System.out.println("res2 : "+res2);
		System.out.println("res3 : "+res3);
		System.out.println("res4 : "+res4);
		System.out.println("res5 : "+res5);
		System.out.println("res6 : "+res6);
			
		//��������
		boolean r1 = (var1 > 0) && (var2 > 1); // var1�� 0���� ũ�� �׸��� var2�� 1���� ũ��.
		boolean r2 = (var1 > 0) && (var2 > 2); // var1�� 0���� ũ�� �׸��� var2�� 2���� ũ��.
		boolean r3 = (var1 > 0) || (var2 > 2); // var1�� 0���� ũ�� �Ǵ� var2�� 2���� ũ��.
		boolean r4 = (var1 > 1) || (var2 > 2); // var1�� 1���� ũ�� �Ǵ� var2�� 2���� ũ��.
		boolean r5 = !(var1 > var2); //var1�� var2���� ũ�� �ʴ�.
		
		System.out.println("r1 :" +r1);
		System.out.println("r2 :" +r2);
		System.out.println("r3 :" +r3);
		System.out.println("r4 :" +r4);
		System.out.println("r5 :" +r5);
		
		
		
	
	}
	
}
