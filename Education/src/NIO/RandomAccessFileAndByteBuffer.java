package NIO;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/** от ChatGPT: <P>
 * rewind()
 * Purpose: To prepare the buffer for re-reading the data it already contains.
 * What it does:
 * Sets the position to zero.
 * Keeps the limit unchanged.
 * Clears the mark.
 * <p>
 * flip()
 * Purpose: To prepare the buffer for reading after writing data to it.
 * What it does:
 * Sets the limit to the current position.
 * Sets the position to zero.
 * Clears the mark.
 * <p>
 * clear()
 * Purpose: To prepare the buffer for writing new data.
 * What it does:
 * Sets the position to zero.
 * Sets the limit to the buffer's capacity.
 * Clears the mark.*/

public class RandomAccessFileAndByteBuffer {
    public static void main(String[] args) {

//        ByteBuffer bb = ByteBuffer.allocate(4);                                 // ByteBuffer инициализируется методом allocate().


//        try {                                                                         // если выполнить get, то в цикле будет overflow
//            System.out.println(bb.get());                                                exception на последней итерации из-за того,
//        }                                                                                что каретка сместилась на позицию вперед
//        catch (Exception e) {
//            e.printStackTrace();
//        }


//        for (int i = 1; i <= 4; i++) {
//            bb.put((byte) i);                                                           // по окончании цикла position выходит за границы
//        }
//        bb.flip();                                                                      // прыгаем в начало массива
//        System.out.println(bb.get());
//        System.out.println(bb.get());                                                   // читаем два байта
//        bb.rewind();                                                                    // бэкаемся в начало массива
//        System.out.println(bb.get());                                                   // опять читаем первые два байта
//        System.out.println(bb.get());
//        bb.compact();                                                                   // прочитанные данные удаляются, оставшиеся двигаются влево вместе с кареткой
//        System.out.println(bb.get());
//        System.out.println(bb.get());
//        bb.rewind();                                                                    // т.к. мы удалили 1 и 2, остаются тока 3 и 4
//        System.out.println(bb.get());
//        System.out.println(bb.get());

        try (RandomAccessFile ras = new RandomAccessFile("Example.txt", "rw")){
            FileChannel fc = ras.getChannel();
            ByteBuffer bb2 = ByteBuffer.allocate(4);
            while (fc.read(bb2) != -1){
                bb2.flip();
                while (bb2.hasRemaining()) System.out.print((char)bb2.get());
                bb2.clear();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
