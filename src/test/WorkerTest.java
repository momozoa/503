package test;

import java.util.HashMap;
import java.util.Scanner;

class Worker {
	private int id;
	private String name;
	private String dept;
	private String addr;
	private String birth;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	Worker(int id, String name, String dept, String addr, String birth) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.addr = addr;
		this.birth = birth;
	}

	public String toString() {
		return "이름: " + name + "\n부서: " + dept + "\n주소: " + addr +"\n생일: " + birth + "\n";
	}
}

class WorkerBook {
	Scanner s = new Scanner(System.in);
	HashMap<Integer, Worker> workers =new HashMap<Integer, Worker>();

	void addWorker() {
		while(true) {
			System.out.println("사번");
			int id = s.nextInt();
			
			System.out.println("이름");
			String name = s.next();

			System.out.println("부서");
			String dept = s.next();
			
			System.out.println("주소");
			String addr = s.next();
			
			System.out.println("생일");
			String birth = s.next();
			
			Worker wk = new Worker(id, name, dept, addr, birth);
			
			if(workers.containsKey(id)) {
				System.out.println("아이디 " + wk.getId() + "은 이미 있다");
			} else {
				workers.put(id, wk);
				System.out.println("사원 정보가 입력되었다.");
				break;
			}
		}
	}

	void findWorker() {
		System.out.println("검색하고자 하는 사원의 사번은?");
		int id = s.nextInt();
		
		if (workers.containsKey(id)) {
			Worker wk = workers.get(id);
			System.out.println(wk);
		} else {
			System.out.println("없는 사원입니다.");
		}
	}

	void end() {
		System.out.println("프로그램 종료");
		System.exit(0);
	}
}

public class WorkerTest {
	public static void main(String[] args) {
		
		WorkerBook wb = new WorkerBook();
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("<사원 정보 관리 프로그램>");
			System.out.println("1. 사원정보 입력");
			System.out.println("2. 사원정보 개별 조회");
			System.out.println("3. 프로그램 종료");

			int select = s.nextInt();
			switch(select) {
				case 1:
					wb.addWorker();
					break;
				case 2 :
					wb.findWorker();
					break;
				case 3:
					wb.end();
					break;
			}
		}
	}
}