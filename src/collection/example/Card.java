package collection.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private String size;
    private String color;
    public static Map<String,Integer> sizes = new HashMap<>();
    static{
        sizes.put("3",1);
        sizes.put("4",2);
        sizes.put("5",3);
        sizes.put("6",4);
        sizes.put("7",5);
        sizes.put("8",6);
        sizes.put("9",7);
        sizes.put("10",8);
        sizes.put("J",9);
        sizes.put("Q",10);
        sizes.put("K",11);
        sizes.put("A",12);
        sizes.put("2", 13);
        sizes.put("小王", 14);
        sizes.put("大王", 15);
    }

    @Override
    public String toString() {
        return size + color;
    }
}
