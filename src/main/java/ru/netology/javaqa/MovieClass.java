package ru.netology.javaqa;

public class MovieClass {

    private String[] movies = new String[0];
    private int limit;

    public MovieClass() {
        this.limit = 5;
    }

    public MovieClass(int limit) {
        this.limit = limit;
    }

    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i = i + 1) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i = i + 1) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}
