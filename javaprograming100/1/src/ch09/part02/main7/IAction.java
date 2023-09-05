package ch09.part02.main7;

public interface IAction {
	
	/** 1. 추상메소드 정의 */
	public void method1();
	
	/** 2. final static 변수 */
    public String ROOT_TEMP_DIR = "c://tmp";
    public final static String SYSTEM_NAME = "System-type-A";
    
    /** 3. enum 정의 */
    public enum D { TYPE_A, TYPE_B, TYPE_C };
    
    /** 4. default 메소드 */
    default void method2() {
    	System.out.println("\t default 메소드 호출");
    }
    
    /** 5. static 메소드 */
    public static void method3() {
    	System.out.println("\t private static 메소드 호출");
    }
    
    /** 6. private 메소드 호출 */
    private void method4() {
    	System.out.println("\t private 메소드 호출");
    }
    private static void method5() {
    	System.out.println("\t private static 메소드 호출");
    }
    default void method6() {
    	System.out.println("\t private method6() 메소드 호출");
    	method4();
    	System.out.println("\t private static 메소드 호출");
    	method5();
    }
    public static void method7() {
    	System.out.println("\t private static method()");
    	method5();
    }
}
