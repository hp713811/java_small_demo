package tcp;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import java.io.OutputStream;

/** * @author  ���� E-mail: 
    * @date ����ʱ�䣺2015��11��25�� ����8:51:45 
    * @parameter  
*/
public class ClientDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//�ͻ��˷����ݵ������
		/*
		 * Tcp���䣬�ͻ��˽����Ĺ��̡�
		 * 1������tcp�ͻ���socket����ʹ�õ���Socket����
		 * 		����ö���һ��������ȷĿ�ĵء�Ҫ���ӵ������� 
		 * 2��������ӽ����ɹ���˵�����ݴ���ͨ���ѽ�����
		 * 		��ͨ������socket�� ,�ǵײ㽨���õġ� ��Ȼ������˵������������룬���������
		 * 		��Ҫ���������������󣬿�����Socket����ȡ�� 
		 * 		����ͨ��getOutputStream(),��getInputStream()����ȡ�����ֽ�����
		 * 3��ʹ���������������д���� 
		 * 4���ر���Դ�� 
		 */
		
		//�����ͻ���
		Socket socket =new Socket("112.23.67.161",10002);
		//���������
		OutputStream out =socket.getOutputStream();
		//ʹ������� ������д��
		out.write("nihaoa".getBytes());
		//�ر���Դ
		socket.close();
		
		
		
		
		
	}

}
