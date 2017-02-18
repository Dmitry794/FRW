import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        File f = new File("test_tree_2_progrees.html");
//        File f = new File("test_frw.html");
        long size = f.length();

        RandomAccessFile accessFile = new RandomAccessFile(f, "rw");
        accessFile.readLine();

        accessFile.write("var size = 8524839;\n".getBytes());
        accessFile.close();

        long stopTime = System.currentTimeMillis();

        System.out.println("time, ms: " + String.valueOf((stopTime-startTime)));
    }
}
