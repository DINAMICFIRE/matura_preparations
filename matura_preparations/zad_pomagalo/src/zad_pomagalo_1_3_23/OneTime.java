package zad_pomagalo_1_3_23;

import java.time.LocalDate;


public class OneTime implements Task{
	private LocalDate time;
	private String description;
	
	
	
	
	public OneTime(String description,int day,int month,int year) {
		setDescription(description);
		setTime(day, month, year);
	}




	public LocalDate getTime() {
		return time;
	}




	public void setTime(int day,int month,int year) {
		this.time = createDate(day, month, year);
	}


	private LocalDate createDate(int day,int month,int year) {
		return LocalDate.of(year, month, day);
	}


	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	@Override
	public boolean isOccuring(int day,int month,int year) {
		LocalDate checkdate = createDate(day, month, year);
		return checkdate.toString().equals(getTime().toString());
	}
	
	
}
