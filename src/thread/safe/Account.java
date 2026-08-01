package thread.safe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String cardId;
    private double money;
    private final Lock lk = new ReentrantLock();//保护锁对象

    public void drawMoney(double money) {
        String name = Thread.currentThread().getName();
        lk.lock();//上锁
        try {
            if (this.money >= money) {
                System.out.println(name + " 取钱成功");
                this.money -= money;

            } else {
                System.out.println(name + " 取钱失败");
            }
        } finally {
            lk.unlock();//解锁
        }

    }
}
