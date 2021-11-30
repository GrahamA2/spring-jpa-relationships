package com.example.springjparelationships.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "photo")
@AllArgsConstructor
@Builder
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photo_id")
    private Long id;

    private String urlSmall;
    private String urlMedium;
    private String urlLarge;

    @OneToOne//(mappedBy = "photo")
    @JoinColumn(name = "book_id")
    private Book book;
}