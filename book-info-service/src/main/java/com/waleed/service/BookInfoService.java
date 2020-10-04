package com.waleed.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.waleed.dto.Book;

@Service
public class BookInfoService {
	
	
	@Autowired
	RestTemplate template;

	public Book getBookById(Integer id){
		return new Book(56, "Java - Complete Reference");
	}

	public List<Object> getEntireBookCatalog(Integer userId) {
//		return template.getForObject("http://localhost:8081/catalog/789", String.class);
		
//		OR
		
		Object[] dataFromAnotherService = 
	template.getForObject("http://localhost:8081/catalog/789", Object[].class);

		return Arrays.asList(dataFromAnotherService);
	}
	
	public void addBook(@RequestBody Book book)
	{
		String urlToHitForAdd = "http://localhost:8081/books/";
		// Book book = new Book("sameer","125");
		Book result = template.postForObject(urlToHitForAdd,book,Book.class);
		System.out.println(result);
	}
	
	
	
}
