package SchildtFullGuide.JavaLang;

import java.io.*;

public class OtherAppsInteracting {
    public static void main(String[] args) throws IOException, InterruptedException {
        String pythonPass = "C:/Users/megas/AppData/Local/Programs/Python/Python312/python.exe";                        // путь к компилятору питона
        String programPass = "C:/Users/megas/OneDrive/Рабочий стол/Hello World.py";                                     // путь к хелло ворлду, выводящемуся 5 раз
        Process process = Runtime.getRuntime().exec(new String[]{pythonPass, programPass});                             /* метод exec() у объекта Runtime,
                                                                                                                        возвращаемого синглтоном getRuntime(),
                                                                                                                        вводит в командную строку через пробел
                                                                                                                        путь к компилятору и путь к программе,
                                                                                                                        что приводит к ее запуску через пайтон.
                                                                                                                        также метод exec() возвращает процесс,
                                                                                                                        что позволяет создать на него ссылку */
        process.waitFor();                                                                                              // подождать выполнения программы
        InputStream is  = process.getInputStream();                                                                     /* инпут стрим получает в себя весь вывод
                                                                                                                        в консоль от программы. */
        BufferedReader br = new BufferedReader(new InputStreamReader(is));                                              // для построчного чтения
        String s;
        do {                                                                                                            // цикл вывода всех строк
           s = br.readLine();
           if (s != null) System.out.println(s);
        }
        while (s != null);
    }
}
