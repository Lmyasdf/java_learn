package max.test;

public class StringUtil {
    public static void printNumber(String name){
        if(name == null){
            return;
        }
        System.out.println("名字长度是：" + name.length());

    }

    //求字符串最大索引
    public static int getMaxIndex(String data){
        if(data == null || data.equals("")){
            return -1;
        }
        return data.length() - 1;
    }
}
