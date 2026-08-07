package max.proxy;

public class Star implements StarService {
    private String name;

    public Star() {
    }
    public Star(String name) {
        this.name = name;
    }

    @Override
    public void sing(String name){
        System.out.println(this.name+"在唱:"+name);
    }
    @Override
    public String dance() {
        return this.name+"在跳舞";
    }

}
