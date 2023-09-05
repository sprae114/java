package ch07.part07.main4.sub3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
public @interface Anno1 {

	public String name();

	/** String 타입 */
	public int value();

	/** 기본형 int 타입 */
	public Child child();

	/** 어노테이션 타입 */
	public DataType dataType(); /** enum 타입 */

}