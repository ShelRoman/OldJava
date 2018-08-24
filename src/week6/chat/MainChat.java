package week6.chat;

import java.io.IOException;

public class MainChat {

	public static void main(String[] args) throws IOException {
		Server serv = new Server();
		serv.setDaemon(true);
		Client chat = new Client();
		chat.start();
		serv.start();
	}

}
