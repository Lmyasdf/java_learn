package thread.safe;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account("123456", 1000);
        new DrawThread("小明",acc).start();
        new DrawThread("小红",acc).start();
    }
}
