package jun02;
//과수원 경영

/*
 * 키우는 과일은 사과, 배, 오렌지
 * 각각 하루 생산량은 5,7,5개
 * 위 값을 기준으로 하루에 총 생산되는 과일의 수를 출력, 하루를 기준으로 시간당 몇 개의 과일이 생산되는지 출력
 * 
 * 예) 총 생산 개수: 17
 * 	   시간당 생산 개수: 0.7083333
 * 
 * 최대한 많은 변수를 만들어서 해야한다.
 * 반드시 한번의 리터럴과 캐스팅을 활용
 * 평균 변수는 모두 float타입으로 선언.
 */

public class DataType03 {
	public static void main(String[] args) {
		int apple, pear, orange, total;
		float avg;
		apple = 5;
		pear = 7;
		orange = 5;
		total = apple + pear + orange;
		avg = (float) total / 24f;
		avg = (float) (total / 24.0);// int/double=double
		avg = (float) total / 24;
		// avg=(float)total/ 24.0; //24.0은 double타입
		// 계산에서 서로 다른 타입이 계산되면 최고 큰 타입으로 변환이 일어난다.
		System.out.println("총 생산 개수: " + total);
		System.out.println("시간당 생산 개수: " + avg);
		// +기호
		// 숫자+숫자=계산
		// 문자+숫자=연결

	}

}
