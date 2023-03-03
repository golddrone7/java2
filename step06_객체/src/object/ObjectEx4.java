package object;

/*
	사원이름 : 진달래
	근무부서 : 개발부
	급여 : 1500000
	입사점수 : 87.54점
*/
public class ObjectEx4 {
	public static void main(String[] args) {
		Employee em = new Employee();
		em.setEmployee("진달래", "개발부",1500000, 87.54);
//		System.out.printf("이름은 %s이고 %s에 근무하며 급여는 %d원 입사성적은 %.2f입니다."
//				,em.getName(), em.getDept(), em.getPay(), em.getScore());
		System.out.println("사원이름 : " + em.getName());
		System.out.println("근무부서 : " + em.getDept());
		System.out.println("급여 : " + em.getPay()+"원");
		System.out.printf("입사점수 : %.2f점\n" , em.getScore());		
//		System.out.println(em.toString());
	}
}
