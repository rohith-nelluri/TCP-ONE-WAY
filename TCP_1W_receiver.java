import java.io.*;
 import java.net.*;
 public class TCP_1W_receiver
{ 
public static void main(String[] args) throws Exception {
 Socket sock = new Socket("127.0.0.2", 3000);
BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
OutputStream ostream = sock.getOutputStream();
 PrintWriter pwrite = new PrintWriter(ostream, true);    
System.out.println("Start the chitchat, type and press Enter key"); 
  String receiveMessage, sendMessage; 
while(true) {
 sendMessage = keyRead.readLine();
 pwrite.println(sendMessage); 
 pwrite.flush();
} 
}
 } 