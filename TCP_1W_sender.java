
import java.io.*;
 import java.net.*; 
public class TCP_1W_sender { public static void main(String[] args) throws Exception 
{
 ServerSocket sersock = new ServerSocket(3000);
 System.out.println("Server ready for chatting"); 
Socket sock = sersock.accept( );
InputStream istream = sock.getInputStream(); 
BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
String receiveMessage,sendMessage;
while(true) { 
if((receiveMessage = receiveRead.readLine()) != null) 
{
 System.out.println(receiveMessage); 
}} } }