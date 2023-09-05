package ch18.part03.main1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Date;

public class UdpServer {
	public static void main(String[] args) throws IOException {
		/** 서버실행 */
		new UdpServer().doServer();
	}

  /** 클라이언트가 발신한 자료를 받아서 시간정보를 추가한 후 다시 해당 클라이언트 자료전송을 하기 위한 함수이다. */
	public void doServer(){
		try {
			/** 서버의 포트를 12345로 지정함 */
			DatagramSocket ds = new DatagramSocket(12345);

			/** 수신 작업 쓰레드 객체생성 및 실행시작 */
			new Thread(){
				public void run(){
					byte[] by = new byte[65535];

					/** 자료수신을 위한 패킷생성 */
					DatagramPacket dp = new DatagramPacket(by, by.length);
					while(true){
						try {
							/** 소켓으로 들어오는 자료수신하며 수신할 때까지 대기 */
							ds.receive(dp);

							/** 외부로 전송할 자료구성 */
							String data = new String(dp.getData(),0, dp.getLength());
							Date date = new Date(System.currentTimeMillis());
							String msg = data + "\t" + date;

							/** 외부로 전송할 패킷생성 - 목적지정보 필요 */
							DatagramPacket dp2
								= new DatagramPacket(msg.getBytes()
															, msg.getBytes().length, dp.getSocketAddress());
							/** 외부로 자료 전송 */
							ds.send(dp2);
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}.start();
		} catch (SocketException e) { e.printStackTrace(); }
	}
}