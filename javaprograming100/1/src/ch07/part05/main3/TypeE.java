package ch07.part05.main3;


// 프로그램 실행 시 주석부분을 제거하여 다음과 같이 나타내시오
/**

publc class TypeE <T extends TypeA<U>> {

}

*/
public class TypeE /** <T extends TypeA<U>> */ {  // ☞ 오류발생

}