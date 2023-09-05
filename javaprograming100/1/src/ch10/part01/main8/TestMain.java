package ch10.part01.main8;

public class TestMain {
	public static void method1() throws Exception {
		throw new Exception("method1 예외발생 테스트");
	}

	public static void method2() {
		try {
			method1();
		} catch (Exception e) {
			/** 개발 시 일반적으로 처리되는 소스 */
			// e.printStackTrace();

			/** 콘솔에 저장되는 내용을 String으로 저장하기 */
			String errMessage = "";

			String name = e.getClass().getName();
			String message = e.getMessage();
			errMessage += name + " : " + message + "\r\n";

			StackTraceElement[] stackTrace = e.getStackTrace();
			for (StackTraceElement s : stackTrace) {
				String className = s.getClassName(); // 클래스정보
				String methodName = s.getMethodName(); // 함수정보
				String fileName = s.getFileName(); // 파일정보
				int lineNumber = s.getLineNumber(); // 라인정보

				errMessage += "\t at " + className + "." + methodName;
				errMessage += "(" + fileName + ":" + lineNumber + ")\r\n";

			}
			/** 해당 에러정보를 DB 또는 파일에 저장하면 된다. */
			System.err.println(errMessage);
		}
	}

	public static void main(String[] args) {
		method2();
	}
}
