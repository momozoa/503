package homework;

import java.io.FileWriter;
import java.io.IOException;

public class P538 {

	public static void main(String[] args) {

		try(FileWriter fw = new FileWriter("P538.txt")){
			fw.write('A');
			
			char buf[] = {'B','C','D','E','F','G'};
			fw.write(buf);
			
			fw.write("�ȳ��ϼ���. �� �����׿�");
			fw.write(buf, 1, 2);
			fw.write("65");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}
}
