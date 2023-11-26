package exceptionIO;

import java.io.File;

public class fileHandling {
    public static void main(String[] args) throws Exception{
        File f = new File("C:/Users/HP/Desktop/java");
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.getName());
        System.out.println(f.getPath());

        File list[] = f.listFiles();
        for (File file : list) {
            System.out.print(file.getName()+"     ");
            System.out.println(file);
        }
        System.out.println(f.getClass());
        System.out.println(f.length());
    }
}
