package assignment13;

import java.util.List;

public class MemberView {

	public void getMemberList(List<MemberEntity> list) {
		if(list.size()!=0) {
			for(MemberEntity mem : list) {
				System.out.print(mem.getName()+"\t");
				System.out.println(mem.getPhone());
			}
		} else {
			System.out.println("조회할 데이터가 없습니다.");
		}
	}

	public void insertMember(int n) {
		if(n>0)
			System.out.println(n+"건의 데이터가 추가되었습니다.");
		else
			System.out.println("데이터 추가에 실패했습니다.");
	}

	public void getMember(MemberEntity mem) {
		if(mem!=null) {
			System.out.print(mem.getName()+"\t");
			System.out.println(mem.getPhone());
		} else {
			System.out.println("조회할 데이터가 없습니다.");
		}
	}

	public void deleteMember(int n) {
		if(n>0)
			System.out.println(n+"건의 데이터가 삭제되었습니다.");
		else
			System.out.println("삭제할 데이터가 없습니다.");
	}	
}
