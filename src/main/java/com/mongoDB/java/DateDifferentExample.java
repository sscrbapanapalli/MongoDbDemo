package com.mongoDB.java;

import java.text.SimpleDateFormat;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.Seconds;
import java.util.Date;

public class DateDifferentExample {

	public static void main(String[] args) {
		
		
		String dateStart = "2018-05-04 12:29:50.668";
		String dateStop = "Fri May 04 12:29:57 IST 2018";
		 


				SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

				Date d1 = null;
				Date d2 = null;

				try {
					d1 = format.parse(dateStart);
					d2 = format.parse(dateStop);

					DateTime dt1 = new DateTime(d1);
					DateTime dt2 = new DateTime(d2);

					System.out.print(Days.daysBetween(dt1, dt2).getDays() + " days, ");
					System.out.print(Hours.hoursBetween(dt1, dt2).getHours() % 24 + " hours, ");
					System.out.print(Minutes.minutesBetween(dt1, dt2).getMinutes() % 60 + " minutes, ");
					System.out.print(Seconds.secondsBetween(dt1, dt2).getSeconds() % 60 + " seconds.");

				 } catch (Exception e) {
					e.printStackTrace();
				 }

			  }

			}