package com.xuhh.graphspring.server;

import java.util.Arrays;
import java.util.List;

public record Book(String id, String name, Integer pageCount, String authorId) {
    private static final List<Book> BOOK_LIST = Arrays.asList(
            new Book("book-1", "Effective Java", 416, "author-1"),
            new Book("book-2", "Hitchhiker's Guide to the Galaxy", 208, "author-2"),
            new Book("book-3", "Down Under", 436, "author-3")
    );

    public static Book getBookById(String id) {
        return BOOK_LIST.stream().filter(book -> book.id.equals(id)).findFirst().orElse(null);
    }
}
