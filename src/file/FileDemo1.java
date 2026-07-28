package file;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) throws Exception{
        //一、创建File对象
        //1.创建File对象
        // File f = new File(String pathname)
        File f1 = new File("D:/JavaLearn/src/file/FileDemo1.java");
        System.out.println(f1.length());

        //2.判断是否是文件
        System.out.println(f1.isFile());

        //3.判断是否是目录
        System.out.println(f1.isDirectory());

        System.out.println(f1.getName());

        //二、使用相对路径可以定位文件
        //可以使用相对路径定位文件，只要带盘符的称之为绝对路径
        //相对路径：默认是到idea工程下寻找文件，一般用来找工程下的项目文件
        File f2 = new File("JavaLearn\\src\\file\\dlei01.txt");
        System.out.println(f2.length());


        //三、创建对象代表不存在的文件路径
        File f3 = new File("D:\\JavaLearn\\src\\file\\dlei02.txt");
        System.out.println(f3.exists());
        f3.createNewFile();
        System.out.println(f3.exists());

        //四、创建对象代表存在的目录路径
        File f4 = new File("D:\\aaa");
        System.out.println(f4.exists());
        f4.mkdirs();//mkdir只能创建一级文件夹,mkdirs可以创建多级文件夹
        System.out.println(f4.exists());

        //五、删除文件或目录(只能删除空文件夹)
        System.out.println(f4.delete() && f3.delete());

        //六、可以获取某个目录下的全部一级文件名称
        File f5 = new File("D:\\JavaLearn\\src\\collection");
        String[] names = f5.list();
        for(String name : names){
            System.out.println(name);
        }

        //获取绝对路径
        File[] files = f5.listFiles();
        for(File file : files){
            System.out.println(file.getAbsoluteFile());
            //System.out.println(file.getAbsolutePath());前者返回file对象，后者字符串
        }
    }
}
