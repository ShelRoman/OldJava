package training.classes;

/**
 * Created by user on 21/11/2015.
 */
public class HelloFromMain {

    static {
        System.out.println("begin");
        main(null);
        System.out.println("end");
    }

    public static void main(String[] args) {
        if (args != null) {
            return;
        }
        System.out.println("hello from main!!!");
    }

}