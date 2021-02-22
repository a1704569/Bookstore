package com.example.Bookstore.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Bookstore.domain.Book;

@Controller
public class BookController {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String getBooks(Model model) {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("Testi", "Testaaja", 1993, 000-01, 19.93));
		model.addAttribute("books", books);
		return "booklist";
		
	}
}
