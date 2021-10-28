package com.example.examplebook.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class BookRentalController {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookRentalRepository bookRentalRepository;

    @Autowired
    private BookRentalCustomRepository bookRentalCustomRepository;

    @PostMapping("/book/{bookId}/rental")
    public BookRentalEntity createBookRental(@PathVariable("bookId") UUID bookId,
                                             @RequestBody BookRentalEntity bookRentalEntity) {

        BookRentalEntity created = null;

        BookEntity bookEntity = bookRepository.findById(bookId).get();
        if(bookEntity != null) {
            bookRentalEntity.setBookEntity(bookEntity);
            created = bookRentalRepository.save(bookRentalEntity);
        }

        return created;
    }

    @GetMapping("/book/{bookId}/rental")
    public List<BookRentalEntity> listBookRentalByBookId(@PathVariable("bookId") UUID bookId) {
        return bookRentalCustomRepository.listBookRentalByBookId(bookId);
    }

    @PutMapping("/book/{bookId}/rental/{rentalId}/return")
    public BookRentalEntity returnBookRental(@PathVariable("rentalId") UUID rentalId) {
        BookRentalEntity updated = null;

        BookRentalEntity bookRentalEntity = bookRentalRepository.findById(rentalId).get();
        if(bookRentalEntity != null) {
            bookRentalEntity.setReturned(true);
            updated = bookRentalRepository.save(bookRentalEntity);
        }

        return updated;
    }
}
