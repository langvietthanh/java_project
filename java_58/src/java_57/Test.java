package java_57;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;



public class Test {
	public static void main(String[] args) {
		// System.currentTimeMillis() Ham lay thoi gian hien tai
		
//		long t1 = System.currentTimeMillis();
//		
//		for(int i=0;i<1000000;i++)System.out.println("ccl");
//		
//		long t2 = System.currentTimeMillis();
//		
//		System.out.println(t1); // thoi gian truoc khi chay vong for
//		
//		System.out.println(t2); // thoi gian sau khi chay vong for
//		
//		System.out.println(t2-t1 + " mls"); // thoi gian chay (tinh theo milisecond)
//		
//		System.out.println((t2-t1)/1000 + " s"); // thoi gian chay (tinh theo second)
		
		// TimeUnit.X.4toY: convert X to Y
		System.out.println("1 day =  " + TimeUnit.DAYS.toMinutes(1) + " Minutes");
		// 1 day =  140 Minutes
		
		// Date
		Date date1 = new Date(System.currentTimeMillis());
		System.out.println(date1.getDay() + "/" + (date1.getMonth() + 1) + "/" + (date1.getYear() + 1900) ); 
		// chu y: month lấy mốc từ 0 nên phải cộng 1
		// year lấy mốc từ 121 nên phải cộng 1900
		
		// Calendar
		Calendar date2 = Calendar.getInstance();
		System.out.println(date2.get(Calendar.DATE) + "/" +( date2.get(Calendar.MONTH) + 1 )+ "/" + date2.get(Calendar.YEAR) + "\nTime: " + date2.get(Calendar.HOUR)+":"+date2.get(Calendar.MINUTE)+":"+(date2.get(Calendar.SECOND))); 
		
		date2.add(Calendar.DATE, 1 ); 
		System.out.println(date2.get(Calendar.DATE) + "/" +( date2.get(Calendar.MONTH) + 1 )+ "/" + date2.get(Calendar.YEAR));
		
		System.out.println(date2.get(Calendar.DAY_OF_WEEK)); // ngày trong tuần tính từ chủ nhật là ngày thứ nhất
		
		DateFormat df = new SimpleDateFormat();
		System.out.println(df.format(System.currentTimeMillis()));
			
		df = new SimpleDateFormat("yyyy-MM-dd, HH:mm:ss");
		System.out.println(df.format(System.currentTimeMillis()));
	}
}
