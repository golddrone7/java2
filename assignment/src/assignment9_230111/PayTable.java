package assignment9_230111;

import java.text.NumberFormat;

public class PayTable extends Salary implements Calculate, Output {
	
	
	PayTable(String name, long pay, int family, int overtime) {
		super(name, pay, family, overtime);
		setCount(getCount()+1);
	}

	public void title() {
		System.out.println("\t\t\t\t\t**** 급여명세서 ****");
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("이름      기본급    가족수     가족수당      시간외근무      시간외수당   세금     인센티브(%)  성과금      실수령액");
		System.out.println("------------------------------------------------------------------------------------------------------");
	}
	public void footer() {
		System.out.println("인원수 : " + count );
	}

	@Override
	public void out() {
	    NumberFormat fmt1 = NumberFormat.getCurrencyInstance();												
		System.out.println(getName()+"   "+fmt1.format(getPay())+"원    "+getFamily()+"     "+fmt1.format(getFamily_p())	+"원     "+getOvertime()+"         "+fmt1.format(getOvertime_p())+"원  "+fmt1.format(getTax())+"원     "+getIncentive()+"     "+fmt1.format(getIncen_p())+"원   "+fmt1.format(getTotal_pay())+"원");
	
	}

	@Override
	public void calc() {
		if(getFamily()<3)
			setFamily_p(getFamily()*20000);
		else
			setFamily_p(60000);
		
		setOvertime_p(getOvertime()*5000);
		setTax((int)(getPay()*0.1));
		setIncen_p((int)(getPay()*getIncentive()));
		setTotal_pay(getPay() + getFamily_p() + getIncen_p() + getOvertime_p() - getTax());
		
	}
}
