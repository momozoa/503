package homework3;

import java.util.HashSet;

class Student {
	
	String name;
	String id;

	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(id);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.id == std.id) 
				return true;
			else 
				return false;
		}
		return false;
	}

	@Override
	public String toString() {
		return id +":"+name;
	}
}

public class P446 {

	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<Student>( );
		
		set.add(new Student("100", "ȫ�浿"));
		set.add(new Student("200", "������"));
		set.add(new Student("300", "�̼���"));
		set.add(new Student("400", "�����"));
		set.add(new Student("100", "���߱�"));
		
		System.out.println(set);
	}

}
