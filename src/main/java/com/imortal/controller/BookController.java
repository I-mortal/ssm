package com.imortal.controller;

import com.imortal.model.Book;
import com.imortal.service.imp.BookServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName BookController
 * @Description
 * @Author 一人树杨
 * @Date 2021/7/22 21:31
 **/

@Controller
public class BookController {

    @Autowired
    private BookServiceImp bookServiceImp;

    @RequestMapping("/books")
    public void QueryAllBook() {
        List<Book> books = bookServiceImp.queryAllBook();
        for(Book book : books) {
            System.out.println(book);
        }
    }

}
