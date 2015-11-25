package UDPDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/** * @author  作者 E-mail: 
    * @date 创建时间：2015年11月25日 下午7:18:35 
    * @parameter  
*/
public class UDPSend {
    public static void main(String [] args) throws IOException{
    	//创建端口
    	System.out.println("我来也");
    	DatagramSocket ds =new DatagramSocket();
    	//获取键盘输入 并打包
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
