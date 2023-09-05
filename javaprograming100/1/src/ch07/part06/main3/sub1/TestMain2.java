package ch07.part06.main3.sub1;

public class TestMain2 {
	public static void main(String[] args) {

		Class<TypeA> clazz1 = TypeA.class;
		System.out.println("클래스정보 1 ::: " + clazz1);

		TypeA typeA = new TypeA();
		Class<? extends TypeA> clazz2 = typeA.getClass();
		System.out.println("클래스정보 2 ::: " + clazz2);

		/** 문자열로 된 정식 클래스명을 이용하여 Class 타입 객체생성 */
		try {
			Class clazz3 = Class.forName("ch07.part06.main3.sub1.TypeA");
			System.out.println("클래스정보 3 ::: " + clazz3);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
