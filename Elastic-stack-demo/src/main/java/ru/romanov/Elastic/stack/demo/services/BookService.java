package ru.romanov.Elastic.stack.demo.services;

import org.springframework.stereotype.Service;
import ru.romanov.Elastic.stack.demo.docs.BookDoc;
import ru.romanov.Elastic.stack.demo.dto.BookDto;
import ru.romanov.Elastic.stack.demo.mapstruct.BookMapper;
import ru.romanov.Elastic.stack.demo.repository.BookRepository;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    private final BookMapper bookMapper;

    public BookService(BookRepository bookRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    public List<BookDto> getAllBooks() {
        return bookRepository.findAll().stream().map(bookMapper::bookDto).toList();
    }

    public BookDto createNewBook(BookDto bookDto) {
        BookDoc bookDoc = bookMapper.bookDoc(bookDto);
        return bookMapper.bookDto(bookRepository.save(bookDoc));
    }
}
