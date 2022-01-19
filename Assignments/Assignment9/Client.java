import java.net.*;
import java.io.*;
import java.util.Scanner;

class Client{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Creating socket with port number 8080
		try {
			Socket socket = new Socket("localhost", 8080);

			if (socket.isConnected())
				System.out.println("Connected with server.");

			DataOutputStream streamOutput = new DataOutputStream(socket.getOutputStream());
			DataInputStream streamInput = new DataInputStream(socket.getInputStream());
			
			String input = "";
			while (!socket.isClosed()){
				System.out.print("Me -: ");
				String message = scan.nextLine();

				streamOutput.writeUTF(message);
				streamOutput.flush();
				
				input = streamInput.readUTF();
				System.out.println(input);
			}
			socket.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}




		scan.close();
	}
}