package ch07.part07.main1;

import javax.swing.JFrame;
import javax.swing.JTable;

public class ProductView extends JFrame {
	public ProductView() {

		/** 화면 사이즈 설정 */
		this.setSize(300, 300);

		/** 테이블 자료 */
		ProductVo product1 = new ProductVo("a001", "아메리카노", 4000);
		ProductVo product2 = new ProductVo("a002", "까페라떼", 4300);
		ProductVo product3 = new ProductVo("a003", "까페모카", 4500);

		TableGroup<ProductVo> tableGroup = new TableGroup<ProductVo>(new ProductVo[] { product1, product2, product3 },
				ProductVo.class);

		/** 화면에 추가하기 */
		this.add(tableGroup.getTablePanel());

		/** 화면에 보이기 */
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new ProductView();
	}
}