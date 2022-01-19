# Date *19th Jan - 20th Jan*
### ServerSocket
The ServerSocket class is used to create a server socket. This object is used to establish communication with the clients.

#### Constructors
* `ServerSocket()` - Creates an unbound server socket.
* `ServerSocket(int port)` - Creates a server socket, bound to the specified port.

### Important Methods
* `public Socket accept()` - returns the socket and establish a connection between server and client.
* `public synchronized void close()` - closes the server socket.

### Socket
A socket is the connecting points for communications between the machines. The Socket class can be used to create a socket.

#### Constructors
* `Socket()` - Creates an unconnected socket, with the system-default type of SocketImpl.
* `Socket(InetAddress address, int port)` - Creates a stream socket and connects it to the specified port number at the specified IP address.
* `Socket(String host, int port)` - Creates a stream socket and connects it to the specified port number on the named host.

#### Important Methods
* `public InputStream getInputStream()`	- returns the InputStream attached with this socket.
* `public OutputStream getOutputStream()` - returns the OutputStream attached with this socket.
* `public synchronized void close()` - closes this socket

### DatagramSocket
DatagramSocket class represents a connection-less socket for sending and receiving datagram packets. It is a mechanism used for transmitting datagram packets over network.

A datagram is basically an information but there is no guarantee of its content, arrival or arrival time.

#### Constructors
* `DatagramSocket()` - Creates a datagram socket and binds it to any available port on the local host machine.
* 	`DatagramSocket(int port)` - Creates a datagram socket and binds it to the specified port on the local host machine.

#### Important Methods
* `void	close()` - Closes this datagram socket.
* `void	receive(DatagramPacket p)` - Receives a datagram packet from this socket.
* `void	send(DatagramPacket p)` - Sends a datagram packet from this socket.

### DatagramPacket
DatagramPacket is the message that can be sent or received. If you send multiple packet, it may arrive in any order.

#### Constructors
* `DatagramPacket(byte[] buf, int length)` - Constructs a DatagramPacket for receiving packets of length length.
* `DatagramPacket(byte[] buf, int length, InetAddress address, int port)` - Constructs a datagram packet for sending packets of length length to the specified port number on the specified host.

#### Important Methods
* `InetAddress getAddress()` - It returns the IP address of the machine to which the datagram is being sent or from which the datagram was received.
* `byte[] getData()` - It returns the data buffer.
* `int getLength()` - It returns the length of the data to be sent or the length of the data received.