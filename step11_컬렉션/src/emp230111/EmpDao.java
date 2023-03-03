package emp230111;

import java.util.ArrayList;
import java.util.List;

/*
					(DAO)
	프로그램	<-함수->	DB접근 개체	<-함수->	데이터베이스
	
	DAO(data access object)
	데이터 베이스에서 데이터를 가지고 오거나 저장하는 용도로 사용하는 객체

*/
public class EmpDao {
	
	List<EmpVO> list = null; // null로 선언하기
	
	public EmpDao() {
		list = new ArrayList<>();
		list.add(new EmpVO("뽀로로", "개발부", 10000000));
		list.add(new EmpVO("크롱", "영업부", 20000000));
		list.add(new EmpVO("패티", "개발부", 10000000));
	}
	
	
	public List<EmpVO> getEmpList() {
		return list;
	}


	public EmpVO getEmp(String name) {
//		1, 2는 같은 표현
//		--------------------2
		for(EmpVO vo : list) {
			if(vo.getEname().equals(name))
				return vo;
		}
		return null;
		
//		--------------------1
//		EmpVO vo = null;
//		for(EmpVO vo2 :list) {
//			if(vo2.getEname().equals(name))
//				vo = vo2;
//		}
//		return vo;
	}
	
}
