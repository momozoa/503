package homework2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q06 {
	public static void main(String[] args) {
		// 6. Scanner�� �Է� ���� �̸�(���ڿ�), id(���ڿ�)�� 
		//   �� �ٸ��� ����(test02.txt)�� �����ض�.
		//   ���׸��� �Է��ϸ� ������Ѷ�. 
		//   ���׸��� �Է��ϱ� �������� ���ڿ��� ���Ͽ� �����ض�.
		// (break, FileWriter ���)
		// ���� ���) ȫ�浿 hong
		//          �̱浿 lee
		//          �׸�
		Scanner s = new Scanner(System.in);
		
		try(FileWriter fw = new FileWriter("test02.txt")) {
			while(true) {
				System.out.println("�̸�, ���̵� �Է��϶�. (����: �׸�)");
			
				String name = s.next();
				if (name.equals("�׸�")) break;

				String id = s.next();
				
				fw.write(name + " " + id + "\n");
			}
		} catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("����");
	}
}
