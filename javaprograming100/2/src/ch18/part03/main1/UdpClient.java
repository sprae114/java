package ch18.part03.main1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpClient {
	public static void main(String[] args) {
		/** 클라이언트 실행 */
		new UdpClient().doClient();
	}

  /** 서버에 1초마다 자료를 보내고 서버로부터 들어오는 정보를 수신하기 위한 함수 */
	public void doClient(){
		try {
			/** 클라이언트 소켓 생성 */
			DatagramSocket ds = new DatagramSocket();

			/** 수신 작업 쓰레드 객체생성 및 실행시작 */
			new Thread(){
				public void run(){
					byte[] by = new byte[65535];

					/** 수신을 위한 패킷생성 */
					DatagramPacket dp = new DatagramPacket(by, by.length);
					while(true){
						try {
							/** 소켓으로 들어오는 자료수신하며 수신할 때까지 대기 */
							ds.receive(dp);
							String data = new String(dp.getData(),0, dp.getLength());
							System.out.println(data); // 콘솔화면에 자료출력
						} catch (IOException e) { e.printStackTrace(); }
					}
				}
			}.start();

			/** 송신작업 쓰레드 객체생성 및 실행시작
         - 1초마다 서버로 자료송신을 하기 위한 로직을 구성함
      */
			new Thread(){
				public void run(){
					while(true){

						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						String msg = "data";
						try {
							/** 외부(서버)로 전송할 패킷생성 - 목적지정보 필요 */
							DatagramPacket dp
								= new DatagramPacket(msg.getBytes(), msg.getBytes().length
																, InetAddress.getByName("localhost"),12345);

							/** 외부(서버)로 자료전송 */
							ds.send(dp);
						}
						catch (UnknownHostException e) { e.printStackTrace(); }
						catch (IOException e) { e.printStackTrace(); }
					}
				}
			}.start();

		} catch (SocketException e) {	e.printStackTrace(); }
	}
}