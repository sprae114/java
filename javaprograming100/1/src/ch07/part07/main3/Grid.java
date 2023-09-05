package ch07.part07.main3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)	/** 어노테이션 적용범위 */
@Target({ ElementType.FIELD }) 		/** 어노테이션 적용대상 */
public @interface Grid {			/** @interface : 어노테이션 타입 정의 */


	/** 속성 name, width, order 정의 */
	public String name();
	public int width();
	public int order();

}