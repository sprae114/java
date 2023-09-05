package ch07.part07.main4.sub7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** @Prices 어노테이션 정의 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Prices {

	/** @Prices value 속성 정의 - @Price 배열 */
	public Price[] value(); /** @Price 배열 */

}