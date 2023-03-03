package assignment11;

import java.util.Calendar;

/*
﻿[문제 51]오늘의 금전운세 만들기 
        Calendar, Math 또는 Random클래스를 이용하여 다음 프로그램을 완성하시오
(1) Calender클래스를 이용해서 오늘 날짜를 구하시오
(2) 오늘의 금전운은 0~100사이의 난수를 발생해서 만드시오

[결과화면]
2020년 7월 3일 당신의 금전운은 95%입니다

*/
public class Test51 {
	public static void main(String[] args) {
		int luck = (int)(Math.random() * 101);
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		int date = today.get(Calendar.DATE);
		System.out.println(year+"년 "+(month+1)+"월 "+date+"일 당신의 금전운은 "+luck+"%입니다");
	}
}
