package week6.homework;

import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Courses implements Serializable {
	private static final long serialVersionUID = 1L;
	private ArrayList<Student> studentsOnCourse = new ArrayList<>();
	private ArrayList<Group> groups = new ArrayList<>();
	private ArrayList<Course> courses = new ArrayList<>();
	private String[] menuList = { "1. Rename group",
			"2. Add new student",
			"3. Add new group",
			"4. Print group info",
			"5. Add student to group",
			"6. Remove student from group",
			"7. Clone group",
			"8. Export information about course",
			"9. Import information about course",
			"10. Add new course",
			"11. Add group to the course",
			"12. Set course's themes",
			"13. Remove group from course through students list",
			"14. Print courses",
			"15. Exit" };

	public void start() throws NoSuchGroupException, GroupExistsException,
			NoSuchStudentException, IOException, ClassNotFoundException,
			NoSuchCourseException {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		boolean runWhile = true;
		while (runWhile) {
			for (String i : menuList) {
				System.out.println(i);
			}
			System.out.println("Выберите операцию:");
			int userChoice = scan.nextInt();
			switch (userChoice) {
			case 1:
				Scanner scan2 = new Scanner(System.in);
				System.out.println("Enter group name to rename");
				String oldName = scan2.nextLine();
				System.out.println("Enter group's new name");
				String newName = scan2.nextLine();
				this.setGroupName(oldName, newName);
				break;
			case 2:
				Scanner scan1 = new Scanner(System.in);
				System.out.println("Enter student's name");
				String name = scan1.nextLine();
				System.out.println("Enter student's surname");
				String surname = scan1.nextLine();
				System.out.println("Enter student's patronymic");
				String patronymic = scan1.nextLine();
				this.addStudent(new Student(name, surname, patronymic));
				break;
			case 3:
				Scanner scan3 = new Scanner(System.in);
				System.out.println("Enter new group name");
				String groupName = scan3.nextLine();
				this.addGroup(groupName);
				break;
			case 4:
				Scanner scan4 = new Scanner(System.in);
				System.out.println("Enter group name to show info");
				String printGroup = scan4.nextLine();
				this.printGroupInfo(printGroup);
				break;
			case 5:
				Scanner scan5 = new Scanner(System.in);
				System.out.println("Enter student's full name");
				String studentSName = scan5.nextLine();
				System.out.println("Enter group's name");
				String groupSName = scan5.nextLine();
				this.addStudentToGroup(studentSName, groupSName);
				break;
			case 6:
				Scanner scan6 = new Scanner(System.in);
				System.out.println("Enter student's full name");
				String studentSSName = scan6.nextLine();
				System.out.println("Enter group's name");
				String groupSSName = scan6.nextLine();
				this.removeStudentFromGroup(studentSSName, groupSSName);
				break;
			case 7:
				Scanner scan7 = new Scanner(System.in);
				System.out.println("Enter group name");
				String groupOldName = scan7.nextLine();
				System.out.println("Enter new group's name");
				String grNewName = scan7.nextLine();
				this.cloneGroup(groupOldName, grNewName);
				break;
			case 8:
				this.serialize();
				break;
			case 9:
				this.deserialize();
				break;
			case 10:
				Scanner scan10 = new Scanner(System.in);
				System.out.println("Enter course name");
				String courseName = scan10.nextLine();
				this.addCourse(new Course(courseName));
				break;
			case 11:
				Scanner scan11 = new Scanner(System.in);
				System.out.println("Enter group name");
				String groupSSSName = scan11.nextLine();
				System.out.println("Enter course name");
				String courseSName = scan11.nextLine();
				this.addGroupToCourse(groupSSSName, courseSName);
				break;
			case 12:
				Scanner scan12 = new Scanner(System.in);
				System.out.println("Enter course name");
				String courseSSSName = scan12.nextLine();
				List<String> themes = new ArrayList<String>();
				this.setThemes(courseSSSName, themes);
				break;
			case 13:
				boolean studentsRun = true;
				Scanner scan13 = new Scanner(System.in);
				List<String> studentsNames = new ArrayList<>();
				while (studentsRun) {
					System.out.println("Enter student's full name to add it to list, if done enter 'done' ");
					String studentName = scan13.nextLine();
					if (studentName.equals("done")) {
						studentsRun = false;
						break;
					} else {
						studentsNames.add(studentName);
					}
				}
				Scanner scan131 = new Scanner(System.in);
				System.out.println("Enter course name");
				String courseSSSSname = scan131.nextLine();
				this.removeGroupsFromCourseByStudents(courseSSSSname, studentsNames);
				break;
			case 14:
				this.printCourses();
				break;
			case 15:
				runWhile = false;
				System.out.println("Goodbye");
				break;
			default:
				System.out.println("Wrong index");
				break;
			}
		}
	}
	
	public void printCourses() {
		for (Course course : courses) {
			System.out.println(course.getName());
		}
		System.out.println("--------------------------------");
	}
	
	public void removeGroupsFromCourseByStudents(String courseName, List<String> students) 
			throws NoSuchCourseException, NoSuchGroupException {
		int courseCount = 0;
		int courseInd = 0;
		for (int i = 0; i < courses.size(); i++) {
			if (this.courses.get(i).getName().equals(courseName)) {
				courseCount++;
				courseInd = i;
			}
		}
		if (courseCount == 0) {
			throw new NoSuchCourseException("Course not found");
		} else {
			List<String> namesFromCourse = new ArrayList<>();
			int studCount = 0;
			int studInd = 0;
			for (int i = 0; i < courses.get(courseInd).getGroups().size(); i++) {
				for (Student names : courses.get(courseInd).getGroups().get(i).getStudents()) {
					namesFromCourse.add(names.getFullName());
				}
				if (namesFromCourse.equals(students)) {
					studCount++;
					studInd = i;
				}
			}
			if (studCount == 0) {
				throw new NoSuchGroupException("Group not found");
			} else {
				ArrayList<Group> newGroups = new ArrayList<>();
				newGroups.addAll(courses.get(courseInd).getGroups());
				System.out.println("Group " + newGroups.get(studInd).getGroupName() + " has been removed from " + courseName);
				newGroups.remove(studInd);
				courses.get(courseInd).setGroups(newGroups);
				System.out.println("--------------------------------");
			}
		}
	}
	
	public void setThemes(String courseName, List<String> themes) throws NoSuchCourseException {
		int courseCount = 0;
		int courseInd = 0;
		for (int i = 0; i < courses.size(); i++) {
			if (this.courses.get(i).getName().equals(courseName)) {
				courseCount++;
				courseInd = i;
			}
		}
		if (courseCount == 0) {
			throw new NoSuchCourseException("Course not found");
		} else {
			courses.get(courseInd).setThemes(themes);
			System.out.println("Themes were set to course " + this.courses.get(courseInd).getName());
			System.out.println("--------------------------------");
		}
	}
	
	public void addGroupToCourse(String groupName, String courseName) 
			throws NoSuchGroupException, NoSuchCourseException {
		int groupCount = 0;
		int groupInd = 0;
		for (int i = 0; i < groups.size(); i++) {
			if (groups.get(i).getGroupName().equals(groupName)) {
				groupCount++;
				groupInd = i;
			}
		}
		if (groupCount == 0) {
			throw new NoSuchGroupException("Group not found");
		} else {
			int courseCount = 0;
			int courseInd = 0;
			for (int i = 0; i < courses.size(); i++) {
				if (this.courses.get(i).getName().equals(courseName)) {
					courseCount++;
					courseInd = i;
				}
			}
			if (courseCount == 0) {
				throw new NoSuchCourseException("Course not found");
			} else {
				this.courses.get(courseInd).getGroups().add(this.groups.get(groupInd));
				System.out.println("Group " + this.getGroups().get(groupInd).getGroupName() + " has been adde to course "
						+ this.getCourses().get(courseInd).getName());
				System.out.println("--------------------------------");
			}
		}
	}
	
	public void addCourse(Course course) {
		ArrayList<Course> newCourses = this.getCourses();
		newCourses.add(course);
		this.setCourses(newCourses);
		System.out.println("Course has been added");
		System.out.println("--------------------------------");
	}
	
	public void deserialize() throws IOException, ClassNotFoundException {
		File group = new File("D:/Java/Groups/Group1.grp");
		FileInputStream fis = new FileInputStream(group);
		ObjectInputStream oin = new ObjectInputStream(fis);
		@SuppressWarnings("unused")
		Courses newCours = (Courses)oin.readObject();
		fis.close();
		oin.close();
		group.delete();
	}
	
	public void serialize() throws IOException {
		FileOutputStream fos = new FileOutputStream("D:/Java/Groups/Group1.grp");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(this);
		oos.close();
		fos.close();
	}
	
	public void cloneGroup(String groupName, String newName)
			throws NoSuchGroupException, GroupExistsException {
		int groupCounter = 0;
		int newNameCounter = 0;
		int groupIndex = 0;
		for (int i = 0; i < groups.size(); i++) {
			if (groups.get(i).getGroupName().equals(groupName)) {
				groupCounter++;
				groupIndex = i;
			} else if (groups.get(i).getGroupName().equals(newName)) {
				newNameCounter++;
			}
		}
		if (groupCounter == 0) {
			throw new NoSuchGroupException("Group not found");
		} else if (newNameCounter > 0) {
			throw new GroupExistsException("Name for new group is already used");
		} else if (groupName.equals(newName)) {
			throw new GroupExistsException("Name of new group can't be equal to old group");
		} else {
			this.groups.add(new Group(newName));
			this.groups.get(groups.size() - 1).setStudents(groups.get(groupIndex).getStudents());
			System.out.println("Group " + groups.get(groupIndex).getGroupName() + " has been "
					+ "successfully cloned with name " + newName);
			System.out.println("--------------------------------");
		}
	}
	
	public void removeStudentFromGroup(String studentSName, String groupName)
			throws NoSuchStudentException, NoSuchGroupException {
		int groupCounter = 0;
		int groupIndex = 0;
		for (int i = 0; i < groups.size(); i++) {
			if (groups.get(i).getGroupName().equals(groupName)) {
				groupCounter++;
				groupIndex = i;
			}
		}
		if (groupCounter == 0) {
			throw new NoSuchGroupException("Group not found");
		} else {
			int studCounter = 0;
			int studInd = 0;
			for (int j = 0; j < groups.get(groupIndex).getStudents().size(); j++) {
				if (groups.get(groupIndex).getStudents().get(j).getFullName().equals(studentSName)) {
					studCounter++;
					studInd = j;
				}
			}
			if (studCounter == 0) {
				throw new NoSuchStudentException("Student not found");
			} else {
				System.out.println("Student " + groups.get(groupIndex).getStudents().get(studInd).getFullName()
						+ " has benn removed from group " + groups.get(groupIndex).getGroupName());
				this.studentsOnCourse.add(groups.get(groupIndex).getStudents().get(studInd));
				groups.get(groupIndex).removeStudent(studInd);
				System.out.println("--------------------------------");
			}
		}
		
	}

	public void addStudentToGroup(String studentSName, String groupName)
			throws NoSuchStudentException, NoSuchGroupException {
		int studCounter = 0;
		int studInd = 0;
		for (int i = 0; i < studentsOnCourse.size(); i++) {
			if (studentsOnCourse.get(i).getFullName().equals(studentSName)) {
				studCounter++;
				studInd = i;
			}
		}
		if (studCounter == 0) {
			throw new NoSuchStudentException("Student not found");
		} else {
			int groupCounter = 0;
			int groupIndex = 0;
			for (int j = 0; j < groups.size(); j++) {
				if (groups.get(j).getGroupName().equals(groupName)) {
					groupCounter++;
					groupIndex = j;
				}
			}
			if (groupCounter == 0) {
				throw new NoSuchGroupException("Group not found");
			} else {
				groups.get(groupIndex).addStudent(studentsOnCourse.get(studInd));
				System.out.println("Student " + studentsOnCourse.get(studInd).getFullName()
						+ " has been assigned to group " + groups.get(groupIndex).getGroupName());
				studentsOnCourse.remove(studInd);
				System.out.println("--------------------------------");
			}
		}
	}

	public void setGroupName(String groupName, String newName)
			throws NoSuchGroupException {
		int counter = 0;
		int indexToRename = 0;
		for (int i = 0; i < groups.size(); i++) {
			if (groups.get(i).getGroupName().equals(groupName)) {
				counter++;
				indexToRename = i;
			}
		}
		if (counter == 0) {
			throw new NoSuchGroupException("Group not found");
		} else {
			this.groups.get(indexToRename).setGroupName(newName);
			System.out.println("Group " + groupName + " has been renamed to " + newName);
			System.out.println("--------------------------------");
		}
	}

	public void addStudent(Student student) {
		this.studentsOnCourse.add(student);
		System.out.println("Student has been added to course");
		System.out.println("--------------------------------");
	}

	public void addGroup(String groupName) throws GroupExistsException {
		int counter = 0;
		for (int i = 0; i < groups.size(); i++) {
			if (groups.get(i).getGroupName().equals(groupName)) {
				counter++;
			}
		}
		if (counter > 0) {
			throw new GroupExistsException("There is a group with such name");
		} else {
			this.groups.add(new Group(groupName));
		}
		System.out.println("Group has been added to course");
		System.out.println("--------------------------------");

	}

	public void printGroupInfo(String groupName) throws NoSuchGroupException {
		int counter = 0;
		int indexToPrint = 0;
		for (int i = 0; i < groups.size(); i++) {
			if (groups.get(i).getGroupName().equals(groupName)) {
				counter++;
				indexToPrint = i;
			}
		}
		if (counter == 0) {
			throw new NoSuchGroupException("Group not found");
		} else {
			System.out.println("Date of start - " + this.groups.get(indexToPrint).getDate());
			System.out.println("List of students: ");
			for (Student student : this.groups.get(indexToPrint).getStudents()) {
				System.out.println(student.getFullName());
			}
			System.out.println("--------------------------------");
		}
	}

	public ArrayList<Student> getStudentsOnCourse() {
		return studentsOnCourse;
	}

	public void setStudentsOnCourse(ArrayList<Student> studentsOnCourse) {
		this.studentsOnCourse = studentsOnCourse;
	}

	public ArrayList<Group> getGroups() {
		return groups;
	}

	public void setGroups(ArrayList<Group> groups) {
		this.groups = groups;
	}
	
	public ArrayList<Course> getCourses() {
		return courses;
	}
	
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
}
