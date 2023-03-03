package workshop12;

import java.util.Calendar;
import java.util.Date;

public class ConvertDate {
	
	public String convert(Date date, int type) {
		String[] yoil = new String[]{"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		if(type==1)
			return (date.getYear()+1900)+"-0"+(date.getMonth()+1)+"-"+date.getDate();
		else if(type==2)
			return (date.getYear()-100)+"년 " + (date.getMonth()+1)+"월 " + date.getDate() +"일 " +yoil[calendar.get(Calendar.DAY_OF_WEEK)-1];
		else
			return (date.getYear()+1900)+"-0"+(date.getMonth()+1)+"-"+date.getDate() + " " + calendar.get(Calendar.HOUR_OF_DAY)+":"+calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND) + " " + (calendar.get(Calendar.HOUR_OF_DAY) >=12 ? "오후" : "오전"  ) ;
	}
}

