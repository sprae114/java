package ch08.part02.main3;

public class TypeA {

	/** count 속성 정의 */
	private int count = 0;

	/** getter setter 함수 정의 */
	public void setCount(int count){ this.count = count; }
	public int getCount(){ return count; }

	/** toString() 함수 재정의 */
	public String toString(){ return "count = " + count; }
}
