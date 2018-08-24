/*Ќаписать класс Monitor(nameFile1,nameFile2), в котором два потока.

1. ѕоток 1(ThreadCreator), считывает строку с консоли записывает в nameFile1, 
 будит поток 2.(objSynchro.notify())
 
2. ѕоток 2(ThreadWriter), копирует nameFile1 в nameFile2 и засыпает. 
 (objSynchro.wait()) 

ѕримечание: 
1. если с консоли введено слово "exit" или "quit", то поток є1 останавливать.
2. продумать остановку и второго потока.*/

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
