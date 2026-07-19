package oop.example.paydemo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Card c1 = new SilverCard("123456","张三","13800000000",2000);
        Card c2 = new GoldCard("229133","李四","13800000001",5000);
        pay(c2);
    }

    //多态，这个pay可以接金卡或银卡
    public static void pay(Card c){
        System.out.println("请刷卡，请您输入当前消费金额：");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        c.consume(money);
        System.out.println("您的余额为："+c.getMoney());
    }
}
