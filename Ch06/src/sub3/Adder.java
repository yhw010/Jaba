package sub3;

public class Adder {

	// �������
	private int x;
	
	// ������
	Adder(int x){
		this.x = x;
	}
	
	// gerret, setter
	// - �ܺο��� ��������� ���� ���������� �ʿ��� ��� ����ϴ� �޼���
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void add(int x){
		this.x = x +50;
	}
    public void add(int[] arr){
    	arr[0]++;
    }
	public void add(Adder a1){
		int x = a1.getX() +40;
		a1.setX(x);
	 
	}
	public void addNew(Adder a2){
		a2 =new Adder(1);
	}
	  
	
}
