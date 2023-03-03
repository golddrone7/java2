package assignment13;

import java.util.List;

public class MemberController {
	public MemberController() {
	}
	
	public void getMemberList() {
		MemberDao dao = new MemberDao();
		List<MemberEntity> list=dao.getMemberList();
		MemberView view = new MemberView();
		view.getMemberList(list);
	}
	
	public void getMember(String name) {
		MemberDao dao = new MemberDao();
		MemberEntity mem = dao.getMember(name);
		MemberView view = new MemberView();
		view.getMember(mem);
	}
	
	public void insertMember(MemberEntity entity) {
		MemberDao dao = new MemberDao();
		int n = dao.insertMember(entity);
		MemberView view = new MemberView();
		view.insertMember(n);
	}
	
	public void deleteMember(String name) {
		MemberDao dao = new MemberDao();
		int n = dao.deleteMember(name);
		MemberView view = new MemberView();
		view.deleteMember(n);
		
		
	}
	
	
}
