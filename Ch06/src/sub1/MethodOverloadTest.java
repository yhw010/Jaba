package sub1;

/* 
 * ��¥ : 2020/05/06
 * �̸� : ������
 * ���� : �ڹ� �����ε� �޼���(�Լ�) �ǽ��ϱ�
 */
public class MethodOverloadTest {
	public static void main(String[] args) {
		
	 int r1 = add(1);
	 System.out.println("r1 : "+r1);
	 
	 int r2 = add(1,2);
	 System.out.println("r2 : "+r2);
	 
	 String r3 = add("ȫ�浿");
	 System.out.println("r3 :" +r3);

                    
			
	} // main end
	
	
	// �����ε� �޼���
	// - �Լ����� ������ �Ű������� ������ Ÿ������ �����ϴ� �޼���
	public static int add(int a) {
		return a++;
	}

	public static int add(int a, int b) {
		return a+b;
	}
	
	public static String add(String name) {
		return name+"�� �ݰ����ϴ�.";
	}
	
}
