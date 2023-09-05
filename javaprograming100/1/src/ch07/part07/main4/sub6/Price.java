package ch07.part07.main4.sub6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
@Repeatable(Prices.class)
public @interface Price {

	public double value();			/** 환율 */
	public String currency();		/** 통화 */
	public String currencyName();	/** 통화명 */
}
