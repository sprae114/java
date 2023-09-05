
package ch12.part04.main7;

import java.util.HashMap;
import java.util.Set;

/** 상속을 이용한 클래스 정의 */
public class ParameterMap extends HashMap<String, Object> {

	/** 해당 Key를 입력 시 String 타입의 결과 값을 반환 */
	public String getString(String key){
		Object object = get(key);
		if(object==null) return null;
		return object.toString();
	}

	/** 해당 Key와 클래스 객체를 입력 시 해당 클래스 타입의 결과 값을 반환 */
	public <T> T get(String key, Class<T> clazz){
		return (T) get(key);
	}

	/** 해당 타입에 대한 정보를 제공하기 위한 함수 */
	public String getInfo(String title){

		String msg = "\r\n============================\r\n";
		msg +=	"【 "+title + " 파라미터 정보 】\r\n";
		msg += "----------------------------\r\n";
		Set<String> keySet = this.keySet();
		for(String s : keySet){
			Object obj = get(s);
			msg += "\t" + s + "\t:\t" + obj+"\r\n";
		}
		msg += "============================\r\n";
		return msg;
	}
}
