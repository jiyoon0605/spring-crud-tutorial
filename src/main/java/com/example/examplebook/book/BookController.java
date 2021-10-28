package com.example.examplebook.book;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/book")
    public BookEntity createBook(@RequestBody BookEntity bookEntity) {
        BookEntity created = bookRepository.save(bookEntity);
        return created;
    }

    @GetMapping("/book")
    public List<BookEntity> listAllBooks() {
        List<BookEntity> list = new ArrayList<>();
        Iterable<BookEntity> iterable = bookRepository.findAll();
        for (BookEntity bookEntity : iterable) {
            list.add(bookEntity);
        }
        return list;
    }

    @PutMapping("/book/{bookId}")
    public BookEntity updateBook(@PathVariable("bookId") UUID bookId, @RequestBody BookEntity bookEntity) {
        bookEntity.setId(bookId);
        BookEntity updated = bookRepository.save(bookEntity);
        return updated;
    }

    @DeleteMapping("/book/{bookId}")
    public void deleteBook(@PathVariable("bookId") UUID bookId) {
        bookRepository.deleteById(bookId);
    }

}
