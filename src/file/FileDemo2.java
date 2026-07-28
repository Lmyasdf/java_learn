package file;

import java.io.File;
import java.util.Scanner;

//递归查找文件
public class FileDemo2 {
    public static final String FILENAME = "dlei01.txt";//目标文件
    public static final String DIR = "D:\\JavaLearn";//目标目录
    public static void main(String[] args){
//        File dir = new File(DIR);
//        File file = new File(FILENAME);
//        search(dir,file);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的文件名：（输入待查找文件名称）");
        String filename = sc.nextLine();
        System.out.println("请规定再哪个文件夹中查找：（输入查找文件夹路径）");
        String dirpath = sc.nextLine();
        if(dirpath.equals("C"))dirpath = "C:\\";
        else if (dirpath.equals("D"))dirpath = "D:\\";
        File dir = new File(dirpath);
        File file = new File(filename);
        search(dir,file);
    }

    public static void search(File dir, File filename){
        if(dir == null || !dir.exists() || dir.isFile()){
            return;
        }
        File[] files = dir.listFiles();
        if(files != null && files.length > 0){
            for(File f: files){
                if(f.isFile() && f.getName().equals(filename.getName())){
                    System.out.println("目标文件路径：" + f.getAbsolutePath());
                    return;
                }
                else search(f,filename);
            }
        }
    }
}
