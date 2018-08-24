//Написать приложение управления курсами.
// Используемые сущности: Группа (название, студенты, дата начала обучения), Студент (имя, фамилия, отчество, оценки по викендам).
// Добавить следующие возможности в виде консольного меню, а так же методы в класс Courses:
// - Задать новое имя группы (старое имя, новое имя), void setGroupName(String groupName) throws NoSuchGroupException
// - Добавить студента на курсы, void addStudent(Student student)
// - Добавить группу по имени, void addGroup(String groupName) throws GroupExistsException
// - Вывести информацию о группе, void printGroupInfo(String groupName) throws NoSuchGroupException
// - Добавить студента в группу по фамилии, void addStudentToGroup(String studentSName, String groupName) throws NoSuchStudentException
// - Удалить студента из группы по фамилии (на курсах студент остается), void removeStudentFromGroup(String studentSName, String groupName) throws NoSuchStudentException
//- Создать копию группы со студентами, void cloneGroup(String groupName, String newName) throws NoSuchGroupException
// - Сохранить информацию о курсах в файл, void serialize()
// - Прочитать информацию о курсах из файла, void deserialize()
package week6.homework;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.ArrayList;


public class Group implements Serializable  {
	private static final long serialVersionUID = 1L;
	private String groupName;
	private ArrayList<Student> students = new ArrayList<>();
	private GregorianCalendar date;
	
	public Group(String name) {
		this.setGroupName(name);
		this.date = new GregorianCalendar(2015, 00, 01);
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	public void removeStudent(int index) {
		this.students.remove(index);
	}
	
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public String getDate() {
		SimpleDateFormat date1 = new SimpleDateFormat("yyyy/MM/dd");
		return date1.format(this.date.getTime());
	}
	public void setDate(GregorianCalendar date) {
		this.date = date;
	}

}
