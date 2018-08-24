//��������� ���������� ����� � ������� �� �����

package proff27.session2;


import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ChanelReadFile {

    public static void main(String[] args) throws IOException {
        Path testFile = Paths.get("Lesson2.txt");
        try (SeekableByteChannel testChannel = Files.newByteChannel(testFile)) {
            ByteBuffer testBuffer = ByteBuffer.allocate(10);
            int read;
            while ((read = testChannel.read(testBuffer)) > 0) {
                System.out.print(new String(testBuffer.array(), 0, read));
                testBuffer.clear();
            }
        }
    }
}
