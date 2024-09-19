package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieClassTest {

    @Test
    public void findAllMovie() {
        MovieClass manager = new MovieClass();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
//        manager.addMovie( "Отель Белград" );
//        manager.addMovie( "Джентельмены" );
//        manager.addMovie( "Человек невидимка" );
//        manager.addMovie( "Тролли.Мировой тур" );
//        manager.addMovie( "Номер один" );

        String[] expected = {"Бладшот", "Вперед"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMovie() {
        MovieClass manager = new MovieClass();

//        manager.addMovie( "Бладшот" );
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек невидимка");
        manager.addMovie("Тролли.Мировой тур");
        manager.addMovie("Номер один");

        String[] expected = {"Номер один", "Тролли.Мировой тур", "Человек невидимка", "Джентельмены", "Отель Белград"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMovieInLimit() {
        MovieClass manager = new MovieClass(4);

//        manager.addMovie( "Бладшот" );
//        manager.addMovie("Вперед");
//        manager.addMovie("Отель Белград");
//        manager.addMovie("Джентельмены");
        manager.addMovie("Человек невидимка");
        manager.addMovie("Тролли.Мировой тур");
        manager.addMovie("Номер один");

        String[] expected = {"Номер один", "Тролли.Мировой тур", "Человек невидимка"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
