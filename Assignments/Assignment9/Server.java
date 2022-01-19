import java.net.*;
import java.io.*;
import java.util.Scanner;

class Server {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		// Creating server socket with port number 8080
		ServerSocket serverSocket = new ServerSocket(8080);

		System.out.println("Server Online.\nWaiting for a client to connect...");

		// Creating socket to accept client.
		Socket s = serverSocket.accept();
		System.out.println("Connected with client.");
		DataOutputStream streamOutput = new DataOutputStream(s.getOutputStream());
		DataInputStream streamInput = new DataInputStream(s.getInputStream());
		
		String input = "";
		while (!s.isClosed()){
			System.out.print("Me -: ");
			String message = scan.nextLine();

			streamOutput.writeUTF(message);
			streamOutput.flush();
			
			input = streamInput.readUTF();
			System.out.println(input);
		}

		scan.close();
		s.close();
		serverSocket.close();
	}
}