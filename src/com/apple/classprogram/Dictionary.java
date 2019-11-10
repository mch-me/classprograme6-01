package com.apple.classprogram;

public class Dictionary extends Book {
    private String bookData;

    public Dictionary(Book book, String bookData) {
        super(book.getName(), book.getPages());
        this.bookData = bookData;
    }

    public Dictionary(String name, int pages, String bookData) {
        super(name, pages);
        this.bookData = bookData;
    }

    public String getBookData() {
        return bookData;
    }

    public void setBookData(String bookData) {
        this.bookData = bookData;
    }
}
