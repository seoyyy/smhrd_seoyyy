package �߻�;

public class RegularEmployee extends Employee {

//	String empno;
//	String name;
//	int pay;
	int bonus;
	
	//���ް�ѹ��� ���޺��� �޶� ��üȭ��Ų�� 
	//�ް� �ʱ�ȭ�� ���ټ��ִ� ������ �޼ҵ�(����Ÿ�Ծ���)
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		this.empno=empno;
		this.name=name;
		this.pay=pay; //����
		this.bonus=bonus;
	}
	//������ ���޹��
	public int getMoneyPay() {
		return (pay+bonus)/12;
	}
	
	
	//�߻�Ŭ������ �������� ����������ѱ� ����
//	public String print() {
//		return empno + " : "+ name + " : " + pay;
//	}
}
