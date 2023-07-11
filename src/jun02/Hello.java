package jun02;

public class Hello {
	//메인메소드는 반드시 이 모양
	public static void main(String[] args) {		        
		System.out.println("Hi");
			int number;//변수 선언
			number = 100;//변수에 값 대입
	        
			int num = 101;//변수 선언 + 값대입 == 변수 초기화
			//리터럴 = 고정된 값
			//1+2 == 3
			
			//3.14
			double num1 = 3.14;//
			
			String num2 = "Hello";//문자열""
			//대입기호 기준으로 양변의 데이터 타입이 동일해야 한다.
			
			int num3 = num;
			num1=3.333;
			num3=(int) 3.333;//형변환 = 데이터타입 변환
			//cast = 값의 절삭
			System.out.println(num3);
			
			int iNumber = 14;
			double dNumber = iNumber;//자동대입 = 프로모션
			//왼쪽 변이 더 큰타입이라 int가 자동 대입된다.
			
			System.out.println(dNumber);//14.0
			
			
	}
}

//변수: 변하는 수 <-> 상수: 변하지 않는 수(파이)
//프로그램이 진행할 때 중간의 값을 저장해두기 위한 공간
//데이터타입 변수이름; = 변수 선언 = 명령어
