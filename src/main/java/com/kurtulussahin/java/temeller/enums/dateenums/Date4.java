
package com.kurtulussahin.java.temeller.enums.dateenums;

public class Date4 {
	
	private DayOfMonth dayOfMonth;
	private Month month;
	private Year year;

	public Date4(DayOfMonth dayOfMonth, Month month, Year year) {
		this.dayOfMonth = dayOfMonth;
		this.month = month;
		this.year = year;
	}
	
//	public StartDate4(){
//		
//	}

	/**
	 * @return the dayOfMonth
	 */
	public DayOfMonth getDayOfMonth() {
		return dayOfMonth;
	}

	/**
	 * @param dayOfMonth the dayOfMonth to set
	 */
	public void setDayOfMonth(DayOfMonth dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}

	/**
	 * @return the month
	 */
	public Month getMonth() {
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(Month month) {
		this.month = month;
	}

	/**
	 * @return the year
	 */
	public Year getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(Year year) {
		this.year = year;
	}
}
