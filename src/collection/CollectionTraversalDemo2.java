package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTraversalDemo2 {
    public static void main(String[] args) {
        //认识并发修改异常问题，搞清楚每种遍历的区别
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("宁夏枸杞");
        list.add("红枸杞");
        list.add("特级枸杞");
        list.add("决明子");
        //当前数组：[java,黑枸杞,人字拖,宁夏枸杞,红枸杞,特级枸杞,决明子]

        //删除全部枸杞
        //问题：删除时候，索引会跳跃，导致删除不全
        /*for(int i=0;i<list.size();i++){
            if(list.get(i).contains("枸杞")){
                list.remove(list.get(i));
            }
        }
        System.out.println(list);//没删全*/

        //解决方法：没删一步i-- , 反着遍历 ，
        //迭代器删
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            if(it.next().contains("枸杞")){
                it.remove();
            }
        }
        System.out.println(list);

    }
}
