import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class PortScanner {
   public static void main(String[] args) {
      String host = "localhost";
      int start = 1;
      int end = 65535;

      for (int port = start; port <= end; port++) {
         try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(host, port), 100);
            System.out.println("Port " + port + " is open");
            socket.close();
         } catch (IOException e) {
            System.out.println("Port " + port + " is closed");
         }
      }
   }
}
