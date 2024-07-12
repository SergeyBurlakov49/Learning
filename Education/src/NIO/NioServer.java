package NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;

public class NioServer implements Runnable{

    private ServerSocketChannel serverSocketChannel;
    private Selector selector;
    private ByteBuffer byteBuffer = ByteBuffer.allocate(256);
    private byte[] bytes = new byte[byteBuffer.capacity()];

    public NioServer() throws IOException {
        serverSocketChannel = ServerSocketChannel.open();                       // создаем сервер
        serverSocketChannel.socket().bind(new InetSocketAddress(8189));    // указываем порт
        serverSocketChannel.configureBlocking(false);                           // неблокирующийся режим
        selector = Selector.open();                                             // штука, нужная для работы в одном потоке с несколькими клиентами
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);         // селектор будет реагировать на событие OP_ACCEPT - событие подключения нового клиента
    }

    public static void main(String[] args) {

    }

    @Override
    public void run() {

    }
}
