package oop.movie;

import java.util.Scanner;

public class MovieOperator {
    private Movie[] movies;
    public MovieOperator(){

    }

    public MovieOperator(Movie[] movies){
        this.movies = movies;
    }

    public void printMovies(){
        System.out.println("电影信息如下：");
        for(int i=0;i<movies.length;i++){
            System.out.println(movies[i].getName() + '\t' + movies[i].getActor() + '\t' + movies[i].getId() + '\t' + movies[i].getPrice());
            System.out.println('\n');
        }
    }

    public void searchMovies(){
        System.out.println("请输入要查询的电影ID：");
        Scanner s = new Scanner(System.in);
        int id = s.nextInt();
        for(int i=0;i<movies.length;i++){
            if(movies[i].getId() == id){
                System.out.println("电影信息如下：");
                System.out.println(movies[i].getName() + '\t' + movies[i].getActor() + '\t' + movies[i].getId() + '\t' + movies[i].getPrice());
                System.out.println('\n');
                return;
            }
        }
        System.out.println("未找到该电影");
    }
}
