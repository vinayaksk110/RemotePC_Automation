package JavaPrograms;

import java.text.DateFormat;
import java.util.Date;

public class DateChecker {
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		String date2Str = DateFormat.getDateInstance().format(date);
		System.out.println(date2Str);
		
		date2Str = DateFormat.getInstance().format(date);
		System.out.println(date2Str);
	}

}
