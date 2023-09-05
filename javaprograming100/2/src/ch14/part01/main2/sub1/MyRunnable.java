package ch14.part01.main2.sub1;

/** Runnable 구현 */
public class MyRunnable implements Runnable {

private String msg;
	private int interval;
	public MyRunnable(String msg, int interval) {
		this.msg = msg;
		this.interval = interval;
	}

	/** run() 추상메소드 구현 */
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