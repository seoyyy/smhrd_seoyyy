
public class Ex08�迭����5 {

	public static void main(String[] args) {
	
//	int[] array = new int[5];
	int[]starCount = {3,4,4,2,1};
	
	//�迭�� �ε����Ǽ� ��ŭ ���� ����غ�����.
	
	for(int i = 0; i < starCount.length; i++) {
		
		System.out.print(starCount[i] + " : ");
		
		for(int j = 1 ; j <= starCount[i] ; j++) {
			System.out.print("*");
		}
	
		System.out.println();
	}
		
		

		
		
		

	}

}
