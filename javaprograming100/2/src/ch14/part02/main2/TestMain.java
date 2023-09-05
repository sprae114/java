package ch14.part02.main2;

public class TestMain {
	public static void main(String[] args) {

		Thread thread1 = new Thread("thread1"){
			public void run(){ print(6); 	} /** thread1 쓰레드 */
		};

		/** 【1】 데몬설정 */
		thread1.setDaemon(true);
		thread1.start();

		Thread thread2 = new Thread("thread2"){
			public void run(){	print(4); }  /** thread2 쓰레드 */
		};

		/** 【2】 데몬설정 */
		thread2.setDaemon(true);
		thread2.start();

		print(2);  /** main 쓰레드 */
	}

	public static void print(int count){
		Thread thread = Thread.currentThread();
		for(int i = 0; i<count; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(thread.getName()+" [ " + (i+1) + " ]");
		}
	}
}