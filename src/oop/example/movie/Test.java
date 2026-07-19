package oop.example.movie;

public class Test {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];
        movies[0] = new Movie("星际穿越", "莱恩·卡德", 1, 100);
        movies[1] = new Movie("速度与激情", "杰米·费尔曼", 2, 100);
        movies[2] = new Movie("叶问","甄子丹",3,100);

        //创建电影操作对象，负责电影的数据业务操作
        MovieOperator mo = new MovieOperator(movies);
        mo.printMovies();
        mo.searchMovies();
    }
}
