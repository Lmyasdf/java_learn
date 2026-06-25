package oop.movie;

public class Movie {
    private String name;
    private String actor;
    private int id;
    private double price;
    //无参构造器
    public Movie(){

    }
    //有参构造器
    public Movie(String name, String actor, int id, double price){
        this.name = name;
        this.actor = actor;
        this.id = id;
        this.price = price;
    }

    //getter方法
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public String getActor(){
        return actor;
    }
    public double getPrice(){
        return price;
    }

    //setter方法
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setActor(String actor) {
        this.actor = actor;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}
