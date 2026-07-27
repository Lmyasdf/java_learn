package collection.example;

import java.util.*;

public class Room {
    //准备好54张牌
    private List<Card> cards = new ArrayList<>();
    //初始化牌
    //利用实例代码块初始化cards数组
    {
        String[] sizes = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] colors = {"♦️","♣️","♠️","♥️"};
        for(String size: sizes){
            for(String color: colors){
                cards.add(new Card(size,color));
            }
        }
        Collections.addAll(cards,new Card("小王",""),new Card("大王",""));
    }

    public void start(){
        System.out.println("新牌是：" + cards);
        Collections.shuffle(cards);
        System.out.println("洗牌后：" + cards);

        //发牌
        Map<String,List<Card>> players = new HashMap<>();
        List<Card> lmy = new ArrayList<>();
        List<Card> car = new ArrayList<>();
        List<Card> sbh = new ArrayList<>();
        for(int i=0;i<cards.size()-3;i++){
            Card c = cards.get(i);
            if(i%3==0){
                lmy.add(c);
            }else if(i%3==1){
                car.add(c);
            }else{
                sbh.add(c);
            }
        }
        players.put("lmy",lmy);
        players.put("car",car);
        players.put("sbh",sbh);

        //三张底牌
        List<Card> bottom = cards.subList(cards.size()-3,cards.size());

        //随机一个地主，把底牌给他
        String[] s = {"lmy","car","sbh"};
        String dealer = s[new Random().nextInt(s.length)];
        players.get(dealer).addAll(bottom);
        System.out.println(dealer + "是地主");

        //对牌排序并打印牌
        for(Map.Entry<String,List<Card>> m : players.entrySet()){
            Collections.sort(m.getValue(),(c1,c2) -> Card.sizes.get(c2.getSize()) - Card.sizes.get(c1.getSize()));
            String name  = m.getKey();
            List<Card> c = m.getValue();
            System.out.println(name + "的牌是：" + c);
        }
    }


}