import java.net.*;
import java.io.*;

class Client {
	public static void main(String[] args) {
		// Creating socket with port number 8080
		try {
			Socket socket = new Socket("localhost", 8080);

			if (socket.isConnected())
				System.out.println("Connected with server.");

				socket.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}