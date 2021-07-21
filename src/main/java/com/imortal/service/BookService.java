package com.imortal.service;

import com.imortal.model.Book;

import java.util.List;

public interface BookService {
    int addBook(Book book);
    int deleteBook(int bookId);
    int updateBook(Book book);
    Book queryByBookId(int bookId);
    List<Book> queryAllBook();
}
