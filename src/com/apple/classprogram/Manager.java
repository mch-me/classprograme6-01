package com.apple.classprogram;

public class Manager {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary("mch",89,"2019.11.09");
        int pages = dictionary.pages;

        display(String.valueOf(pages));
        display(dictionary.getName());

        Book book = new Book("mch002",89);
        Book bookDictionary = new Dictionary(book,"2019.11.09");
        display(book.getName());
        display(bookDictionary.getName());

    }
    public static void display(String content){
        System.out.println(content);
    }
}
