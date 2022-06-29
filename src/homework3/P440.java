package homework3;

import java.util.HashMap;
import java.util.Iterator;

class MemberHashMap {

	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap()
	{
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member){
		
		hashMap.put(member.getMemberId(), member);
		
	}
	
	public boolean removeMember(int memberId){
		
		if(hashMap.containsKey(memberId)){
			hashMap.remove(memberId);
			return true;
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember(){
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while (ir.hasNext()){
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}	
		System.out.println();
	}
}

public class P440 {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberMo1 = new Member(101, "모모1");
		Member memberMo2 = new Member(102, "모모2");
		Member memberMo3 = new Member(103, "모모3");
		Member memberMo4 = new Member(104, "모모4");
		
		memberHashMap.addMember(memberMo1);
		memberHashMap.addMember(memberMo2);
		memberHashMap.addMember(memberMo3);
		memberHashMap.addMember(memberMo4);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(104);
		memberHashMap.showAllMember();
	}

}
