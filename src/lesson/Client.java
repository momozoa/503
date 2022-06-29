package lesson;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��϶�.");
		
		String name = sc.next();
		
		// Ŭ���̾�Ʈ��
		Socket s = null;

		try {
			s = new Socket();
			System.out.println("������ �����û");

			s.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("������ ���Ἲ��");

			byte b[] = null;
			String msg = null;

			OutputStream os = s.getOutputStream();

			msg = "Hi Server. I am " + name;
			b = msg.getBytes("UTF-8");
			// ���ڿ��� ����Ʈ�� �����ؼ� �����ϰڴ�.
			os.write(b);
			System.out.println("������ ������ ������ ����");

			InputStream in = s.getInputStream();
			b = new byte[100];
			int r = in.read(b);
			// �޽��� ����Ʈ �迭 �д´�.
			msg = new String(b, 0, r, "UTF-8");
			// ����Ʈ �迭�� ���ڿ��� �ٲ۴�.
			System.out.println("�������� ������ �ޱ� ����");
			System.out.println(msg);

			in.close();
			os.close();
			s.close();

		} catch (Exception e) {
			
		}
		
		sc.close();
	}
}