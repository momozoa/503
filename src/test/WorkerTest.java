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
		return "�̸�: " + name + "\n�μ�: " + dept + "\n�ּ�: " + addr +"\n����: " + birth + "\n";
	}
}

class WorkerBook {
	Scanner s = new Scanner(System.in);
	HashMap<Integer, Worker> workers =new HashMap<Integer, Worker>();

	void addWorker() {
		while(true) {
			System.out.println("���");
			int id = s.nextInt();
			
			System.out.println("�̸�");
			String name = s.next();

			System.out.println("�μ�");
			String dept = s.next();
			
			System.out.println("�ּ�");
			String addr = s.next();
			
			System.out.println("����");
			String birth = s.next();
			
			Worker wk = new Worker(id, name, dept, addr, birth);
			
			if(workers.containsKey(id)) {
				System.out.println("���̵� " + wk.getId() + "�� �̹� �ִ�");
			} else {
				workers.put(id, wk);
				System.out.println("��� ������ �ԷµǾ���.");
				break;
			}
		}
	}

	void findWorker() {
		System.out.println("�˻��ϰ��� �ϴ� ����� �����?");
		int id = s.nextInt();
		
		if (workers.containsKey(id)) {
			Worker wk = workers.get(id);
			System.out.println(wk);
		} else {
			System.out.println("���� ����Դϴ�.");
		}
	}

	void end() {
		System.out.println("���α׷� ����");
		System.exit(0);
	}
}

public class WorkerTest {
	public static void main(String[] args) {
		
		WorkerBook wb = new WorkerBook();
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("<��� ���� ���� ���α׷�>");
			System.out.println("1. ������� �Է�");
			System.out.println("2. ������� ���� ��ȸ");
			System.out.println("3. ���α׷� ����");

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