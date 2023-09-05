package ch07.part05.main1;

/*
파라미터에 따른 제네릭 타입의 차이는 설명하는 코드
 */

public class TestMain {
	public static void main(String[] args) {

		/** TypeB 객체생성 - method1(), method2() 함수사용 */
		TypeB b = new TypeB(); /** TypeB 객체생성 */
		String method1 = b.method1("테스트1");
		String method2 = TypeB.method2("테스트2");
		System.out.println(method1);
		System.out.println(method2);
		System.out.println();


		/** TypeA 객체생성 - 제네릭 타입 사용 → 제네릭 타입 반환 */
		/** 파라미터에 제네릭 타입이 들어감 */
		TypeA<String> a1 = new TypeA<String>("1");
		String t1 = a1.getT();
		String method3 = b.method3(a1);
		String method4 = TypeB.method4(a1);
		System.out.println(t1);
		System.out.println(method3);
		System.out.println(method4);
		System.out.println();


		/** TypeA 객체생성 - 제네릭 타입 사용안함 → Object 타입 반환 */
		TypeA a2 = new TypeA("2");
		Object t2 = a2.getT();
		Object method6 = b.method3(a2);
		Object method5 = TypeB.method4(a2);
		System.out.println(t2);
		System.out.println(method6);
		System.out.println(method5);

	}
}