package UDPDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/** * @author  ���� E-mail: 
    * @date ����ʱ�䣺2015��11��25�� ����7:18:35 
    * @parameter  
*/
public class UDPSend {
    public static void main(String [] args) throws IOException{
    	//�����˿�
    	System.out.println("����Ҳ");
    	DatagramSocket ds =new DatagramSocket();
    	//��ȡ�������� �����
    	BufferedReader bufr =new  BufferedReader(new InputStreamReader(System.in));
    	String line =null;
    	while((line=bufr.readLine())!=null){
    		byte[] buf=line.getBytes();
    		DatagramPacket dp =new DatagramPacket(buf,buf.length,InetAddress.getByName("112.23.67.161"),10001);
    		ds.send(dp);
    		if("over".equals(line)){
    			
    			break;
    		}
    		
    	}
    	ds.close();
    
    }
}
