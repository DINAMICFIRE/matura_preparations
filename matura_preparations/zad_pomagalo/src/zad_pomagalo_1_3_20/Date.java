package zad_pomagalo_1_3_20;

import java.util.List;

public class Date {
	private String month;
	private int day;
	private int year;
	private static List<String> months = List.of(
			"january",
			"february",
			"march",
			"april",
			"may",
			"june",
			"july",
			"august",
			"september",
			"october",
			"november",
			"december");
	
	
	
	
	public Date(String month, int day, int year) {
		setMonth(month);
		setDay(day);
		setYear(year);
	}
	
	public String getMonth() {
		return month;
	}
	private void setMonth(String month) {
		if(months.contains(month)) {
			this.month = month;
		}else {
		throw new IllegalArgumentException("Invalid month: " + month);
		}
}
	public int getDay() {
		return day;
	}
	private void setDay(int day) {
		if(day >= 1 && day <= 31) {
			this.day = day;
		}else {
		throw new IllegalArgumentException("Invalid day: " + day);
		}
	}
	public int getYear() {
		return year;
	}
	private void setYear(int year) {
		if(year >= 1 && year <= 2100){
		this.year = year;
		}else {
			throw new IllegalArgumentException("Invalid year: " + year);
		}
		}
	
	
}
