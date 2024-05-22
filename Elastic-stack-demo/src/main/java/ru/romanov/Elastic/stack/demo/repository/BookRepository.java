package ru.romanov.Elastic.stack.demo.repository;

import org.springframework.data.elasticsearch.annotations.Highlight;
import org.springframework.data.elasticsearch.annotations.HighlightField;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import ru.romanov.Elastic.stack.demo.docs.BookDoc;

import java.util.List;


public interface BookRepository extends ElasticsearchRepository<BookDoc, String> {
    @Highlight(fields = {
            @HighlightField(name = "name"),
            @HighlightField(name = "summary")
    })
    SearchHits<BookDoc> findByNameOrSummary(String text, String summary);

    List<BookDoc> findAll();
}
