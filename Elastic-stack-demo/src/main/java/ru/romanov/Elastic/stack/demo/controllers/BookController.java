package ru.romanov.Elastic.stack.demo.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.romanov.Elastic.stack.demo.dto.BookDto;
import ru.romanov.Elastic.stack.demo.services.BookService;

import java.util.List;

@RestController("/library")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<BookDto> getBooks(){
        return bookService.getAllBooks();
    }

    @PostMapping("/book")
    public ResponseEntity<BookDto> createNewBook(@RequestBody BookDto bookDto){
        BookDto newBook = bookService.createNewBook(bookDto);
        return ResponseEntity.ok(newBook);
    }
}
