package ch07.part07.main1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableGroup<T extends DefaultVo> {

	private JScrollPane pane = new JScrollPane();

	public TableGroup(T[] array, Class<T> clazz) {

		/** @Grid 어노테이션을 사용한 필드의 수를 계산 */
		Field[] fields = clazz.getDeclaredFields();
		int count = 0;
		for (Field f : fields) {
			/** 해당 필드에 @Grid가 없을 경우 annotation 객체가 null */
			Grid annotation = f.getAnnotation(Grid.class);
			if (annotation != null) {
				count++;
			}
		}

		/** 필드에 접근하여 @Grid가 있는 필드는 모두 헤더정보 배열과 Field정보 배열에 담는다. */
		String[] headerInfo = new String[count]; /** 헤더정보 */
		Field[] headerField = new Field[count]; /** 필드정보 */
		int index = 0;
		for (Field f : fields) {
			boolean accessible = f.isAccessible();
			f.setAccessible(true);
			/** 해당 필드의 @Grid 어노테이션 객체를 호출, 없을 경우 null임 */
			Grid annotation = f.getAnnotation(Grid.class);
			if (annotation != null) {
				/** @Grid(name="속성값")의 속성값을 조회하기 위한 코드 */
				String name = annotation.name();
				headerInfo[index] = name;
				headerField[index] = f;
				index++;
			}
			f.setAccessible(accessible);
		}

		Object[][] data = new Object[0][];
		if (array != null) {
			data = new Object[array.length][];
			int index2 = 0;
			for (T t : array) {
				Object[] datum = new Object[count];
				int index3 = 0;
				for (Field f : headerField) {

					boolean accessible = f.isAccessible();
					f.setAccessible(true);

					try {
						/** 개별 객체의 전역변수의 값을 조회 */
						datum[index3] = f.get(t);
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
					f.setAccessible(accessible);
					index3++;
				}
				data[index2] = datum;
				index2++;
			}
		}

		/** 테이블 만들기 */
		JTable table = new JTable(data, headerInfo);
		pane.setViewportView(table);
	}

	public JScrollPane getTablePanel() {
		return pane;
	}
}