package lesson;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하라.");
		
		String name = sc.next();
		
		// 클라이언트쪽
		Socket s = null;

		try {
			s = new Socket();
			System.out.println("서버에 연결요청");

			s.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("서버에 연결성공");

			byte b[] = null;
			String msg = null;

			OutputStream os = s.getOutputStream();

			msg = "Hi Server. I am " + name;
			b = msg.getBytes("UTF-8");
			// 문자열을 바이트로 변경해서 전송하겠다.
			os.write(b);
			System.out.println("서버에 데이터 보내기 성공");

			InputStream in = s.getInputStream();
			b = new byte[100];
			int r = in.read(b);
			// 메시지 바이트 배열 읽는다.
			msg = new String(b, 0, r, "UTF-8");
			// 바이트 배열을 문자열로 바꾼다.
			System.out.println("서버에서 데이터 받기 성공");
			System.out.println(msg);

			in.close();
			os.close();
			s.close();

		} catch (Exception e) {
			
		}
		
		sc.close();
	}
}