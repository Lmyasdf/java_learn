package max.annotation;
@A(name = "张三", address = {"北京", "上海"})
@B("hello")
public class MyAnnotation {
    //@A  会报错，因为Target规定A只能注解类和字段
    public void test() {
        System.out.println("test");
    }
    @A(name = "李四", address = {"北京", "上海"})
    private String name;

}
