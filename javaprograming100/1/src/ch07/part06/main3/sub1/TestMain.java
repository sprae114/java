package ch07.part06.main3.sub1;

public class TestMain {
	public static void main(String[] args) {
		
		try {
			Class.forName("ch07.part06.main3.sub1.TypeA");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}






