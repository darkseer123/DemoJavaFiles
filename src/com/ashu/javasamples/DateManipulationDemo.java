package com.ashu.javasamples;

import java.util.Calendar;

public class DateManipulationDemo {

	public static void main(String[] args) {
		DateManipulator d = new DateManipulator(Calendar.getInstance());
		d.setDate();
	}
}

class DateManipulator {

	Calendar cal;

	DateManipulator(Calendar _cal) {
		this.cal = _cal;
	}

	public void setDate() {
		// Set time to Jan 7, 2004 at 15:40
		cal.set(2005, 0, 7, 15, 40);
		System.out.println("original date: " + cal.getTime());

		// Convert time to milliseconds
		long day1 = cal.getTimeInMillis();

		// Print the original time in milliseconds
		System.out.println("original time in millis: " + day1);

		// Add an hours worth of milliseconds and update time accordingly
		day1 += 1000 * 60 * 60;
		cal.setTimeInMillis(day1);

		// Print the new time
		System.out.println("new time in millis: " + day1);

		// Add 35 days to the date
		cal.add(Calendar.DATE, 35);

		// Print the new date
		System.out.println("add 35 days " + cal.getTime());

		/*
		 * Roll 35 days to this date. Rolling a date changes the date, however
		 * it DOES NOT change the month
		 */
		cal.roll(Calendar.DATE, 35);
		System.out.println("roll 35 days " + cal.getTime());

		// Just a simple set of the date
		cal.set(Calendar.DATE, 1);
		System.out.println("Set to 1 " + cal.getTime());
	}
}
