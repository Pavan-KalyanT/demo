package com.target.ready.library.system.service.LibrarySystemService.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name="Book")
public class Book {
    @Id
    private int bookId;
    private String bookName;
    private String bookDescription;
    private String categoryName;
    private String authorName;
    private int publicationYear;

}
