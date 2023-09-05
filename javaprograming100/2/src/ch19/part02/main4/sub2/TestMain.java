package ch19.part02.main4.sub2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMain {

	public static void main(String[] args) {

    /** 문자 데이터 리스트 생성 */
		List<String> strings = Arrays.asList("aaa", "", "bbb", "CCC", "bbb");

    /** 숫자 데이터 리스트 생성 */
		List<Integer> numbers = Arrays.asList(3, 7, 6, 8, 2, 4, 1);

		/** 스트림 개수 : count() */
		long count = numbers.stream().count();
		System.out.println("count() : " + count);

		/** 최대값 : max() */
		Optional<Integer> max = numbers.stream().max(Integer::compare);
		System.out.println("max() : " + max.get());

		/** 최소값 : min() */
		Optional<Integer> min = numbers.stream().min(Integer::compare);
		System.out.println("min() : " + min.get());

		/** 첫 번째 값 : findFirst() */
		Optional<String> findFirst
			= strings.stream().filter(s -> s.contains("b")).findFirst();
		System.out.println("findFirst() : " + findFirst.get());

		/** 빈 값이 아닌 요소 중 순서에 상관없이 일치하는 값 하나 반환 : findAny() */
		Optional<String> findAny
			= strings.stream().filter(s -> !s.isEmpty()).findAny();
		System.out.println("findAny() : " + findAny.get());

		/** 'a'로 시작하는 요소가 하나라도 있는지 여부 반환(부분매치) : anyMatch() */
		boolean anyMatch = strings.stream().anyMatch(s -> s.startsWith("a"));
		System.out.println("anyMatch() : " + anyMatch);

		/** 'a'로 시작하는 요소가 있는지 여부 반환(전체매치) : allMatch() */
		boolean allMatch = strings.stream().allMatch(s -> s.startsWith("a"));
		System.out.println("allMatch() : " + allMatch);

		/** 'D'로 시작하는 요소가 없는지 여부 반환 : noneMatch() */
		boolean noneMatch = strings.stream().noneMatch(s -> s.startsWith("D"));
		System.out.println("noneMatch() : " + noneMatch);

		/** 스트림의 모든 요소를 배열로 반환 : toArray() */
		String[] array = strings.stream().toArray(String[]::new);
		System.out.println("toArray() : " + Arrays.toString(array));

		/** 스트림 숫자의 합을 구한다. : reduce() */
		Integer reduce1 = numbers.stream().reduce(0, Integer::sum);
		System.out.println("reduce() : " + reduce1);

		/** 스트림 요소를 Set(Collection)으로 반환 : collect() */
		Set<String> collect1 = strings.stream().collect(Collectors.toSet());
		System.out.println("collect() : " + collect1);

		/** 스트림 요소를 List(Collection)으로 반환 : collect() */
		List<String> collect2 = Stream.of("a","b","c").collect(Collectors.toList());
		System.out.println("collect() : " + collect2);
	}
}