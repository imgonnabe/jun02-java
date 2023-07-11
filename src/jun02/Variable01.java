package jun02;

/*
 * 변수는 우리가 이미 익숙하게 사용하고 있는 개념
 * 예를 들어 하나의 연산식이 있을 때
 * 1+2=3
 * 3+3=6
 * 8-5=3
 * 
 * 변수를 사용하는 주 목적
 * 같은 타입(type)의 값이 프로그램 실행시에
 * 자주 변경되어야 할 때 이를 변수에 담아서 활용하기 위함
 *
 *변수 선언(초기화) 규칙(!!!!!중요!!!!!)
 *1. 변수는 특정 블럭{} 내부에 어디서건 선언 가능(클래스, 메소드 둘 다 가능)
 *		메소드 바디 내부에서 선언 = 지역(local) 변수
 *		클래스 바디에서 선언 = 인스턴스(instance) 변수
 *		인스턴스 변수는 나중에 객체지향 시간에 배움
 *2. 변수가 처음 선언될 때 반드시 변수의 좌측에
 *		변수 타입(type) 일명 데이터 타입이 선언되어야 한다.
 *3. 변수는 한번 선언되면 그 변수를 포함하고 있는 블럭 내에선
 *		절대 재선언이 불가능하다.
 *4. 같은 타입의 변수는 한 라인에 ; 없이 계속 선언 가능
 *		각 변수는 ,로 구분하며 마지막에 ;를 붙입니다.
 *5. 지역변수는 반드시 사용 전에 초기화 되어야 한다.
 */

public class Variable01 {
	// int num = 100;//인스턴스 변수 = 클래스 아래 작성
	public static void main(String[] args) {
		{
			int num = 1000;// 가능
		}
		// System.out.println(num);//에러
		int num = 100;// 지역 변수 = 메소드 속에서 생성
		num = 10;// 활용할 때는 변수명만 씀
		int num2, num3, num4, num5;// 선언만
		int num6 = 10, num7 = 11, num8 = 12;// 초기화
		System.out.println(num);
		num2 = 5;
		System.out.println(num2);
		System.out.println(num6);
		// 지역변수는 초기화 후 사용할 수 있다.
		// 코드 정렬: ctrl+shift+f
		// 복사: ctrl+shift+↓
		String str="1";
		num2= Integer.parseInt(str);
		System.out.println(num2);
		{
			// int num = 1000;//에러
		}
		// int num = 105;//에러
	}

	public static void print() {
		int num = 100;// 가능
	}

}
