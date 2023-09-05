package ch14.part02.main1;

import java.lang.Thread.State;
import java.util.Map;

public class TestMain {
	public static void main(String[] args) {

		/** ThreadGroup 객체생성 */
		ThreadGroup threadGroup = new ThreadGroup("threadGroup");

		/** Thread1 정의 및 객체생성 */
		Thread thread1 = new Thread(threadGroup, "thread1"){
			public void run(){
				/** 쓰레드 내에서 print() 함수 실행 */
				print();
				try {
					/** 1000밀리초(1초) 동안 대기하기 */
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

    /** print()와 thread1.start() 로직 순서를 바꿀 경우 동시작업이 진행되는 것을 확인할 수 있다. */
		print(); /** 메인쓰레드 내에서 print() 함수 실행 */
		thread1.start(); /** thread1 쓰레드 시작하기 */
	}

	public static void print(){

		Thread thread = Thread.currentThread();

		ThreadGroup threadGroup = thread.getThreadGroup();
		String groupName = threadGroup.getName();
		int activeCount = threadGroup.activeCount();
		int activeGroupCount = threadGroup.activeGroupCount();

		String name = thread.getName();
		int priority = thread.getPriority();
		State state = thread.getState();
		int activeCount2 = Thread.activeCount();

		System.out.println(
			name + "\t ThreadGroup groupName [" + groupName + "]");
		System.out.println(
			name + "\t ThreadGroup activeCount ["  + activeCount + "]");
		System.out.println(
			name + "\t ThreadGroup activeGroupCount ["  + activeGroupCount + "]");

		System.out.println(name + "\t Thread name [" + name + "]");
		System.out.println(name + "\t Thread priority [" + priority + "]");
		System.out.println(name + "\t Thread state [" + state + "]");
		System.out.println(name + "\t Thread activeCount2 ["  + activeCount2 + "]");

	}
}