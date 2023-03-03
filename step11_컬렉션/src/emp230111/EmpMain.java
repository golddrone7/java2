package emp230111;

import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		EmpDao dao = new EmpDao();
		System.out.println("***** 모든 사원 출력하기 *****");

		List<EmpVO> list = dao.getEmpList();

		for (EmpVO ob : list) {
			System.out.print("이름 : " + ob.getEname());
			System.out.print("\t부서 : " + ob.getDept());
			System.out.println("\t급여 : " + ob.getSalary());
		}

		System.out.println("***** 크롱 사원 출력하기 *****");

		EmpVO em = dao.getEmp("크롱");
		// 찾는 사람이 없습니다.
		// 이름 : 크롱 부서 : 영업부 급여 : 200000

		if (em!= null) {

			System.out.print("이름 : " + em.getEname());
			System.out.print("\t부서 : " + em.getDept());
			System.out.println("\t급여 : " + em.getSalary());
		} else {
			System.out.println("찾는 사람이 없습니다.");
		}
		
		
	}

}
