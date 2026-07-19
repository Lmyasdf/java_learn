package oop.example.paydemo;
public class GoldCard extends Card{
    // 重写父类的consume方法
    @Override
    public void consume(double money){
        if(getMoney() < money*0.8) {
            System.out.println("您的余额不足,当前余额为："+getMoney());
            return;
        }

        setMoney(getMoney() - money*0.8);
        if(money*0.8 >= 200){
            System.out.println("本次洗车免费");
        }
        else {
            System.out.println("您消费了"+money*0.8+"元");
        }
    }

    public GoldCard(String carNumber,String name,String phoneNumber,double money){
        super(carNumber,name,phoneNumber,money);
    }
}
