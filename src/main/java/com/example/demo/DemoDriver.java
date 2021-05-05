package com.example.demo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoDriver implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		
		
	    String date = args[0]; // in ISO format yyyy-MM-dd
	    System.out.println("input date: " + date);
	    
		System.out.println("givenDateAndEnvUsingCalendar: " + givenDateAndEnvUsingCalendar(date)); 
		
		System.out.println("givenDateAndEnvUsingWeekFields: " + givenDateAndEnvUsingWeekFields(date)); 
		
		
	}
	    
	    public int givenDateAndEnvUsingCalendar(String dateStr) throws ParseException {
	    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	    	Date date = format.parse (dateStr);  
	    	Calendar calendar = Calendar.getInstance();
	    	calendar.setTime(date);
	    	return calendar.get(Calendar.WEEK_OF_YEAR);
	    }
	    
	    public int givenDateAndEnvUsingWeekFields(String dateStr) {
	    	LocalDate date = LocalDate.parse(dateStr);
		    Locale locale = Locale.getDefault();
	        return date.get(WeekFields.of(locale).weekOfYear());
	    }

}
