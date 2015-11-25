package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/** * @author  作者 E-mail: 
    * @date 创建时间：2015年11月25日 下午8:54:31 
    * @parameter  
*/
public class ServerDemo {

	public static void main(String[] args) throws IOException {
//		服务端接收客户端发送过来的数据，并打印在控制台上。 
		/*
		 * 建立tcp服务端的思路：
		 * 1，创建服务端socket服务。通过ServerSocket对象。
		 * 2，服务端必须对外提供一个端口，否则客户端无法连接。
		 * 3，获取连接过来的客户端对象。
		 * 4，通过客户端对象获取socket流读取客户端发来的数据 
		 * 		并打印在控制台上。
		 * 5，关闭资源。关客户端，关服务端。 
		 */
		
		//创建服务端
		ServerSocket ss =new ServerSocket(10002);
		//获取客户端对象
		Socket s=ss.accept();
		String ip =s.getInetAddress().getHostAddress();
		//读取数据
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
