package pr;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

class Book {
	public Book(String b_name, String B_id, int id) {
		this.b_name = b_name;
		this.B_id = B_id;
		this.id = id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getB_id() {
		return B_id;
	}
	public void setB_id(String b_id) {
		B_id = b_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	String b_name;
	String B_id;
	int id;
}


public class test {

		public static void main(String[] args) {
		
		//Scanner sc = Scanner(System.in);
		//int n = sc.nextInt();
			
		
		int year = 2022;
		int month = 8;
		int day = 12;
//		Calendar myCalendar = new GregorianCalendar(year, month, dayOfMonth);
//
//		int dayOfWeek = myCalendar.get(Calendar.DAY_OF_WEEK);
//		
		Calendar cl = Calendar.getInstance();
		cl.set(month, day, year);
		int dd = cl.getFirstDayOfWeek();
		String a[] = {"Monday","Tuesday", "Wednesday","Thursday", "Friday", "Satuday", "Sunday"};
		//System.out.println(a[dd+2]);
		
		
		
//		Date date = new Date(day, month, year);
//		
//		System.out.println(a[(date.getDay())]);
//		System.out.println(date.getDay());
//		
//		//System.out.println(" "+cl.toString().charAt(4));
//		
		LocalDate ld = LocalDate.of(year, month, day);
		
		DayOfWeek dw = DayOfWeek.from(ld);
		
		System.out.println(dw.name());
		
		//String da = dw.toString();
		
//		int t = cl.DAY_OF_WEEK;
//		System.out.println(t);
//		
		
		
		//System.out.println(a[(int)da]);
		
		//LocalDate c_date = java.time.LocalDate.now();
		//int date = c_date.getDayOfYear();
		
		//System.out.println(c_date);
		
		
//		BigDecimal b111 = new BigDecimal(3/6);
//		
//		System.out.println(b111);
//		
//		ArrayList<Book> ab =new ArrayList<Book>();
//	
//		Book b = new Book("Java:OOPS","By Vijaya Bhasker",001);
//		ab.add(b);
//		//Book b1 = new Book();
//
//		List<List<Integer>> ls = new ArrayList<List<Integer>>();
//	    
		
	}

}
