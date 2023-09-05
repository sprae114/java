package ch20.part02.main3;

import java.math.BigInteger;

public class TestMain {
	public static void main(String[] args) {
		BigInteger big = new BigInteger("123456789123456789");

		BigInteger add = big.add(BigInteger.ONE);
		System.out.println(add); 					//→ 【결과】 123456789123456790

		BigInteger divide = big.divide(BigInteger.valueOf(1000000));
		System.out.println(divide); 				//→ 【결과】 123456789123

		BigInteger subtract = big.subtract(BigInteger.valueOf(5000000));
		System.out.println(subtract); 				//→ 【결과】 123456789118456789

		BigInteger multiply = big.multiply(BigInteger.ZERO);
		System.out.println(multiply); 				//→ 【결과】 0
	}
}
