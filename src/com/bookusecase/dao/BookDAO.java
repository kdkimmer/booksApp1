package com.bookusecase.dao;

import com.bookusecase.model.Book;
import com.bookusecase.model.Category;
import java.util.List;

/**
 * Created by kim on 7/27/2015.
 */
public interface BookDAO {

    public List<Book> findAllBooks();

    public List<Category> findAllCategories();

    public List<Book> searchBooksByKeyword(String keyWord);
}
