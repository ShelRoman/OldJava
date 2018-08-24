/*�������� ����� Monitor(nameFile1,nameFile2), � ������� ��� ������.

1. ����� 1(ThreadCreator), ��������� ������ � ������� ���������� � nameFile1, 
 ����� ����� 2.(objSynchro.notify())
 
2. ����� 2(ThreadWriter), �������� nameFile1 � nameFile2 � ��������. 
 (objSynchro.wait()) 

����������: 
1. ���� � ������� ������� ����� "exit" ��� "quit", �� ����� �1 �������������.
2. ��������� ��������� � ������� ������.*/

package week8.lesson16;

import java.io.File;

public class Monitor {
	File file1;
	File file2;
	ThreadCreator creator; 
	ThreadWriter writer;

	public Monitor(String filename1, String filename2) {
		file1 = new File(filename1);
		file2 = new File(filename2);
		creator = new ThreadCreator(file1);
		writer = new ThreadWriter(file2);
	}

	public void start() {
		creator.start();
		writer.start();
		boolean runWhile = true;
		while (runWhile) {
			
		}
	}
}
