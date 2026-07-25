package collection.list;

import java.util.LinkedList;

public class ListDemo2 {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.addLast("a");
        queue.addLast("b");
        queue.addLast("c");
        System.out.println(queue);

        queue.removeFirst();
        System.out.println(queue);

        System.out.println("-------------------------");
        //栈
        LinkedList<String> stack = new LinkedList<>();
        stack.push("第一个");//等于addFirst
        stack.push("第二个");
        stack.push("第三个");
        System.out.println(stack);

        stack.pop();//等于removeFirst
        System.out.println(stack);
    }

}
