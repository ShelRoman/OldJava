// �������� � ���������� ���������� ������� �������� ���� (��������, ����, ������)
// �������� ��������� ����������� � ���� ����������� ����, � ��� �� ������ � ����� Courses:
// - �������� ����, void addCourse(Course course)
// - �������� ������ � ���� �� �����, void addGroupToCourse(String groupName, String courseName) throws NoSuchGroupException, NoSuchCourseException
// - ������ ���� �����, void setThemes(String courseName, List<String> themes) throws NoSuchCourseException
// - ������� �� ����� ������, � ������� ������� ��������� �������� (�� �����), void removeGroupsFromCourseByStudents(String courseName, List<String> students) throws NoSuchCourseException
// - ������� ��� ����� �� �����, void printCourses()

package week6.homework;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Course implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private List<String> themes = new ArrayList<>();
	private ArrayList<Group> groups = new ArrayList<>();

	public Course(String name) {
		this.setName(name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getThemes() {
		return themes;
	}

	public void setThemes(List<String> themes) {
		this.themes = themes;
	}

	public ArrayList<Group> getGroups() {
		return groups;
	}

	public void setGroups(ArrayList<Group> groups) {
		this.groups = groups;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
