package com.example;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.springdatajparelationships.repository.BookRepository;
import com.example.springdatajparelationships.repository.PhotoRepository;
import com.example.springjparelationships.entities.Book;
import com.example.springjparelationships.entities.Photo;



@SpringBootApplication
public class SpringJpaRelationshipsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaRelationshipsApplication.class, args);
		
	}
	
	  @Bean
	  public CommandLineRunner demo(BookRepository repository, PhotoRepository pr) {
	    return (args) -> {
	      // save a few customers
	     
	       Book b = repository.save(Book.builder().title("The Illiad").build());
	       Photo p = pr.save(Photo.builder().book(b).build());
	      
	    };
	  }

}
