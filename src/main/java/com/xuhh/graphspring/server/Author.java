package com.xuhh.graphspring.server;

import java.util.Arrays;
import java.util.List;

public record Author(String id, String firstName, String lastName) {
    private static final List<Author> AUTHOR_LIST = Arrays.asList(
            new Author("author-1", "Joshua", "Bloch"),
            new Author("author-2", "Douglas", "Adams"),
            new Author("author-3", "Bill", "Bryson")
    );

    public static Author getAuthorById(String id) {
        return AUTHOR_LIST.stream().filter(author -> author.id().equals(id)).findFirst().orElse(null);
    }
}
