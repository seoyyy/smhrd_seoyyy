
public class Ex02����for������2 {

	public static void main(String[] args) {
			
	//2~30������ ����� ���ϼ���.	
		for(int i = 2; i <31; i++) {
			System.out.print(i + "�� ����� :");
			for(int j =1; j<i+1; j++ ) {
				if(i%j == 0) {
					System.out.print(j + " ");
				}
					}
			System.out.println();
			
		}
		

	}

}
