package week7.lesson13;

public class Sheep implements Cloneable {

}

// public class BufferedReaderExmple {
// public static void main(String[] args) throws IOException {
// Reader isr = new InputStreamReader(System.in);
// BufferedReader d = new BufferedReader(isr);
// //DataInputStream dis = new DataInputStream(System.in);
//
//
// String a = d.readLine();
//
// System.out.println("Вы напечатали: " + a);
//
//
// System.out.println(d.read());
// System.out.println(d.read());
// System.out.println(d.read());
// System.out.println(d.read());
//
// }
// }
// public class FileInputStreamExmple {
// public static void main(String[] args) throws IOException {
// InputStream is = new FileInputStream("file2.txt");
// int example = 3;
// int k;
//
// if(example == 1){
// int codeChar = 10;
// while(codeChar > -1){
// codeChar = is.read();
// System.out.println(codeChar + " = [" + ((char)codeChar) + "]");
// }
// }
//
// if(example == 2){
// byte[] buf = new byte[20];
// k = is.read(buf);
// System.out.println("k="+k);
// for(byte b : buf) System.out.println("["+b+"]=["+(char)(b)+"]");
// }
// if(example == 3){
// int len = is.available();
// byte[] buf = new byte[len];
// k = is.read(buf);
// System.out.println("k="+k);
// for(byte b : buf) System.out.println("["+b+"]=["+(char)(b)+"]");
// }
// }
// public class FileOutputStreamExmple {
// public static void main(String[] args) throws IOException {
// OutputStream os = new FileOutputStream("file2.txt");
// byte[] buf = {100,101,102};
//
// os.write(97);
// os.write(buf);
// os.close();
// }
// }