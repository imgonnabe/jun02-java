package jun02;

public class Test {
	public static void main(String[] args) {
		int num9 = 1;
		System.out.println("첫번째: " + num9);// 1
		int num10 = num9--;
		//        1     2
		System.out.println("두번째: " + num9);// 0
		System.out.println("두번째: " + num10);// 1

		int num11 = num9-- + --num9;
		//        3     4  2  1
		System.out.println("세번째: " + num9);// -2
		System.out.println("세번째: " + num10);// 1
		System.out.println("세번째: " + num11);// -2

		num10 = num9--;
		System.out.println("네번째: " + num9);//-3
		System.out.println("네번째: " + num10);// -2
	}

}
