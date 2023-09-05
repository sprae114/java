package ch07.part07.main4.sub7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** @Price 어노테이션 정의 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
@Repeatable(Prices.class)  /** 배열속성으로 사용할 @Prices 타입을 명시 */
public @interface Price {

	/** @Price 속성 정의 - 환율, 통화, 통화명 */
	public double value();			/** 환율 */
	public String currency();		/** 통화 */
	public String currencyName();	/** 통화명 */
}