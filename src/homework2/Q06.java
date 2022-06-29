package homework2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q06 {
	public static void main(String[] args) {
		// 6. Scanner로 입력 받은 이름(문자열), id(문자열)를 
		//   한 줄마다 파일(test02.txt)에 저장해라.
		//   “그만” 입력하면 종료시켜라. 
		//   “그만” 입력하기 전까지의 문자열을 파일에 저장해라.
		// (break, FileWriter 사용)
		// 실행 결과) 홍길동 hong
		//          이길동 lee
		//          그만
		Scanner s = new Scanner(System.in);
		
		try(FileWriter fw = new FileWriter("test02.txt")) {
			while(true) {
				System.out.println("이름, 아이디 입력하라. (종료: 그만)");
			
				String name = s.next();
				if (name.equals("그만")) break;

				String id = s.next();
				
				fw.write(name + " " + id + "\n");
			}
		} catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("종료");
	}
}
