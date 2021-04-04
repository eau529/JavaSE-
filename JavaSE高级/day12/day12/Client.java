/**
 * <p>Title: Demo02.java</p>  
 * <p>Description: </p>   
 * <p>Company: www.goktech.cn</p>  
 * @author chenfan  
 * @version 1.0
 */
package day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**  
 * UDP传输协议：不可靠传输协议，
 * 			      不能保证客户端百分之百收到服务器发送的所有数据。
 * 
 * TCP传输协议 ：tcp是面向连接的、可靠的、有序的且字节流形式发送数据的传输协议
 *    tcp在数据通信时，连接通道是会通过“三次握手来建立”
 *    		1、客户端先先发送一个信息给服务器端，表示要连接服务器，
 *    		2、服务器收到 客户端的信息，会返回一个信息给客户端，表示收到它要连接的请求，
 *          3、客户端再一条消息表示能接收到了服务器消息，此连接建立。
 *          
 *          
 * Socket(套接字)
 *     在其底层封装了 Tcp协议，我们通过调用其提供的api就能实现网络通信。
 * 
 */
public class Client {
	private Socket socket;
	static Scanner sc = new Scanner(System.in);
	
	public Client() {
		try {
			System.out.println("开始连接服务器。。。。。");
			/*
			 *第一步：
			 * 	初始化socket，该过程其实就是连接远端服务器的过程，
			 * 	创建Socket对象时，需要传入远程服务器的地址和端口号，
			 *  如果连接失败则抛出异常
			 */
			socket = new Socket("localhost",8089);
			System.out.println("服务器连接成功。。。。");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//客户端开始工作的方法
	public void start() {

		Thread th = new Thread(new ServerHandler());
		th.start();
		
		try {
			/*
			 * 第二步: 2.1 通过socket提供获取字节流的方法实现数据传输
			 *   getOutputStream() 获得socket提供的字节输出流
			 */
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out,"utf-8");
			PrintWriter writer = new PrintWriter(osw,true);
			
			String toServerMessage =null;
			while(true ) {
				toServerMessage = sc.next();
				System.out.println("向服务器说话： ");
				writer.println(toServerMessage);
			}
			
			
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//定义一个内部类来处理  接收服务消息的功能
	public class ServerHandler implements Runnable{
		@Override
		public void run() {
			/*
			 * 第二步：2.2 通过Socket提供getInputStream()
			 * 		  获取对应的字节输入流，实现获取服务器端发送的字节数据
			 */
			InputStream is;
			try {
				is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is,"utf-8");
				BufferedReader read = new BufferedReader(isr);
				String message =null;
				
				while((message=read.readLine())!=null) {
					System.out.println("服务器回给你的消息是： "+message);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	
	public static void main(String[] args) {
		Client client = new Client();
		client.start();
	}
}
