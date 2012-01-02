package com.ashu.javasamples;

import java.util.Date;

public class DateFormatterDemo {

	public static void main (String[] args) {
		
		DateFormatter d = new DateFormatter(new Date());
		d.printDate();
                d.printDateAngleFlag();
	}
}

class DateFormatter {
	
	public Date date;
	
	DateFormatter (Date d) {
		date = d;
	}
	
	public void printDate() {
            String dateString = String.format("%tA, %tB %td", date, date, date);
            System.out.println(dateString);
	}
	
        public void printDateAngleFlag() {
            String dateString = String.format("%tA, %<tB %<td", date);
            System.out.println(dateString);
        }
}
