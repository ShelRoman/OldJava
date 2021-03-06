package proff27.session5.chat;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocketChannel channel = ServerSocketChannel.open();
        channel.bind(new InetSocketAddress(30000));

        while (RunWhile.isRunWhile()) {
            SocketChannel socketChannel = channel.accept();
            handleRequest(socketChannel);
        }
    }

    public static void handleRequest(SocketChannel socketChannel) throws IOException {
        while (RunWhile.isRunWhile()) {
            readMessage(socketChannel);
            sendMessage(socketChannel);
        }
    }

    private static void readMessage(SocketChannel socketChannel) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(100000);
        int read;
        while ((read = socketChannel.read(buffer)) > 0) {
            if (new String(buffer.array(), 0, read).toLowerCase().equals("exit")) {
                RunWhile.runBreak();
            }
            System.out.println(new String(buffer.array(), 0, read));
            buffer.rewind();
            break;
        }
        buffer.clear();
    }

    private static void sendMessage(SocketChannel socketChannel) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(100000);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your message:");
        buffer.put(scan.next().getBytes());
        buffer.flip();
        while (buffer.hasRemaining()) {
            socketChannel.write(buffer);
        }
        buffer.rewind();
    }
}
