package ch07.part07.main4.sub3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
public @interface Anno2 {

	public String[] names();

	/** String 배열 타입 */
	public int[] values();

	/** 기본형 int 배열 타입 */
	public Child[] children();

	/** 어노테이션 배열 타입 */
	public DataType[] dataTypes(); /** enum 배열 타입 */
}