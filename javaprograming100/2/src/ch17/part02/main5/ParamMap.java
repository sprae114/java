package ch17.part02.main5;

import java.util.HashMap;
import java.util.List;

/** ParamMap은 키를 String 타입으로 받기 위해 다음과 같이 제네릭스를 지정함
    - HashMap<String, Object>
*/
public class ParamMap extends HashMap<String,Object> {

	/**  키의 값을 부여 시 해당 값을 String 타입으로 반환하는 함수 */
	public String getString(String key){
		Object object = get(key);
		// null이 아닐 경우에만 toString() 함수를 이용하여 반환
		if(object!=null){ return object.toString(); }
		return null;
	}

	/** 키의 값을 부여 시 해당 값을 Integer 타입으로 반환하는 함수 */
	public Integer getInteger(String key){
		Object object = get(key);
 		// Integer.parseInt() 함수를 이용하며 오류발생 시 그대로 오류발생시킴
		if(object!=null ){ 	return Integer.parseInt(object.toString()); 	}
		return null;
	}

	/** 키의 값을 부여 시 해당 값을 List 타입으로 반환하는 함수 */
	public List getList(String key){

		Object object = get(key);
		// null이 아니며, List 타입일 경우 반환
		if(object!=null && object instanceof List){ return (List) object; }
		return null;
	}

	/** 키의 값을 부여 시 해당 값을 자기자신 타입으로 반환하는 함수 */
	public ParamMap getParamMap(String key){
		Object object = get(key);
		// null이 아니며 ParamMap 타입의 경우 반환
		if(object!=null && object instanceof ParamMap){
			return (ParamMap) object;
		}
		return null;
	}

  /** 키의 값과 클래스 타입을 부여 시 해당 값을 명시한 클래스 타입으로 동적으로 반환하는 함수
      - 반환타입은 제네릭스 타입 <T>를 정의하여 명시함
		*/
	public <T> T getType(String key, Class<T> clazz){
		Object object = get(key);
    /**
      	▶ clazz.isAssignableFrom(object.getClass())
        • clazz의 object의 클래스타입과 같거나 상위타입의 경우 true 반환
		*/
		if(object!=null && clazz.isAssignableFrom(object.getClass()) ){
			return (T) object;
		}
		return null;
	}
}