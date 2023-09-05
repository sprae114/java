package ch09.part01.main8;

import javax.swing.JFrame;

/** JFrame 상속 */
public class ProductView extends JFrame {
	/** 생성자함수 */
	public ProductView() {

		/** 타이틀설정 → 크기설정 → 위치설정 → visible true */
		this.setTitle("제품 관리 화면");
		this.setSize(400, 300);
		this.setLocation(200, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		ProductView view = new ProductView();
	}
}
