package com.example.filedemo.helper;

import java.util.Calendar;

public class CommonHelper {
	public static String getDateString () {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		return year+"_"+month+"_"+day+"_"+hour+"_"+minute+"_"+second;
	}
	public static String getYearString () {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		return ""+year;
	}
}
