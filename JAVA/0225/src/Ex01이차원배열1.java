
public class Ex01�������迭1 {

	public static void main(String[] args) {
		
	//4��4��¥�� array��� �̸��� 2���� �迭�� ����� �;��!
		int[][] array = new int[5][5];
	//�����͸� 1���� 25���� �־��ּ���.	
		int num = 1;
	//num�� �̿��ؼ� 1�࿡ 1-5���� ���� �־��ּ���!
	
	//�Էº�
	for(int j=0; j<array.length ;j++) {		//�������迭���� �׳� array.length�� ù��° �迭�� ���̸� ��Ÿ��
		
		for(int i = 0; i<array[j].length;i++) {
			array[j][i] = num;
			num++;
		}
		
	}
	//��º�
	//2���� �迭 ���
	//1 2 3 4 5
	//6 7 8 9 10 
	for(int j = 0; j<array.length; j++) {
	for(int i = 0; i<array[j].length; i++) {
		System.out.print(array[j][i]+" "); //->" " ���  "\t" ������ ->tab��ŭ ����!
	}
	System.out.println();
	}	
		
	}

}
