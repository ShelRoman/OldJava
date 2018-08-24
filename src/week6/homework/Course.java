// Добавить в приложение управления курсами сущность Курс (название, темы, группы)
// Добавить следующие возможности в виде консольного меню, а так же методы в класс Courses:
// - Добавить курс, void addCourse(Course course)
// - Добавить Группу в Курс по имени, void addGroupToCourse(String groupName, String courseName) throws NoSuchGroupException, NoSuchCourseException
// - Задать темы курса, void setThemes(String courseName, List<String> themes) throws NoSuchCourseException
// - Удалить из Курса группы, в которых учяться указанные студенты (по имени), void removeGroupsFromCourseByStudents(String courseName, List<String> students) throws NoSuchCourseException
// - Вывести все курсы на экран, void printCourses()

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
