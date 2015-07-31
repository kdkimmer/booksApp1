package com.bookusecase.main;

import com.bookusecase.dao.BookDAO;
import com.bookusecase.dao.BookDAOImpl;
import com.bookusecase.model.Book;

import java.util.List;

/**
 * Created by kim on 7/28/2015.
 */
public class Main {
    public static void main (){

        BookDAO bookDao = new BookDAOImpl();

        List<Book> list  = bookDao.findAllBooks();
        for(Book book : list){
            System.out.println(book.getBookTitle());
            System.out.println(book.getAuthors());
            System.out.println(book.getPublisher());
        }

    }
}
