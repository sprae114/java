package ch07.part02.main7;

public class SingletonType {
	private static SingletonType type = null;

	private SingletonType(){ }

	public static SingletonType getInstance() {
		if (type == null)
			type = new SingletonType(); // 객체생성
		return type;
	}
}
