package oop.example.paydemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data// 自动生成getter和setter方法和toString方法和无参构造方法
@AllArgsConstructor// 自动生成全参构造方法
@NoArgsConstructor// 自动生成无参构造方法
public class Card {
    private String carNumber;
    private String name;
    private String phoneNumber;
    private double money;

    public void consume(double money){
        this.money -= money;
    }

    public void recharge(double money){
        this.money += money;
    }

}

