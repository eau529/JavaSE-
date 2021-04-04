/**
 * <p>Title: Server.java</p>  
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
import java.net.ServerSocket;
import java.net.Socket;

/**  
 * 服务器类，客户端需要连接到此服务器
 *  
 */
public class Server {
	/*
	 * ServerSocket：
	 * 		其职责：  1、申请服务端的端口号
	 * 				2、是用来监听给定的端口有没有对应的客户端连接，
	 * 				如果监听到有 客户端连接，
	 * 				其会自动创建一个socket和客户端进行通信
	 */
	private ServerSocket server;
	
	public Server() {
		try {
			//第一步： 1.1  初始化ServerSocket
			server = new ServerSocket(8089);
			System.out.println("服务器创建成功。。。");
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

//	 服务器开始运行的方法
	public void start() {
		try {
			while(true) {
				//第一步： 1.2  让服务器一直监听8089端口
				System.out.println("等待客户端连接中。。。。。");
				/*
				 * server.accept()
				 *   该方法为 ServerSocket提供的阻塞方法，
				 *   用于一直监听客户端的连接，如果有客户端连接
				 *   则创建一个对应的Socket 与 客户端进行通话
				 */
				Socket socket= server.accept();
				System.out.println("有客户端连接。。。。。");
				
				/*
				 * 第二步：2.1 通过Socket提供getInputStream()
				 * 		  获取对应的字节输入流，实现获取客户端发送的字节数据
				 */
				InputStream is=socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is,"utf-8");
				BufferedReader read = new BufferedReader(isr);
				String message = read.readLine();
				System.out.println(message);
				
				/*
				 * 第二步：2.2通过Socket提供的 getOutputStream()
				 * 		  获取字节输出流，向客户端发送数据
				 */
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out,"utf-8");
				PrintWriter writer = new PrintWriter(osw,true);
				writer.println("客户端你好，收到你的消息。。。");
				
			}
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}
	
	
}
