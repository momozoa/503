package lesson;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		// ������
		ServerSocket ser = null;
		Socket so = null;

		try {
			ser = new ServerSocket(); // 1.�������� ����
			ser.bind(new InetSocketAddress("localhost", 5001));
			// 2.�������ϰ� ���������� ����� ip�ּҿ� ��Ʈ��ȣ

			System.out.println("=====���� ������ ���� �Ǳ⸦ ��ٸ�");
			

			while (true) {
				so = ser.accept();
				// 3.�����û�� �����ϸ鼭 ���� �����Ѵ�.
				byte b[] = null;
				String msg = null;

				// �о���δ�!!!!
				InputStream in = so.getInputStream();
				b = new byte[100];
				int r = in.read(b);
				// �޽��� ����Ʈ �迭 �д´�.
				msg = new String(b, 0, r, "UTF-8");
				// ����Ʈ �迭�� ���ڿ��� �ٲ۴�.
				System.out.println("Ŭ���̾�Ʈ�κ��� ������ �ޱ� ����");
				System.out.println(msg);

				OutputStream os = so.getOutputStream();
				msg = "Hi Client";
				b = msg.getBytes("UTF-8");
				// ���ڿ��� ����Ʈ�� �����ؼ� �����ϰڴ�.
				os.write(b);
				System.out.println("Ŭ���̾�Ʈ�� ������ ������ ����");

				os.close();
				in.close();
				//so.close();
				//ser.close();
			}
		} catch (Exception e) {
			
		}

	}
}