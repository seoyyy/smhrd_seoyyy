
public class CalculatorMain {

	public static void main(String[] args) {
	
	//2���� �Ű������� �Ѱܹ޴� �����ڸ� �̿��ؼ� cal�̶�� ��ü ����
		Calculator cal = new Calculator(40,30);
	//cal��ü�� num1�� num2�� ���Ѱ��� ������ּ���.	
		System.out.println("���ϱ� :" + cal.sum());
		
	//call ��ü�� num1�� 75, num2�� 5�� �������ּ���!
		cal.setNum1(75);
		cal.setNum2(5);
		
		System.out.println("���Ѱ�"+cal.sum());
		System.out.println("����"+cal.sub());
		System.out.println("���Ѱ�"+cal.mul());
		System.out.println("������"+cal.div());
	}

}
