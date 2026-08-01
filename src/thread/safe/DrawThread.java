package thread.safe;

public class DrawThread extends Thread {
    private Account acc;//记住线程对象要处理的对象

    @Override
    public void run() {
        acc.drawMoney(1000);
    }
    public DrawThread(String name, Account acc) {
        this.acc = acc;
        super(name);
    }

}
