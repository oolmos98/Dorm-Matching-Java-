
public class Students {


	protected String name = "";
	protected char gender;
	Date birthDay = new Date();
	Preference pref = new Preference();;
	protected Boolean matched;

	public Students(String name, char gender, Date date, Preference pref ){


		this.name = name;
		this.gender = gender;
		this.birthDay.setYear(date.getYear());
		this.birthDay.setMonth(date.getMonth());
		this.birthDay.setDay(date.getDay());
		this.pref.setQuiet(pref.getQuiet());
		this.pref.setMusic(pref.getMusic());
		this.pref.setReading(pref.getReading());
		this.pref.setChatting(pref.getChatting());
		matched = false;
	}

	public String getName(){
		return name;
	}

	public char getGender(){
		return gender;
	}
	public int compare(Students student){
		int score=0;
		if (this.getMatch() != true && student.getMatch() != true){
			if (student.getGender() != this.gender){
				score = 0;
			}
			else{
				score = this.pref.compare(student.pref) + birthDay.compare(student.birthDay);

			}

		}		
		return score;

	}
	public void setMatch(Boolean student){
		matched = student;
	}
	public Boolean getMatch(){
		return matched;
	}
}
