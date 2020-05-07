package sub2;

public class Account {
	// Ư��(�������)
	//  -  ���ޱ��� private �������� ������ ĸ��ȭ �Ѵ�.
	private String bank;
	private String id;
	private String name;
	private int money;
	
	// ������ : ��ü�� ���� �Ҷ� ��������� �ʱ�ȭ�ϴ� �޼���
	Account(String bank, String id,  String name, int money){
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	} 
	
	// ���(�޼���)
	public void deposit(int money) {
		this.money += money;
	}
	
	public void withdraw(int money) {
		this.money -= money;
	}
	
	public void info() {
		System.out.println("=============");
		System.out.println("�� �� ��: "+bank);
		System.out.println("���¹�ȣ : "+id);
		System.out.println("�� �� �� : "+name);
		System.out.println("�����ܾ�: "+money);
	}
}
