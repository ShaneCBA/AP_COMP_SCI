import java.util.*;
import java.io.*;
import java.net.*;

public class JavaServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;

		Socket clientSocket = null;

		int PORT_NUM = 7000;

		try {
			serverSocket = new ServerSocket(PORT_NUM);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		while (true) {
			try {
				clientSocket = serverSocket.accept();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			new ServerThread(clientSocket);
		}
	}
}

class ServerThread extends Thread {
	protected Socket socket;


	ServerThread(Socket clientSocket) {
		this.socket = clientSocket;
	}

	public void run() {

	}
}