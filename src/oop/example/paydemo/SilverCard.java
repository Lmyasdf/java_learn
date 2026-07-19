package oop.example.paydemo;

public class SilverCard extends Card{
    // 重写父类的consume方法
    @Override
    public void consume(double money){
        if(getMoney() < money*0.9) {
            System.out.println("您的余额不足,当前余额为："+getMoney());
            return;
        }

        setMoney(getMoney() - money*0.9);
        System.out.println("您消费了"+money*0.9+"元");
    }

    public SilverCard(String carNumber,String name,String phoneNumber,double money){
        super(carNumber,name,phoneNumber,money);
    }
}
