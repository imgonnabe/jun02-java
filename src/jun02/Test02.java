package jun02;

public class Test02 {
	public static void main(String[] args) {
		//2진법
		//1010
		//1011 > 1010
		System.out.println(10&11);//둘다 1이어야 1
		//1010
		//1011 > 1011
		System.out.println(10|11);//둘중 하나만 1이어도 1
		//1010
		//1011 > 0001
		System.out.println(10^11);//겹치지 않는 것만 1
	}

}
