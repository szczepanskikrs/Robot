package com.scrappy.database.services;

import com.scrappy.database.dto.BookDTO;
import com.scrappy.database.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface BookService {
    Page<BookDTO> findAll(Pageable pageable);

    List<BookDTO> findByTitle(String title);

    List<BookDTO> test();

    void save(Book book);
    
}
