package ch19.part02.main3.sub2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestMain {

	public static void main(String[] args) {

    	/** 문자 리스트 생성 */
		List<String> strings = Arrays.asList("a", "", "j", "k", "j");

    	/** 숫자 리스트 생성 */
		List<Integer> numbers = Arrays.asList(3, 7, 6, 8, 2, 4, 1);

		/** 값이 없는 요소 제외 : filter() */
		Stream<String> filter = strings.stream().filter(s -> !s.isEmpty());
		System.out.print("filter() : ");
		filter.forEach(item -> System.out.print(item + "  "));
		System.out.println();

		/** 값이 2보다 큰 값만 출력 : filter() */
		Stream<Integer> filter2 = numbers.stream().filter(i -> i > 2);
		System.out.print("filter() : ");
		filter2.forEach(item -> System.out.print(item + "  "));
		System.out.println();

		/** 값이 없는 요소 제외하고 중복값 제거 : distinct() */
		Stream<String> distinct = strings.stream().distinct().filter(s -> !s.isEmpty());
		System.out.print("distinct() : ");
		distinct.forEach(item -> System.out.print(item + "  "));
		System.out.println();

		/** 기본정렬 : sorted() */
		Stream<Integer> sorted = numbers.stream().sorted();
		System.out.print("sorted() : ");
		sorted.forEach(item -> System.out.print(item + "  "));
		System.out.println();

		/** Comparator 익명함수 람다식으로 정렬 : sorted() */
		Stream<String> sorted2
			= strings.stream().distinct().sorted((s1,s2) -> s1.compareTo(s2));
		System.out.print("sorted() : ");
		sorted2.forEach(item -> System.out.print(item + "  "));
		System.out.println();

		/** 스트림에서 요소 2개만 반환 : limit() */
		Stream<String> limit = strings.stream().limit(3);
		System.out.print("limit() : ");
		limit.forEach(item -> System.out.print(item + "  "));
		System.out.println();

		/** 스트림에서 앞에서 2개 제외하고 반환 : skip() */
		Stream<String> skipStream = strings.stream().skip(2);
		System.out.print("skip() : ");
		skipStream.forEach(item -> System.out.print(item + "  "));
		System.out.println();

		/** 두 개의 스트림을 하나의 스트림으로 결합 : concat() */
		Stream<String> stream1
			= strings.stream().distinct().filter(item -> !item.isEmpty());
		Stream<String> stream2 = Arrays.asList("m", "j").stream();
		Stream<String> concat = Stream.concat(stream1, stream2);
		System.out.print("concat() : ");
		concat.forEach(item -> System.out.print(item + "  "));
		System.out.println();

		/** 길이가 4자 이상, 중복 제거한 배열에 aaa를 합친 문자열 반환: map()*/
		Stream<String> map2
			= strings.stream().distinct().filter(s -> s.length() > 0).map(s -> s.concat("##"));
		System.out.print("map() : ");
		map2.forEach(item -> System.out.print(item + "  "));
		System.out.println();

		/** 2차원 배열을 단일 스트림으로 반환 : flatMap() */
		String[][] str2 = new String[][] {{"a","b"}, {"c","d"}, {"e","b"}};
		Stream<String> flatMap =
        Stream.of(str2).flatMap(array -> Arrays.stream(array));
		System.out.print("flatMap() : ");
		flatMap.forEach(item -> System.out.print(item + "  "));
		System.out.println();

	}
}
