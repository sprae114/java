package ch17.part02.main5;

import java.util.ArrayList;
import java.util.List;
import ch17.part02.main4.sub2.DatabaseUtil;

public class DBClient {

	/** 단일자료 조회를 위한 selectOne() 함수 정의 1 */
	public static ParamMap selectOne(String query, List<String> param)
																												throws Exception{
		System.out.println("쿼리:"+query);
		System.out.println("파라미터:"+param);

		if(query==null) return null;

		/** List<String> → String[] 전환 및 데이터베이스 조회작업 */
		String[] arr = null;
		if(param!=null){
			arr = new String[param.size()];
			param.toArray(arr);
		}
		List<String[]> executeQuery = DatabaseUtil.executeQuery(query, arr);

		/** 헤더는 paramMap의 키(key)로 자료는 값(value)으로 자료를 구성 */
		ParamMap paramMap = new ParamMap();
		if(executeQuery!=null && executeQuery.size()==2){
			String[] headers = executeQuery.get(0);
			String[] data = executeQuery.get(1);
			for(int i = 0; i<headers.length; i++){
				paramMap.put(headers[i], data[i]);
			}
			return paramMap;
		}
		return null;
	}

	/** 단일자료 조회를 위한 selectOne() 함수 정의 2 */
	public static ParamMap selectOne(String query) throws Exception{
		return selectOne(query, null);
	}

	/** 목록조회를 위한 selectList() 함수 정의 1 */
	public static List<ParamMap> selectList(String query, List<String> param)
																												throws Exception{

		System.out.println("쿼리:"+query);
		System.out.println("파라미터:"+param);

		if(query==null) return null;

		/** List<String> → String[] 전환 및 데이터베이스 조회작업 */
		String[] arr = null;
		if(param!=null){
			arr = new String[param.size()];
			param.toArray(arr);
		}
		List<String[]> executeQuery = DatabaseUtil.executeQuery(query, arr);

		/** 헤더는 paramMap의 키로 자료는 값으로 자료를 구성 */
		if(executeQuery!=null){
			String[] headers = executeQuery.get(0);

			/** 해당 자료 결과를 반환하기 위한 타입정의 */
			List<ParamMap> list = new ArrayList<ParamMap>();
			for(int i = 1; i<executeQuery.size(); i++){
				ParamMap paramMap = new ParamMap();
				String[] data = executeQuery.get(i);
				for(int j = 0; j<headers.length; j++){
					paramMap.put(headers[j], data[j]);
				}
				list.add(paramMap);
			}
			return list;
		}
		return null;
	}

	/** 목록조회를 위한 selectList() 함수 정의 2 */
	public static List<ParamMap> selectList(String query) throws Exception{
		return selectList(query, null);
	}

	/** 등록(INSERT)을 위한 insert() 함수 정의 1 */
	public static int insert(String query, List<String> param) throws Exception{
		return write(query, param);
	}

	/** 등록(INSERT)을 위한 insert() 함수 정의 2 */
	public static int insert(String query) throws Exception{
		return write(query, null);
	}

	/** 수정(UPDATE)을 위한 update() 함수 정의 1 */
	public static int update(String query, List<String> param) throws Exception{
		return write(query, param);
	}

	/** 수정(UPDATE)을 위한 update() 함수 정의 2 */
	public static int update(String query) throws Exception{
		return write(query, null);
	}

	/** 삭제(DELETE)를 위한 delete() 함수 정의 1 */
	public static int delete(String query, List<String> param) throws Exception{
		return write(query, param);
	}

	/** 삭제(DELETE)를 위한 delete() 함수 정의 2 */
	public static int delete(String query) throws Exception{
		return write(query, null);
	}

	/** 등록, 수정, 삭제 함수를 공통으로 사용하기 위한 private 함수 */
	private static int write(String query, List<String> param) throws Exception{
		System.out.println("쿼리:"+query);
		System.out.println("파라미터:"+param);

		if(query==null) return -1;

		String[] arr = null;
		if(param!=null){
			arr = new String[param.size()];
			param.toArray(arr);
		}
		return DatabaseUtil.executeUpdate(query, arr);
	}
}