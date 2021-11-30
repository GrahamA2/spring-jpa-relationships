package com.example.springjparelationships.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Data
@Entity
@Table(name = "book")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long id;

    @Column(nullable = false)
    private String title;

    private Long isbn;
    private Integer totalPages;
    private Double rating;
    private Date publishedDate;
    
    //Used to create a bi-directionaly on to one relationship
    //mappedBy is used on  the inverse of the relationship, and the owner resides in the "other" entity
    //the named property (book) is the name of the property on the other side of the relationship
    //the inverse relationship is not included in the db
    //@OneToOne(mappedBy = "book", cascade = CascadeType.ALL)
    //@JoinColumn(name = "photo_id")
    //private Photo photo;
}