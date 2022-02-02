import java.net.*;
import java.io.*;

class Server {
	public static void main(String[] args) throws IOException {

		// Creating server socket with port number 8080
		ServerSocket serverSocket = new ServerSocket(8080);

		System.out.println("Server Online..\nWaiting for a client to connect...");

		// Creating socket to accept client from port 8080.
		Socket s = serverSocket.accept();
		System.out.println("Connected with client.");

		// Closing Socket and Server Socket
		s.close();
		serverSocket.close();
	}
}