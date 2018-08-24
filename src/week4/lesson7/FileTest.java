package week4.lesson7;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileTest {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		File f = new File("d://book123/1.txt");
		File[] files = f.listFiles();
		String[] strFiles = f.list();
		System.out.println(Arrays.toString(files));
		System.out.println(f.getCanonicalPath());
		System.out.println(File.separatorChar);
		if (f.isDirectory())
			System.out.println("Это директория");
		new File("d:\\book123").mkdirs();
		if (!f.exists())
			f.createNewFile();
		 f.mkdir();
		 f.mkdirs();
	}
}
