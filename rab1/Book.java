package com.rab1;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty=0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Book(Author[] authors) {
        this.authors = authors;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[" +
                "name='" + name + '\'' +
                ", authors={" + Arrays.toString(authors) + "}"+
                ", price=" + price +
                ", qty=" + qty +
                ']';
    }

    public String getAuthorNames(){
       // return Arrays.toString(authors);
        String a="";
        for (int i=0;i<authors.length;i++){
            if(i==authors.length-1){
                a+=authors[i].getName();
            }else a+=authors[i].getName()+",";
        }
        return a;
    }
}
