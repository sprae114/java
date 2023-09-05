package ch07.part04.main2;

public enum Gender {
	MAN(1, "남자"), WOMAN(2, "여자");

	/** 【절차5】 public에서 private으로 변경한다. */
	private int value;
	private String name;

	private Gender(int value, String name) {
		this.value = value;
		this.name = name;
	}

	/** 【절차6】 getter 함수 생성 */
	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}
}