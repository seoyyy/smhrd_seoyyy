package �߻�;

public abstract class Employee {

	//3�����޿����� �θ𰡵ɼ��ִ� �߻�Ŭ���� ->abstract
	//->���޿� ���Ͽ� ������ ����� �� �ִ� �ʵ� �� �޼ҵ尡 �����ؾ��Ѵ�. 
	
	//����̸������� ����Ǵ� ����Ǵ� �ʵ弱��
	//���� ������ = public(��/�ܺ� ��� �������), private(���ο����� ���), protected, default(��������)
	//protected(���� ��Ű�� Ȥ�� ����� ���迡���� ���)
	protected String empno;
	protected String name;
	protected int pay;
	
	//�� �߻��� ����ϳ�?!
	//���޺��� �����̴޶����ѱ�
	public abstract int getMoneyPay();
	
	public String print() {
		return empno + " : " + name + " : " + pay;
	}
	
	
}
