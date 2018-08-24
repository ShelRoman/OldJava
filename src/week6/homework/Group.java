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
