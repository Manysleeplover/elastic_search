package ru.romanov.Elastic.stack.demo.mapstruct;

import org.mapstruct.Mapper;
import ru.romanov.Elastic.stack.demo.docs.BookDoc;
import ru.romanov.Elastic.stack.demo.dto.BookDto;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookDoc bookDoc(BookDto bookDto);
    BookDto bookDto(BookDoc bookDoc);
}
