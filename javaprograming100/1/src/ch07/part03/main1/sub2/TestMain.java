package ch07.part03.main1.sub2;

import java.util.Arrays;

/*
내부 클래스를 설명하는 코드
(static 내부 클래스는 outer 클래스의 객체 여부와 상관없이 사용가능할때 사용)
 */

public class TestMain {
	public static void main(String[] args) {

		/** 품목 공통정보 조회 */
		String[] headerInfo = ProductVo.TableInfo.HEADER_INFO;
		int[] widthInfo = ProductVo.TableInfo.WIDTH_INFO;

		System.out.println(Arrays.toString(headerInfo));
		System.out.println(Arrays.toString(widthInfo));
	}
}
