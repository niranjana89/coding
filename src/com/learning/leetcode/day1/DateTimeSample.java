package com.learning.leetcode.day1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class DateTimeSample {

	public static void main(String[] args) {
		/*String input = "Mon Jun 18 00:00:00 IST 2012";
		DateTimeFormatter f = DateTimeFormatter.ofPattern( "E MMM dd HH:mm:ss z uuuu" ).withLocale( Locale.US );
		 
		ZonedDateTime zdt = ZonedDateTime.parse( input , f );
		 
		LocalDate ld = zdt.toLocalDate();
		DateTimeFormatter fLocalDate = DateTimeFormatter.ofPattern( "dd/MM/uuuu" );
		String output = ld.format( fLocalDate) ;
		 
		System.out.println( "input: " + input );
		System.out.println( "zdt: " + zdt );
		System.out.println( "ld: " + ld );
		System.out.println( "output: " + output );*/
		
		
	
		/*try {
			DateFormat originalFormat = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");
			DateFormat targetFormat = new SimpleDateFormat("yyyy-MM-dd z");
			Date date = originalFormat.parse("Mon Aug 21 00:00:00 EST 2012");
			System.out.println(date);
			String formattedDate = targetFormat.format(date);
			System.out.println(formattedDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		 String dtStr = "Mon, 08 Aug 2021 00:00:00 EST";
		 DateFormat formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss Z");
		 DateFormat toFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.getDefault());
		 try {
			System.out.println(formatter.parse(dtStr));
			System.out.println(toFormatter.format(formatter.parse(dtStr)));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		 String[] timeParts = dtStr.split(" ");
//		 TimeZone tz = TimeZone.getTimeZone(timeParts[2]);
//		 int seconds = Math.toIntExact(TimeUnit.MILLISECONDS.toSeconds(tz.getRawOffset()));
//		 ZoneOffset offset = ZoneOffset.ofTotalSeconds(seconds);
//		 timeParts[2]=offset.toString();
//		 
//		 System.out.println(timeParts[0]+" "+timeParts[1]+timeParts[2]);
//		 
		 
		
		
	
	}

}
