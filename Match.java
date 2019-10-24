import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Match {

	public static ArrayList<Students> students = new ArrayList<Students>();

	private static int totalStudents = 0;

	public static void main(String[] args) throws FileNotFoundException{
		String file = "Students.txt";
		Scanner input = new Scanner (new FileReader(file));
		input.useDelimiter("[\t\r-]");

		int test =0;
		while (input.hasNextLine()){
			String name = input.next();
			char gender = input.next().charAt(0);
			int month = input.nextInt();
			int day = input.nextInt();
			int year = input.nextInt();
			int quiet = input.nextInt();
			int music = input.nextInt();
			int reading = input.nextInt();
			int chatting = input.nextInt();
			students.add(new Students(name,gender, new Date(month, day,year), new Preference(quiet, music, reading, chatting)));
			//System.out.println(students.get(test).birthDay.dayOfYear() + " " + students.get(test).birthDay.getYear());
			test++;
			totalStudents++;
		}
		//System.out.println(students.get(9).compare(students.get(14)));
		input.close();
		int maxScore =0;
		int current = 0;
		int k=0;
		int p;
		for (int i = 0; i < students.size(); i++){
			if(students.get(i).getMatch() == false){
				maxScore =0;
				current=0;
				for(int j = i+1; j<students.size(); j++){
					current = students.get(i).compare(students.get(j));
					if(current == 0){
						continue;
					}
					if(current > 0 && current > maxScore){
						maxScore = current;
						k=j;
					}



				}
				if(students.get(i).getMatch() == false && students.get(k).getMatch() == false){
					students.get(i).setMatch(true);
					students.get(k).setMatch(true);
					System.out.print(students.get(i).getName() + " matches with ");
					System.out.println(students.get(k).getName() + " with score of " + maxScore);
					//System.out.println(i);
					//System.out.println(k);

				}
				else {
					System.out.println(students.get(i).getName() + " has no match!");
				}

			}
		}
	}
}


