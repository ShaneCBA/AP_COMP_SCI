import java.util.*;

public class JavaServer {
	public static void main(String[] args) {
		int portNum = 7000;
		try {
			ServerSocket serverSocket = new ServerSocket(portNumber);

			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		}
		catch(IOException e){System.out.println("IOException at serverSocket: "+e)}

		try {
			Socket clientSocket = serverSocket.accept();
		}
		catch(IOException e){System.out.println("IOException at clientSocket: "+e)}
	}
}