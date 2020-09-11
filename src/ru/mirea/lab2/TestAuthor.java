package ru.mirea.lab2;
import java.lang.*;
public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Dima","mail",'m');
        a1.setEmail("keks");
        System.out.print(a1);
    }
}
