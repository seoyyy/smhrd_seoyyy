
public class Ex04�������迭4 {

	public static void main(String[] args) {
		
		//->��ü���� �� �ڵ� ����
		//ctrl + a  ���� �Ŀ�
		//ctrl + shift + f
		
		int[][] array = new int[5][5];

		int num = 21;

		// �Էº�
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				array[j][i] = num;
				num++;
			}
		}

		//��º�
		
		for (int j =0; j < array.length; j++) {
			for (int i = array[0].length -1; i >=0 ; i--) {
				System.out.print(array[j][i] + "\t");				
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		
		
		
		
		for (int j =0; j < array.length; j++) {
			for (int i = array[0].length -1; i >=0 ; i--) {
				System.out.print(array[i][j] + "\t");				
			}
			System.out.println();
		}
		
		
		
	}

}
