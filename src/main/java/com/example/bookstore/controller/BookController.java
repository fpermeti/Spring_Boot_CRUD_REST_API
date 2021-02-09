package com.example.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;

import com.example.bookstore.exception.ResourceNotFoundException;
import com.example.bookstore.model.Book;
import com.example.bookstore.repository.BookRepository;

@RestController
@RequestMapping("/api")
public class BookController {

	@Autowired
	private BookRepository bookRepository;

	@GetMapping("/books")
	public List<Book> getAllBook() {

		return this.bookRepository.findAll();
	}

	@GetMapping("/books/{id}")
	@ResponseBody
	public Book getBookById(@PathVariable("id") Long id) throws ResourceNotFoundException {

		return this.bookRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("id = " + id + " does not exit"));

	}

	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	@PostMapping("/books")
	public void createBook(@Valid @RequestBody Book book) {

		this.bookRepository.save(book);

		//return this.bookRepository.findAll();
	}

	@ResponseStatus(HttpStatus.OK)
	@PutMapping("/books/{id}")
	public void updateBook(@PathVariable("id") Long id, @Valid @RequestBody Book currentBook)
			throws ResourceNotFoundException {

		Book updatedBook = this.bookRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("id = " + id + " does not exit"));

		updatedBook.setTitle(currentBook.getTitle());
		updatedBook.setAuthor(currentBook.getAuthor());
		updatedBook.setPrice(currentBook.getPrice());

		this.bookRepository.save(updatedBook);

		//return this.bookRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("id = " + id + " does not exit"));

	}

	@ResponseStatus(HttpStatus.OK)
	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable("id") Long id) throws ResourceNotFoundException {
		Book book = this.bookRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("id = " + id + " does not exit"));

		this.bookRepository.delete(book);

		//return this.bookRepository.findAll();

	}

}
