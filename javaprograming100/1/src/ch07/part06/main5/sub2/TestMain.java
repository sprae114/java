package ch07.part06.main5.sub2;

import java.lang.reflect.Field;

import ch07.part06.main5.sub1.TypeA;

public class TestMain {
	public static void main(String[] args) {
		try {
			/** 1. Class 객체호출 */
			Class clazz = TypeA.class;
			/** 2. Test 객체생성 */
			Object obj = clazz.newInstance();
			/** 3. 속성명 name과 일치하는 Field 객체호출 */
			Field nameField = clazz.getDeclaredField("name");
			/** 4. name 속성에 접근 여부 조회 */
			boolean accessible = nameField.canAccess(obj);
			/** 5. name 속성에 접근 가능하도록 설정 */
			nameField.setAccessible(true);
			/** 6. name 속성값 조회 */
			Object fieldObj = nameField.get(obj);
			System.out.println("변경 전 name 속성값 ::: " + fieldObj);
			/** 7. name 속성값 "테스트2"로 변경 */
			nameField.set(obj, "테스트2");
			/** 8. name 속성값 다시 조회 */
			Object fieldObj2 = nameField.get(obj);
			System.out.println("변경 후 name 속성값 ::: " + fieldObj2);
			/** 9. name 속성에 접근 여부 원래대로 설정 */
			nameField.setAccessible(accessible);

		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
}