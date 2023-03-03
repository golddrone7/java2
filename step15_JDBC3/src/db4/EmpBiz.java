package db4;

import java.util.List;

public class EmpBiz {

	
	
	public void addressList() {
		EmpDao dao = new EmpDao();
		List<EmpEntity> list=dao.addressList();
		
		EmpView view = new EmpView();
		view.addressList(list);
	}
	
	public void addressInsert(EmpEntity entity) {
		EmpDao dao = new EmpDao();
		int n = dao.addressInsert(entity);
		
		EmpView view = new EmpView();
		view.addressInsert(n);
	}
	public boolean addressSearch(String name) {
		EmpDao dao = new EmpDao();
		EmpEntity entity = dao.addressSearch(name);
		
		EmpView view = new EmpView();
		view.addressSearch(entity);
		
		return entity!=null?true:false;
	}

	public void addressUpdate(String name, String phone, String addr) {
		
		EmpDao dao = new EmpDao();
		int n = dao.addressUpdate(name, phone, addr);
		
		EmpView view = new EmpView();
		view.addressUpdate(n);
		
		
	}

	public void addressDelete(String name) {
		int n=0;
		EmpDao dao = new EmpDao();
		n = dao.addressDelete(name);
		
		EmpView view = new EmpView();
		view.addressDelete(n);
		
		
		
	}
}
