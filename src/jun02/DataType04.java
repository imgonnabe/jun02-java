package jun02;

//문자형, 논리형
/*
 * 문자형: 한글자만 저장
 * 문자 하나를 저장하기 위한 타입
 * 반드시 값으로는 문자 하나만 존재해야 하며 하나 이상일 경우엔 String(문자열)에 저장한다.
 * char 타입은 정수 타입이다.
 * 
 *  크기는 음수가 없는 2byte의 범위를 가진다.(0~65,535)
 *  
 *  문자값을 표현할 때는 반드시 홀따옴표를 이용
 *  정수타입이기 때문에 int에 프로모션된다.
 *  int값 또한 문자로 변경될 수 있다.(cast)
 */
public class DataType04 {
	public static void main(String[] args) {
		char ch = '가';// 문자열"", 캐릭터''
		ch = 'A';
		ch = '家';
		ch = '\ub059';// 유니코드 표기, 아스키 코드
		System.out.println(ch);

		String str = ch + "";// 연결 캐릭터+문자열
		System.out.println(str);
		// 0 1 2 3 4
		str = "안녕하세요";
		// 문자열 자르기 -> char타입으로 나온다.
		ch = str.charAt(0);
		System.out.println(ch);

		ch = '9';
		System.out.println(ch);
		int num=33;
		ch=(char)num;
		System.out.println(num);
		System.out.println(ch);
		
		ch=57;
		System.out.println(ch);
		ch=(char)(ch+9);
		System.out.println(ch);
		
		for (int i=65; i<91; i++) {
			System.out.println((char)i);
		}
		
/*
 * 10진수 2진수
 *   0     0
 *   1     1=1비트
 *   2     10
 *   3     11
 *   4    100
 *   5    101
 *   7    111=3비트
 *   10  1010=4비트
 */
	}

}
