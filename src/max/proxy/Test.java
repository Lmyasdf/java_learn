package max.proxy;

public class Test {
    static void main(String[] args) {
        Star star = new Star("章若楠");

        //创建代理对象
        StarService proxy = ProxyUtil.createProxy(star);
        proxy.sing("《北京欢迎你》");
        System.out.println(proxy.dance());
    }
}
