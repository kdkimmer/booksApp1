package com.bookusecase.service;


import com.bookusecase.model.Book;
import com.bookusecase.model.Category;

import java.util.List;

/**
 * Created by kim on 7/27/2015.
 */
public interface BookService {
    public List<Book> findAll();
    public List<Category> findAllCategories();

    public List<Book> searchBooksByKeyword(String keyWord);
}
