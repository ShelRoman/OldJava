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
//
// Классы задания hw6.courses.Group,
// hw6.courses.Student
// hw6.courses.Courses
// hw6.courses.NoSuchGroupException
// hw6.courses.NoSuchStudentException
// hw6.courses.GroupExistsException

package week6.homework;

import java.io.Serializable;
import java.util.ArrayList;
@SuppressWarnings("unused")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private String surname;
	private String patronymic;
	private String fullName;
	private ArrayList<Integer> marks;
	
	public Student(String name, String surname, String patronymic) {
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		this.fullName = name + " " + surname + " " + patronymic;
	
	}
	
	public String getFullName() {
		return fullName;
	}

	public ArrayList<Integer> getMarks() {
		return marks;
	}

	public void setMarks(ArrayList<Integer> marks) {
		this.marks = marks;
	}

}
