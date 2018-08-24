//�������� ���������� ���������� �������.
// ������������ ��������: ������ (��������, ��������, ���� ������ ��������), ������� (���, �������, ��������, ������ �� ��������).
// �������� ��������� ����������� � ���� ����������� ����, � ��� �� ������ � ����� Courses:
// - ������ ����� ��� ������ (������ ���, ����� ���), void setGroupName(String groupName) throws NoSuchGroupException
// - �������� �������� �� �����, void addStudent(Student student)
// - �������� ������ �� �����, void addGroup(String groupName) throws GroupExistsException
// - ������� ���������� � ������, void printGroupInfo(String groupName) throws NoSuchGroupException
// - �������� �������� � ������ �� �������, void addStudentToGroup(String studentSName, String groupName) throws NoSuchStudentException
// - ������� �������� �� ������ �� ������� (�� ������ ������� ��������), void removeStudentFromGroup(String studentSName, String groupName) throws NoSuchStudentException
//- ������� ����� ������ �� ����������, void cloneGroup(String groupName, String newName) throws NoSuchGroupException
// - ��������� ���������� � ������ � ����, void serialize()
// - ��������� ���������� � ������ �� �����, void deserialize()
//
// ������ ������� hw6.courses.Group,
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
