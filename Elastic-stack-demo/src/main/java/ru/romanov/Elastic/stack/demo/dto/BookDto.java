package ru.romanov.Elastic.stack.demo.dto;


import lombok.Data;

@Data
public class BookDto {
    private String name;
    private String summary;
    private Integer price;
}
