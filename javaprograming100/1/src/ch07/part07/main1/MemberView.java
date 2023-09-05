package ch07.part07.main1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JTable;

public class MemberView extends JFrame {
	public MemberView() {

		/** 화면 사이즈 설정 */
		this.setSize(300, 300);

		/** 테이블 자료 */
		MemberVo member1 = new MemberVo("a001", "강감찬");
		MemberVo member2 = new MemberVo("a002", "이순신");
		MemberVo member3 = new MemberVo("a003", "홍길동");

		TableGroup<MemberVo> tableGroup = new TableGroup<MemberVo>(new MemberVo[] { member1, member2, member3 },
				MemberVo.class);

		/** 화면에 추가하기 */
		this.add(tableGroup.getTablePanel());

		/** 화면에 보이기 */
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new MemberView();
	}
}