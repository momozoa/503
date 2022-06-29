package homework;

import java.io.FileReader;
import java.io.IOException;

public class P536 {

	public static void main(String[] args) {

		try(FileReader fr = new FileReader("P536.txt")){
			int i;
			while( (i = fr.read()) != -1){
				System.out.print((char)i);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}