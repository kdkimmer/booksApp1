package com.bookusecase.service;

import com.bookusecase.model.Book;
import com.bookusecase.model.Category;

import java.util.List;

/**
 * Created by kim on 7/27/2015.
 */
public class BookServiceImpl implements BookService {
    @Override
    public List<Book> findAll() {

        // call dao and return the data back to the presentation tier
        return null;
    }

    @Override
    public List<Category> findAllCategories() {
        return null;
    }

    @Override
    public List<Book> searchBooksByKeyword(String keyWord) {
        return null;
    }
}
