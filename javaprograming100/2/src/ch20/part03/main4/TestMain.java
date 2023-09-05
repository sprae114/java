package ch20.part03.main4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestMain {
	public static void main(String[] args) {
		Date now = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(now));   //→ 【결과】 2018년 9월 30일 일요일

		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df.format(now));  //→ 【결과】 2018년 9월 30일 (일)

		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(df.format(now));  //→ 【결과】 2018. 9. 30

		df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(df.format(now));   //→ 【결과】 18. 9. 30

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));  //→ 【결과】 2018-09-30

		sdf = new SimpleDateFormat("E MMM dd HH:mm:ss", Locale.UK);
		System.out.println(sdf.format(now));  //→ 【결과】 Sun Sep 30 19:02:28

		sdf = new SimpleDateFormat("오늘은 올해 D번째 날");
		System.out.println(sdf.format(new Date())); //→ 【결과】 오늘은 올해 273번째 날
	}
}
