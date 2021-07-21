package com.imortal.service.imp;

import com.imortal.dao.BookMapper;
import com.imortal.model.Book;
import com.imortal.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName BookServiceImp
 * @Description
 * @Author 一人树杨
 * @Date 2021/7/10 23:28
 **/

@Service
public class BookServiceImp implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int deleteBook(int bookId) {
        return bookMapper.deleteBook(bookId);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public Book queryByBookId(int bookId) {
        return bookMapper.queryByBookId(bookId);
    }

    @Override
    public List<Book> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
