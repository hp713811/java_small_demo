package UDPDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/** * @author  ���� E-mail: 
    * @date ����ʱ�䣺2015��11��25�� ����7:32:27 
    * @parameter  
*/
public class DUPrece {

	public static void main(String[] args) throws IOException {
     
		System.out.println("��Ҫ������");
		DatagramSocket ds =new DatagramSocket(10000);
		while(true){
		
		byte [] buf=new byte[1024];
		DatagramPacket dp =new DatagramPacket(buf,buf.length);
		
		ds.receive(dp);
		
		String ip=dp.getAddress().getHostAddress();
		int port =dp.getPort();
		String data =new String(dp.getData(),0,dp.getLength());
		System.out.println(ip+""+data);	
		}
//		ds.close();
	}
         
}
