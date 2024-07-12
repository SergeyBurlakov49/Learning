package NIO;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.ServerSocketChannel;

public class IOServer implements Runnable{

    public static void main(String[] args) {
        new IOServer().run();
    }

    @Override
    public void run() {
        try (ServerSocket serverSocket = new ServerSocket(7777)) {
                Socket socket = serverSocket.accept();                      // в этой точке код блокируется до момента установки соединения с каким-то пользователем
                System.out.println("Установлено подключение");
                InputStream is = socket.getInputStream();
                byte [] data = new byte[256];
                while (socket.isConnected()){
                    int read = is.read(data);
                    if (read > 0) {
                        String s = new String(data, 0, read);
                        System.out.println(s);
                    }
                }
            }
            catch (IOException e){
            e.printStackTrace();
        }
    }
}
