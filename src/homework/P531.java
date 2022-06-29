package homework;

import java.io.FileOutputStream;
import java.io.IOException;

public class P531 {

	public static void main(String[] args) throws IOException {

		try (FileOutputStream fos = new FileOutputStream("P531.txt", true)) {

			byte[] bs = new byte[26];
			byte data = 65;
			for (int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}

			fos.write(bs);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
}