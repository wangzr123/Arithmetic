import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GoFile {
    //字符串写入文件  这里主要是题目写入文件
    public static void StringToFile(String s){

        try {
            File file = new File("Exercises.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            //文件的续写
            FileWriter fw = new FileWriter(file,true);
            //写入换行
            fw.write("\r\n");//

            fw.write(s);

            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //结果写入文件
    public static void ResultToFile(String s){
        try {
            File file = new File("Answers.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            //文件的续写
            FileWriter fw = new FileWriter(file,true);
            //写入换行
            fw.write("\r\n");

            fw.write(s);

            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
