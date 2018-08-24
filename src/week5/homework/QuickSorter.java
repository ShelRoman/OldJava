package week5.homework;

import java.util.ArrayList;
import java.util.Collections;

public class QuickSorter {
	
	public QuickSorter() {
		
	}
	
	public void sort(ArrayList<Student> students) {
		Collections.sort(students, Collections.reverseOrder());
	}
}
