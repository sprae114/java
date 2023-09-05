package ch09.part01.main1;

import java.lang.reflect.Field;

public class DefaultVo {
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();

		/** Class 객체생성 */
		Class<? extends DefaultVo> clazz = this.getClass();
		sb.append(clazz.getName() + " 정보");

		/** Field 객체생성 */
		Field[] declaredFields = clazz.getDeclaredFields();

		for (Field f : declaredFields) {
			if (f != null) {

				/** 【절차1】 전역변수명 조회 */
				String name = f.getName();
				String desc = "";
				/** 【절차2】 Annotation Grid 객체생성 */
				Desc anno = f.getDeclaredAnnotation(Desc.class);
				if (anno != null) {
					/** 필드 항목명 조회 */
					desc = anno.name();
				}

				/** 전역변수의 값 */
				String value = "";
				try {
					/** 【절차3】 필드값을 읽기 위해서는 접근권한이 있어야 한다. */
					boolean accessible = f.isAccessible();
					f.setAccessible(true);
					/** 필드의 값을 읽어오기 */
					Object obj = f.get(this);
					if (obj != null) {
						value = obj.toString();
					}
					f.setAccessible(accessible); /** 원래대로 복원 */
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
				sb.append("\r\n\t" + name + " = " + value + "  [" + desc + "]");

			}
		}
		return sb.toString();
	}
}