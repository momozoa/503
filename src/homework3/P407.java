package homework3;

import java.util.ArrayList;
import java.util.Iterator;

class Member {

	private int memberId;
	private String memberName;

	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다";
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (this.memberId == member.memberId)
				return true;
			else
				return false;
		}
		return false;
	}
}

class MemberArrayList {

	private ArrayList<Member> arrayList;

	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}

	public void addMember(Member member) {
		arrayList.add(member);
	}

	public boolean removeMember(int memberId) {

		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}

		Iterator<Member> ir = arrayList.iterator();
		while (ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				arrayList.remove(member);
				return true;
			}
		}

		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}

	public void showAllMember() {
		for (Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}

public class P407 {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberMo1 = new Member(101, "모모1");
		Member memberMo2 = new Member(102, "모모2");
		Member memberMo3 = new Member(103, "모모3");
		Member memberMo4 = new Member(104, "모모4");
		
		memberArrayList.addMember(memberMo1);
		memberArrayList.addMember(memberMo2);
		memberArrayList.addMember(memberMo3);
		memberArrayList.addMember(memberMo4);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberMo4.getMemberId());
		memberArrayList.showAllMember();
	}
}
