
public class Ex03�������迭3 {

	public static void main(String[] args) {
		
		
		int[][]array = new int[5][5];
		
		int num = 21;
		
		//�Էº�
		for(int j = 0; j<array.length; j++) {
		for(int i = 0; i<array[j].length; i++) {
			array[j][i] = num;
			num++;
		}
		}
		
	//Ư�������ǿ� ���� �����͸� �������� �۾�
		for(int j = 0; j<array[0].length; j++) { 	//j�����ѹݺ�
			for(int i = 0; i<array.length; i++) { //i�����ѹݺ�
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
	}

}
