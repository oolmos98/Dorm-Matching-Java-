
public class Date {

	private int year;
	private int month;
	private int day;

	public Date(){
		year = 0;
		month = 0;
		day = 0;
	}
	public Date(int month, int day, int year){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int dayOfYear() {
		int totalDays = 0;
		switch (month) {
		case 12: totalDays += 30;
		case 11: totalDays += 31;
		case 10: totalDays += 30;
		case 9 : totalDays += 31;
		case 8 : totalDays += 31;
		case 7 : totalDays += 30;
		case 6 : totalDays += 31;
		case 5 : totalDays += 30;
		case 4 : totalDays += 31;
		case 3 : totalDays += 28;
		case 2 : totalDays += 31;
		} 
		totalDays += day;
		return totalDays;
	}
	public int compare(Date s2){
		int total=0;
		int dif = Math.abs((s2.dayOfYear() - this.dayOfYear())) + Math.abs(365*(this.getYear() - s2.getYear())) ;
		dif = dif/30;
		if(dif < 60){
			total = 60-dif;
		}
		else
			total = 0;


		return total;

	}

	public int getYear(){
		return year;
	}
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}
	public void setYear(int year){
		this.year=year;
	}
	public void setMonth(int month){
		this.month = month;
	}
	public void setDay(int day){
		this.day = day;
	}
}


