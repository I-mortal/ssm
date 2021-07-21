package com.imortal.dao;

import com.imortal.model.Book;
import java.util.List;

public interface BookMapper {

    int addBook(Book book);
    int deleteBook(int bookId);
    int updateBook(Book book);
    Book queryByBookId(int bookId);
    List<Book> queryAllBook();

}
