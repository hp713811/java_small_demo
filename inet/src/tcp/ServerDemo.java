package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/** * @author  ���� E-mail: 
    * @date ����ʱ�䣺2015��11��25�� ����8:54:31 
    * @parameter  
*/
public class ServerDemo {

	public static void main(String[] args) throws IOException {
//		����˽��տͻ��˷��͹��������ݣ�����ӡ�ڿ���̨�ϡ� 
		/*
		 * ����tcp����˵�˼·��
		 * 1�����������socket����ͨ��ServerSocket����
		 * 2������˱�������ṩһ���˿ڣ�����ͻ����޷����ӡ�
		 * 3����ȡ���ӹ����Ŀͻ��˶���
		 * 4��ͨ���ͻ��˶����ȡsocket����ȡ�ͻ��˷��������� 
		 * 		����ӡ�ڿ���̨�ϡ�
		 * 5���ر���Դ���ؿͻ��ˣ��ط���ˡ� 
		 */
		
		//���������
		ServerSocket ss =new ServerSocket(10002);
		//��ȡ�ͻ��˶���
		Socket s=ss.accept();
		String ip =s.getInetAddress().getHostAddress();
		//��ȡ����
		InputStream in =s.getInputStream();
		byte [] buf =new byte[1024];
		in.read(buf);
		int len =in.read(buf);
		String text =new  String(buf,0,len);
		System.out.println(ip+""+text);
		
		ss.close();
		s.close();
	}

}
