package com.bookstore.BookstoreAPI.dtos;

public class BookDTO {
    private Long id;
    private String title;
    private String authorName;
    private double price;
    private String isbn;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getAuthorName() { return authorName; }
    public void setAuthorName(String authorName) { this.authorName = authorName; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
}

