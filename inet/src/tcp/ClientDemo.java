package tcp;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import java.io.OutputStream;

/** * @author  作者 E-mail: 
    * @date 创建时间：2015年11月25日 下午8:51:45 
    * @parameter  
*/
public class ClientDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//客户端发数据到服务端
		/*
		 * Tcp传输，客户端建立的过程。
		 * 1，创建tcp客户端socket服务。使用的是Socket对象。
		 * 		建议该对象一创建就明确目的地。要连接的主机。 
		 * 2，如果连接建立成功，说明数据传输通道已建立。
		 * 		该通道就是socket流 ,是底层建立好的。 既然是流，说明这里既有输入，又有输出。
		 * 		想要输入或者输出流对象，可以找Socket来获取。 
		 * 		可以通过getOutputStream(),和getInputStream()来获取两个字节流。
		 * 3，使用输出流，将数据写出。 
		 * 4，关闭资源。 
		 */
		
		//创建客户端
		Socket socket =new Socket("112.23.67.161",10002);
		//建立输出流
		OutputStream out =socket.getOutputStream();
		//使用输出流 将数据写出
		out.write("nihaoa".getBytes());
		//关闭资源
		socket.close();
		
		
		
		
		
	}

}
