import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GoFile {
    //
    public static void StringToFile(String s){

        try {
            File file = new File("Exercises.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            //文件的续写
            FileWriter fw = new FileWriter(file,true);
            //写入换行
            fw.write("\r\n");//Windows平台下用\r\n，Linux/Unix平台下用\n

            fw.write(s);

            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //
    public static void ResultToFile(String s){
        try {
            File file = new File("Answers.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            //文件的续写
            FileWriter fw = new FileWriter(file,true);
            //写入换行
            fw.write("\r\n");//Windows平台下用\r\n，Linux/Unix平台下用\n

            fw.write(s);

            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
