
public class phone {
	//클래스란 >>  사용자 임의의 자료형이다 !
	//>> 현실에 있는 물체를 표현(설명)할 수 있는 사용자 임의의 자료형(자료타입 type)이다.
	
	
	//휴대폰 하면 어떤게 생각나나요?
	//1.전화를 걸다. 2. 전화를 받다. 3.브랜드 4.게임을 하다 5.전화번호 
	//위의 5가지역할을 하는 어떤 것이 있다면 그건 휴대폰이라고 칭할 수 있다!
	
	//data와 기능을 따로 분리!
	//data-브랜드 , 전화번호 / 기능 - 전화를 걸다 , 전화를 받다, 게임을 하다
	String brand = "삼성";
	//접근제한자 private --> 해당 클래스내에서만 접근이 가능하게끔! 접근을 허용할거에용  
	String number = "01023130752";
	
	//기능을 코드로 표현 -->메소드로 만들어주면됨!(기능을따로빼놓는거닌까)
	//메인클래스 외 다른 클래스에서는 메소드를 만들때 static을 안붙여도된다!
	public void call() {
		System.out.println("전화를 걸다");
	}
	public void send() {
		System.out.println("전화를 받다");
	}
	public void game() {
		System.out.println("모바일배그를하다");
	}
}
