package ch12.part03.main1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestMain {
	public static void main(String[] args) {

		String[] data = {"1","a","e","2","b","b","e","c","d"};

		/** List 성능검사 */
		{
			List<String> list = new ArrayList<String>();
			long time01 = System.currentTimeMillis();
			for(int i = 0; i<10000000; i++){
				for(String s : data){
					if(list.contains(s)==false){
						list.add(s);
					}
				}
			}
			long time02 = System.currentTimeMillis();
			System.out.println("【ArrayList】 걸린시간 = " + (time02-time01));
			System.out.println("\t자료 " + list);
		}

		/**  HashSet 성능검사 */
		{
			Set<String> set01 = new HashSet<String>();
			long time01 = System.currentTimeMillis();
			for(int i = 0; i<10000000; i++){
				for(String s : data){
					set01.add(s);
				}
			}
			long time02 = System.currentTimeMillis();
			System.out.println("【HashSet】 걸린시간 = " + (time02-time01));
			System.out.println("\t자료 " + set01);
		}

		/**  TreeSet 성능검사 */
		{
			Set<String> set01 = new TreeSet<String>();
			long time01 = System.currentTimeMillis();
			for(int i = 0; i<10000000; i++){
				for(String s : data){
					set01.add(s);
				}
			}
			long time02 = System.currentTimeMillis();
			System.out.println("【TreeSet】 걸린시간 = " + (time02-time01));
			System.out.println("\t자료 " + set01);
		}

		/**  LinkedHashSet 성능검사 */
		{
			Set<String> set01 = new LinkedHashSet<String>();
			long time01 = System.currentTimeMillis();
			for(int i = 0; i<10000000; i++){
				for(String s : data){
					set01.add(s);
				}
			}
			long time02 = System.currentTimeMillis();
			System.out.println("【LinkedHashSet】 걸린시간 = " + (time02-time01));
			System.out.println("\t자료 " + set01);
		}
	}
}