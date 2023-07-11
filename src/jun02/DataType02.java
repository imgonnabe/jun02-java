package jun02;

//데이터 타입
/*
 * 프로그램에서 변수, 상수에 값을 담기 위해서는 반드시 그 값의 타입에 맞는 변수를 사용해야 한다.
 * 이를 데이터 타입이라고 한다.
 * 
 * 데이터 타입은 크게 R타입(Reference Type, 참조 타입)과 P타입(Primitive Type, 기본 타입)이 있다.
 * P타입 이외에는 R타입
 * 
 * P타입(기본 타입)은 다시 분류된다.
 * 각 타입마다 메모리 크기가 엄격하게 제한된다.
 * 정수 타입
 * 		byte
 * 		short
 * 		int(기본타입)
 * 		long
 * 
 * 실수 타입
 * 		float
 * 		double(기본타입)
 * 
 * 문자 타입 = 글자 한글자 = A, 가
 * 		char
 * 		
 * 논리 타입 = true 참/false 거짓
 * 		boolean
 */
class Apple {

}

public class DataType02 {
	// 파일명과 동일한 클래스 앞에 public을 붙인다.
	// 접근제어자
	public static void main(String[] args) {
		byte bNumber = (byte) -129;// -128~ 0~ 127
		System.out.println(bNumber);
		/*
		 * 프로모션: 변수를 대입할 때 작은 타입을 큰 타입에 대입하는 형태 = 자동 대입 캐스트
		 * 캐스팅: 큰 타입을 작은 타입에 대입할 때
		 * 범위를 초과하므로 반드시 해야하는 연산 (type)을 명기해서 값을 대입시킨다. 이 때 주의할 점은 상위 비트를 대입되는
		 * 타입에 맞게 잘라내기 때문에 값의 변화가 올 수 있다.
		 */
		short sNum = (short) (32767 + 1);//-32768 ~ 32767
		// int iNum = (int)2147483648;//기본타입이라서 에러
		int iNum = 2147483647;
		iNum = Integer.MAX_VALUE;
		System.out.println(iNum);
		iNum = Integer.MIN_VALUE;
		System.out.println(iNum);
		// final int: 수정불가

		// long lNum=9223372036854775807;//int타입 범위 넘어감
		long lNum = 9223372036854775807L;
		System.out.println(lNum);

		System.out.println(Long.MIN_VALUE);

		iNum = (int) lNum;
		System.out.println(iNum);

		float fNum = 3.14F;// 표식자
		System.out.println(fNum);
		double dNum = fNum;
		System.out.println(dNum);
		iNum = (int) fNum;
		System.out.println(iNum);
		// 정수보다 실수를 더 큰수로 인식
		lNum = (long) fNum;
		System.out.println(lNum);
		// 크기순서
		// byte<short<int<long<float<double
		

	}

}
