package com.example.bookstoredemo.controller;


import com.example.bookstoredemo.dao.BookDao;
import com.example.bookstoredemo.entity.Book;
import com.example.bookstoredemo.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AccountController {
    @Autowired
    private BookDao bookDao;
    @Autowired
    private CartService cartService;

    @RequestMapping("/login")
    public String login(){
        //cartService.clearCart();
        return "login";
    }
    @GetMapping({"/","/home"})
    public String home(){
        return "index";
    }

    @ModelAttribute("books")
    public List<Book> listBooks(){
        return bookDao.findAll();
    }




}
