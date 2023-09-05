package ch14.part01.main2.sub1;

/** Thread 클래스 상속 */
public class MyThread extends Thread {

	private String msg;
	private int interval;
	public MyThread(String msg, int interval) {
			this.msg = msg;
			this.interval = interval;
	}

	/** run() 함수 재정의 */
	public void run(){
			for(int i = 0; i<3; i++){
				try {
					Thread.sleep(interval);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(msg);
			}
	}
}