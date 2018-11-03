package com.in28Minutes.spring.basics.springbootin10steps.controller;

import com.in28Minutes.spring.basics.springbootin10steps.model.Books;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {

    @GetMapping("/books")
    public List<Books> getAllBooks(){
        return Arrays.asList(new Books(1L, "Master of Spring", "Naveed Farouq"));
    }
}
