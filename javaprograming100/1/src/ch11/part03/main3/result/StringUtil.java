package ch11.part03.main3.result;

public class StringUtil {
	/** equalsOr() 공통처리함수 정의 */
	public static boolean equalsOr(String target, String ... compare){
		if(target == null || compare == null) return false;
		for(String s : compare){
			if( target.equals(s)) { return true; }
		}
		return false;
	}
}