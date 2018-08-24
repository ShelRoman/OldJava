package week5.homework;

import java.util.ArrayList;

public class Student implements Comparable<Student> {
	String name;
	String surname;
	String patronymic;
	ArrayList<Integer> marks;

	public Student(String name, String surname, String patronymic, int[] marks ) {
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}
	
	public String getFullName() {
		return name + " " + surname + " " + patronymic;
	}
	
	public int getComparator() {
		int result = 0;
		for (int mark : marks) {
			result += mark;
		}
		return result / marks.size();
	}
	
	@Override
	public int compareTo(Student student) {
		return this.getComparator() - student.getComparator();
	}
	
}
