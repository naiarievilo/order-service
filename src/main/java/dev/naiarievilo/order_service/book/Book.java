package dev.naiarievilo.order_service.book;

public record Book(
    String isbn,
    String title,
    String author,
    Double price
) { }
