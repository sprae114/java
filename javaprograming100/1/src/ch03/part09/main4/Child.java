package ch03.part09.main4;

/** 상속한다는 개념은 A의 모든 접근가능한 구성요소를 갖는다는 뜻이다.
 *  - 『extends』를 이용하여 상속을 받는다.
 *  - 상속은 1개의 클래스만 가능하다.
 *  - 상속이 표시되지 않은 클래스는 모두 java.lang.Object 클래스를 상속한다.
 */
public class Child extends Parent {  /** Child 클래스는 Parent 클래스를 상속함 */

    /** 부모함수의 재정의 - 로직내용을 변경함 */
    public void testMethod2(){
        System.out.println("testMethod2 함수호출-override!!!");
    }


    /** 오류 발생 – final 때문에 해당 함수를 override 할 수 없음
     *  - 부모가 가지고 있는 함수를 그대로 사용해야 함
     *  - 에러를 없애고 테스트하려면 아래 함수를 주석처리 해야 한다.
     */
//    public final void testMethod3(){
//        System.out.println("testMethod3 함수호출-override");
//    }
}