package thread;

public class SleepDemo {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);//线程休眠1秒
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
