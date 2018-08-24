package training.io;

import java.io.File;

/**
 * Created by user on 22/11/2015.
 */
public class Runner {

    public static void main(String[] args){
        File file1 = new File("file1");
        File file2 = new File("file3");
        IOUtil util = new IOUtil(file1, file2, true);
        util.compareFiles();
        
    }
}
